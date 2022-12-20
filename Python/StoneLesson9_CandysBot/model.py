import random

game = False
player_name = ''
total_candys = 150


async def set_game():
    global game
    global player_name
    global total_candys
    if game == False:
        game = True
    else:
        game = False
        player_name = ''
        total_candys = 150
        


async def set_player_name(name):
    global player_name
    player_name = name


async def bot_take():
    global total_candys
    if total_candys % 29 != 0:
        take = total_candys % 29
    else:
        take = random.randint(1, 28)
    return take
    return take


async def take_candys(take):
    global total_candys
    total_candys = total_candys - take


async def get_player_name():
    global player_name
    return player_name


async def get_total_candys():
    global total_candys
    return total_candys


async def get_game_status():
    global game
    return game
