from aiogram.utils import executor
from bot_commands import dp
import handlers


async def bot_start(_):
    print('Bot Start Successfuly')

handlers.registred_handlers(dp)

if __name__ == '__main__':
    executor.start_polling(dp, skip_updates=True, on_startup=bot_start)
