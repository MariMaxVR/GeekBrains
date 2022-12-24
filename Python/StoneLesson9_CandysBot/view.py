from bot import bot


async def start_game(message):
    await bot.send_message(message.from_user.id, f'{message.from_user.first_name} Привет!\n'
                           '*** Добро пожаловать в игру "Конфетный Человек" ***\n'
                           'Режим игры - игрок против компьютера.\n'
                           'Условия игры: На столе лежит 150 конфет, '
                           'право первого хода определяется случайно. За один ход можно забрать не более чем 28 конфет.\n'
                           'В игре присуждается победа и достаются все конфеты оппонента сделавшему последний ход игроку.\n'
                           'Удачи!')


async def ask_game_mode(message):
    await bot.send_message(message.from_user.id, f'Если хотите, в любой момент вы можете выбрать сложность игры используя команды:\n'
                                                 f'/hard - сложно, /easy - легко (стоит по-умолчанию).')


async def game_mode_hard(message):
    await bot.send_message(message.from_user.id, f'Установлен высокий уровень сложности')


async def game_mode_easy(message):
    await bot.send_message(message.from_user.id, f'Установлен низкий уровень сложности')


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
    await bot.send_message(message.from_user.id, f'За один ход можно брать только от 1 до 28 конфет.')


async def wrong_number(message):
    await bot.send_message(message.from_user.id, f'Введено некорректное значение! Повторите ввод!')
