from bot_config import dp, bot
from aiogram import types
import model
import view
import random


async def game_status(message: types.Message):
    await model.game_status()
    await view.start_bot(message)
    player_name = message.from_user.first_name
    await model.set_playername(player_name)

    game_start = random.randint(0, 1)
    if game_start:
        await view.player_take(message)
    else:
        await bot_take(message)


async def bot_take(message):
    take = await model.bot_take()
    await model.candys_take(take)
    player_name = await model.get_playername()
    candys = await model.get_candys()
    if await model.get_candys() > 0:
        await view.print_info(message, 'Компьютер', take, candys, player_name)
    if await model.get_candys() <= 0:
        await view.print_winner(message, 'Компьютер', take)
        await model.game_status()


async def player_take(message: types.Message):
    game = await model.get_gamestatus()
    if game == True:
        if message.text == '/start':
            return
        else:
            take = int(message.text)
        if (take <= 28) and (take > 0):
            await model.candys_take(take)
        else:
            await view.print_error(message)

        player_name = await model.get_playername()
        candys = await model.get_candys()
        if await model.get_candys() > 0:
            await view.print_info(message, player_name, take, candys, 'Компьютер')
        if await model.get_candys() <= 0:
            await view.print_winner(message, player_name, take)
            await model.game_status()
