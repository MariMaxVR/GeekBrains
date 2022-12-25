from bot import bot


async def start_game(message):
    await bot.send_message(message.from_user.id, f'{message.from_user.first_name} Привет!\n'
                           '*** Добро пожаловать в игру "Крестики - Нолики" ***\n'
                           'Режим игры - игрок против игрока.\n'
                           'Правила игры: Игроки по очереди ставят на свободные клетки поля 3x3 свои знаки (один всегда крестики, другой всегда нолики).\n'
                           'Игрок первым выстроивший в ряд 3 своих знака по вертикали, горизонтали или диагонали, выигрывает.\n'
                           'Первым всегда делает ход игрок, ставящий крестики.\n'
                           'Удачи!')

pl_fi = [" " for i in range(1, 10)]

async def print_field(message):
    await bot.send_message(message.from_user.id, 
                            f'__________________\n'
                            '|          |         |          |\n'
                            f"|  {pl_fi[0]}       |  {pl_fi[1]}      |  {pl_fi[2]}       |\n"
                            '|__1__|__2__|__3__|\n'
                            '|          |         |          |\n'
                            '|          |         |          |\n'
                            f"|  {pl_fi[3]}       |  {pl_fi[4]}      |  {pl_fi[5]}       |\n"
                            '|__4__|__5__|__6__|\n'
                            '|          |         |          |\n'
                            '|          |         |          |\n'
                            f"|  {pl_fi[6]}       |  {pl_fi[7]}      |  {pl_fi[8]}       |\n"
                            '|__7__|__8__|__9__|\n')





async def player_take(message):
    await bot.send_message(message.from_user.id, f'Какое количество конфет вы берёте?')


async def print_info(message, from_player, take, total_count, to_player):
    await bot.send_message(message.from_user.id, f'Игрок {from_player} взял {take} конфет со стола.\n'
                           f'На столе осталось {total_count} конфет. Ход игрока {to_player}.')


async def print_winner(message, name):
    await bot.send_message(message.from_user.id, f'{name} забрал последние конфеты со стола,'
                           f'на столе ничего не осталось. Игрок {name} победил!\n'
                           f'Чтобы запустить игру заново запустите команду /start')


async def wrong_take(message):
    await bot.send_message(message.from_user.id, f'За один ход можно брать только от 1 до 28 конфет. Сколько берёте?')


async def wrong_number(message):
    await bot.send_message(message.from_user.id, f'Введено некорректное значение! Повторите ввод!')
