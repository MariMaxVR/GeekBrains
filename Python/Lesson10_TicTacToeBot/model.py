import random

game = False
player1 = 'X'
player2 = 'O'
pl_fi = [" " for i in range(1, 10)]


async def set_game():
    global game
    if game == False:
        game = True
    else:
        game = False
   


async def get_game_status():
    global game
    return game


# async def player_sign(player_sign):
