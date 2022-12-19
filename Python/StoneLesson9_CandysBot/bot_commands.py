from bot_config import dispatcher, bot
from aiogram import types


@dispatcher.message_handler(commands=['start'])
async def start_bot(message: types.Message):
    await bot.send_message(message.from_user.id, text =f'{message.from_user.first_name} Привет!')