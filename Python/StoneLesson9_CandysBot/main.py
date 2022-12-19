from aiogram.utils import executor
from bot_commands import dispatcher


async def bot_start(_):
    print('Bot Start Successfuly')


if __name__ == '__main__':
    executor.start_polling(dispatcher, skip_updates=True, on_startup=bot_start)