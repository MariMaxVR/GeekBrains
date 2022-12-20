import random
from aiogram import types
import model, view

# from bot import dp, bot



async def start_game(message: types.Message):
    await model.set_game()
    await view.start_game(message)
    player_name = message.from_user.first_name
    await model.set_player_name(player_name)
    game_start = random.randint(0, 1)
    if game_start:
        await view.player_take(message)
    else:
        await bot_turn(message)


async def bot_turn(message: types.Message): ###!!!
    take = await model.bot_take()
    await model.take_candys(take)
    player_name = await model.get_player_name()
    total_candys = await model.get_total_candys()
    if await model.get_total_candys() > 0:
        await view.print_info(message, 'Компьютер', take, total_candys, player_name)
    if await model.get_total_candys() <= 0:
        await view.print_winner(message, 'Компьютер')
        await model.set_game()


async def player_turn(message: types.Message): ###!!!
    game = await model.get_game_status()
    if game:
        take = message.text
        if take.isdigit():
            take = int(take)
            if take > 0 and take <= 28:
                await model.take_candys(take)
            else:
                await view.wrong_take(message)
                await player_turn() #message = text ?##################
        else:
            await view.wrong_number(message)
            await player_turn() #message = text ?##################

        player_name = await model.get_player_name()
        total_candys = await model.get_total_candys()
        if await model.get_total_candys() > 0:
            await view.print_info(message, player_name, take, total_candys, 'Компьютер')
            # await bot_turn(message)
        if await model.get_total_candys() <= 0:
            await view.print_winner(message, player_name)
            await model.set_game()
