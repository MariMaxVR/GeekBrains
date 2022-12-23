import random
from aiogram import types
import model
import view

#1. Не понятен принцип почему бот передаёт ход игроку без доп. команды (await player_turn(message)),
# а игроку требуется дополнительно код await bot_turn(message) чтобы ход перешёл к компьютеру.

#2. Логика "сложности" игры написана, но как добавить возможность установки значения game_mode 0 или 1
# от пользователя? В ручном режиме всё работает.

#3. Обработка ошибки ввода, программа работает корректно но в консоли возникает сообщение. 
# Проблема в блоке кода player_turn -> await player_turn() или то что message.text? 

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
    if game:
        take = message.text
        if take.isdigit():
            take = int(take)
            if take > 0 and take <= 28:
                await model.take_candys(take)
            else:
                await view.wrong_take(message)
                await player_turn()
        else:
            await view.wrong_number(message)
            await player_turn()
        player_name = await model.get_player_name()
        total_candys = await model.get_total_candys()
        if await model.get_total_candys() > 0:
            await view.print_info(message, player_name, take, total_candys, 'Компьютер')
            await bot_turn(message)
        if await model.get_total_candys() <= 0:
            await view.print_winner(message, player_name)
            await model.set_game()
