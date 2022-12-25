import random
from aiogram import types
import model
import view


async def start_game(message: types.Message):
    await model.set_game()
    await view.start_game(message)
    await view.print_field(message)


# async def player1_turn(message: types.Message):
#     game = await model.get_game_status()
#     if game:
#         put = message.text
#         if put.isdigit():
#             put = int(take)
#             if put >= 1 and put <= 9:
#                 await model.put_sign(put)
#                 if await model.get_total_candys() > 0:
#                     total_candys = await model.get_total_candys()
#                     await view.print_info(message, player_name, take, total_candys, 'Компьютер')
#                     await bot_turn(message)
#                 if await model.get_total_candys() <= 0:
#                     await view.print_winner(message, player_name)
#                     await model.set_game()
#             else:
#                 await view.wrong_take(message)
#         else:
#             await view.wrong_number(message)
