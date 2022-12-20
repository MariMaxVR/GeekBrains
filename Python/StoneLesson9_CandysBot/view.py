from bot_config import bot

async def start_bot(message):
    await bot.send_message(message.from_user.id, f'{message.from_user.first_name} Привет!\n'
                           '*** Добро пожаловать в игру "Конфетный Человек" ***\n'
                           'Режим игры - игрок против компьютера.\n'
                           'Условия игры: На столе лежит 150 конфет, '
                           'право первого хода определяется случайно. За один ход можно забрать не более чем 28 конфет.\n'
                           'В игре присуждается победа и достаются все конфеты оппонента сделавшему последний ход игроку.\n'
                           'Удачи!')


async def player_take(message):
    await bot.send_message(message.from_user.id, f'Какое количество конфет вы берёте на этом ходу? >>> ')


async def print_info(message, name_player1, take, candys, name_player2):
    await bot.send_message(message.from_user.id, f'{name_player1} взял {take} конфет со стола.\n'
                           f'На столе осталось {candys} конфет. Ход игрока {name_player2}, сколько конфет будете брать? ')


async def print_winner(message, name, take):
    await bot.send_message(message.from_user.id, f'{name} взял {take} конфет со стола\n,'
                           f'на столе не осталось конфет. Игрок {name} победил!')


async def print_error(message):
    await bot.send_message(message.from_user.id, f'За один ход можно брать только от 1 до 28 конфет')
