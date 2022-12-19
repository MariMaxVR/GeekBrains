from bot_config import dispatcher, bot
from aiogram import types
import random


@dispatcher.message_handler(commands=['start'])
async def start_bot(message: types.Message):
    await bot.send_message(message.from_user.id, text=f'{message.from_user.first_name} Привет!\n'
                           f'*** Игра "Конфетный Человек" ***\n'
                           f'Режим игры - игрок против компьютера.\n'
                           f'Условия игры: На столе лежит 150 конфет, '
                           f'право первого хода определяется случайно. За один ход можно забрать не более чем 28 конфет.\n'
                           f'В игре присуждается победа и достаются все конфеты оппонента сделавшему последний ход игроку.\n'
                           f'Удачи!')


# player1 = text
# player2 = 'Компьютер'
# candys = 150
# game_start = random.randint(0, 1)
# if game_start:
#     player = player1
# else:
#     player = player2
# while candys > 0:

#     if player == player1:
#         print()
#         print(f'Ход игрока {player}')
#         take = input('Какое количество конфет вы берёте на этом ходу? >>> ')
#         if take.isdigit():
#             take = int(take)
#             if take < 1 or take > 28:
#                 print(
#                     'Такое количество конфет брать нельзя! По правилам за один ход можно брать от 1 до 28 конфет.')
#             else:
#                 candys -= take
#                 print(f'На столе осталось {candys} конфет')
#                 if candys > 0:
#                     player = player2
#         else:
#             print()
#             print('>>> Вы ввели не число! Повторите Ввод! <<<')
#     else:
#         if candys <= 28:
#             take = candys
#             candys -= take
#             print()
#             print(
#                 f'*** Компьютер взял {take} конфет, на столе осталось {candys} конфет ***')
#         else:
#             if candys % 29 != 0:
#                 take = candys % 29
#             else:
#                 take = random.randint(1, 28)
#             candys = candys - take
#             player = player1
#             print()
#             print(
#                 f'*** Компьютер взял {take} конфет, на столе осталось {candys} конфет ***')

# print()
# if player == player1:
#     print(
#         f'*** Победил игрок {player}! В этот раз тебе повезло человек, но это ненадолго... ***')
# else:
#     print(
#         f'*** Победил {player}! Всю власть машинам, долой кожаных! Ахахахаха! ***')
