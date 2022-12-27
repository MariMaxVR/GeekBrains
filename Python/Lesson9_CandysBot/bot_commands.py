import random
from aiogram import types
import model
import view


async def start_game(message: types.Message):
    await model.set_game()
    await view.start_game(message)
    await view.ask_game_mode(message)
    # await view.ask_total_candys(message)
    player_name = message.from_user.first_name
    await model.set_player_name(player_name)
    game_start = random.randint(0, 1)
    if game_start:
        await view.player_take(message)
    else:
        await bot_turn(message)


async def game_mode_hard(message: types.Message):
    await view.game_mode_hard(message)
    await model.set_game_mode(1)


async def game_mode_easy(message: types.Message):
    await view.game_mode_easy(message)
    await model.set_game_mode(0)


# async def candys_total(message: types.Message):
#     await view.ask_total_candys(message.answer)
#     set = message.text
#     # await model.set_total_candys(set)
#     print(set)


async def bot_turn(message: types.Message):
    take = await model.bot_take()
    await model.take_candys(take)
    player_name = await model.get_player_name()
    total_candys = await model.get_total_candys()
    if await model.get_total_candys() > 0:
        await view.print_info(message, 'Компьютер', take, total_candys, player_name)
    if await model.get_total_candys() <= 0:
        await view.print_winner(message, 'Компьютер')
        await model.set_game()


async def player_turn(message: types.Message):
    game = await model.get_game_status()
    player_name = await model.get_player_name()
    if game:
        take = message.text
        if take.isdigit():
            take = int(take)
            if take > 0 and take <= 28:
                await model.take_candys(take)
                if await model.get_total_candys() > 0:
                    total_candys = await model.get_total_candys()
                    await view.print_info(message, player_name, take, total_candys, 'Компьютер')
                    await bot_turn(message)
                if await model.get_total_candys() <= 0:
                    await view.print_winner(message, player_name)
                    await model.set_game()
            else:
                await view.wrong_take(message)
        else:
            await view.wrong_number(message)
