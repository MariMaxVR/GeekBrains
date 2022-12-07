print('*** Игра "Крестики - Нолики" ***')
print('Условия игры: Один из игроков играет за "X", а другой за "O"\n'
      'Побеждает тот игрок, который первым поставит свой знак либо 3 в ряд, либо 3 диагонально\n'
      'Если свободных полей нет, а победитель ещё не определён - присуждается ничья\n'
      'Удачи!')


def print_field():
      print()
      print(f'\t|Ход игрока {player}|')
      print('\t|     |     |     |')
      print(f"\t|  {pl_fi[0]}  |  {pl_fi[1]}  |  {pl_fi[2]}  |")
      print('\t|__1__|__2__|__3__|')
      print('\t|     |     |     |')
      print(f"\t|  {pl_fi[3]}  |  {pl_fi[4]}  |  {pl_fi[5]}  |")
      print('\t|__4__|__5__|__6__|')
      print('\t|     |     |     |')
      print(f"\t|  {pl_fi[6]}  |  {pl_fi[7]}  |  {pl_fi[8]}  |")
      print('\t|__7__|__8__|__9__|')
      print()

pl_fi = [' ' for i in range (1,10)]

###########################################
player1 = 'Максим' #input('Введите имя игрока: ')
player2 = 'Марианна' #input('Введите имя игрока: ')
player = player1

print_field()

def selected_field():
      select = int(input('    Я выбираю поле: '))
      if player == player1:
            pl_fi[select-1] =  'X'
            player = player2
      else:
            pl_fi[select - 1] = 'O'
            player = player1



