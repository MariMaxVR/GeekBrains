from aiogram import Dispatcher
import bot_commands


def registred_handlers(dp: Dispatcher):
    dp.register_message_handler(bot_commands.game_status, commands=['start'])
    dp.register_message_handler(bot_commands.player_take)
 