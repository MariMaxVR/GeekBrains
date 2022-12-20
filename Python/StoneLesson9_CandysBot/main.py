from aiogram.utils import executor
import handlers
from bot import dp


async def bot_start(_):
    print('Bot Start Successfuly')

handlers.registred_handlers(dp)

# if __name__ == '__main__':
executor.start_polling(dp, skip_updates=True, on_startup=bot_start)
