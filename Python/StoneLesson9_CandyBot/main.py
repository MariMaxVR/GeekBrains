from aiogram.utils import executor
from commands import dispatcher


async def bot_start():
    print('Bot Start Successfuly')


if __name__ == '__main__':
    executor.start_polling(dispatcher, skip_updates=True, on_startup=bot_start)