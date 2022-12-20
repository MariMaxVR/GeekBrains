import random

player_name = ''
game = False
candys = 150


async def game_status():
    global game
    global player_name
    global candys
    if game == False:
        game = True
    else:
        player_name = ''
        candys = 150
        game = False


async def set_playername(name):
    global player_name
    player_name = name


async def bot_take():
    global candys
    take = 0
    if candys % 29 != 0:
        take = candys % 29
    else:
        take = random.randint(1, 28)
    return take


async def candys_take(take):
    global candys
    candys = candys - take
    return candys


async def get_playername():
    global player_name
    return player_name


async def get_candys():
    global candys
    return candys


async def get_gamestatus():
    global game
    return game
