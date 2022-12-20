from bot import dp, bot
from aiogram import types
import model
import view
import random


async def start_game(message: types.Message):
    await model.set_game()
    await view.start_game(message)
    player_name = message.from_user.first_name
    await model.set_player_name(player_name)
    game_start = random.randint(1, 1)
    if game_start:
        await view.player_take(message)
    else:
        await bot_turn(message)


async def bot_turn(message: types.Message):
    take = await model.bot_take()
    await model.set_total_count(take)
    player_name = await model.get_player_name()
    total_count = await model.get_total_count()
    if await model.get_total_count() > 0:
        await view.table_info(message, 'Компьютер', take, total_count, player_name)
    if await model.get_total_count() <= 0:
        await view.win(message, 'Компьютер', take)
        await model.set_game()


async def player_turn(message: types.Message):
    game = await model.get_game()

    if game == True:
        take = message.text
        if take.isdigit():
            take = int(take)
            if (take <= 28) and (take > 0):
                await model.set_total_count(take)
            else:

                await view.wrong_take(message)
                await player_turn()

        else:

            await view.wrong_number(message)
            await player_turn()

        player_name = await model.get_player_name()
        total_count = await model.get_total_count()
        if await model.get_total_count() > 0:
            await view.table_info(message, player_name, take, total_count, 'Компьютер')
            await bot_turn(message)
        if await model.get_total_count() <= 0:
            await view.win(message, player_name, take)
            await model.set_game()
