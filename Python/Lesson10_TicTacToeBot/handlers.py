from aiogram import Dispatcher
import bot_commands


def registred_handlers(dp: Dispatcher):
    dp.register_message_handler(bot_commands.start_game, commands=['start'])
    # dp.register_message_handler(bot_commands.player1_turn)
    # dp.register_message_handler(bot_commands.player2_turn)