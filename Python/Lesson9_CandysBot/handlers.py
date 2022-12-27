from aiogram import Dispatcher
import bot_commands


def registred_handlers(dp: Dispatcher):
    dp.register_message_handler(bot_commands.start_game, commands=['start'])
    dp.register_message_handler(bot_commands.game_mode_hard, commands=['hard'])
    dp.register_message_handler(bot_commands.game_mode_easy, commands=['easy'])
    # dp.register_message_handler(bot_commands.candys_total, commands=['candys'])
    dp.register_message_handler(bot_commands.player_turn)
