print('*** Игра "Крестики - Нолики" ***')
print('Условия игры: Один из игроков играет за "X", а другой за "O"\n'
      'Побеждает тот игрок, который первым поставит свой знак либо 3 в ряд, либо 3 диагонально\n'
      'Если свободных полей нет, а победитель ещё не определён - присуждается ничья\n'
      'Удачи!')


def print_field(pl_fi):
    print()
    print(f'\t _________________')
    print('\t|     |     |     |')
    print(f"\t|  {pl_fi[0]}  |  {pl_fi[1]}  |  {pl_fi[2]}  |")
    print('\t|_____|_____|_____|')
    print('\t|     |     |     |')
    print(f"\t|  {pl_fi[3]}  |  {pl_fi[4]}  |  {pl_fi[5]}  |")
    print('\t|_____|_____|_____|')
    print('\t|     |     |     |')
    print(f"\t|  {pl_fi[6]}  |  {pl_fi[7]}  |  {pl_fi[8]}  |")
    print('\t|_____|_____|_____|')



def player_sign(player_sign):
    flag = False
    while not flag:
        take = input("\t Куда поставим " + player_sign + "? >>> ")
        try:
            take = int(take)
        except:
            print("Вы ввели не число! Повторите ввод:")
            continue
        if take >= 1 and take <= 9:
            if (str(pl_fi[take - 1]) not in "XO"):
                pl_fi[take - 1] = player_sign
                flag = True
            else:
                print("Эта клетка уже занята!")
        else:
            print("Некорректный ввод. Введите число от 1 до 9.")


def check_result(pl_fi):
    win_results = ((0, 1, 2), (3, 4, 5), (6, 7, 8), (0, 3, 6), (1, 4, 7), (2, 5, 8), (0, 4, 8), (2, 4, 6))
    for i in win_results:
        if pl_fi[i[0]] == pl_fi[i[1]] == pl_fi[i[2]]:
            return True

    return False

#######################################
pl_fi = [i for i in range(1, 10)]

player1 = input('Введите имя первого игрока (X): ')
player2 = input('Введите имя второго игрока (O): ')
player = ''

i = 0
while i < 10:
    print_field(pl_fi)
    if i % 2 == 0:
        player = player1
        print(f'\t Ход игрока {player}')
        player_sign("X")
    else:
        player = player2
        print(f'\t Ход игрока {player}')
        player_sign("O")
    i += 1
    if i > 4:
        temp = check_result(pl_fi)
        if temp:
            print_field(pl_fi)
            print(f'\t Игрок {player} Выиграл!')
            break
    if i == 9:
        print("Свободных клеток не осталось. Ничья!")
        break
