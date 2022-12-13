def mode_initial():
    while True:
        number_string = input('Введите число или числовое выражение: ')
        try:
            number_string = float(number_string)
            return number_string
        except:
            number_string = number_string.replace(',', '.')
            number_string = number_string.replace('=', '')
            number_string = number_string.replace(' ', '')
            number_string = number_string.replace('*', ' * ')
            number_string = number_string.replace('/', ' / ')
            number_string = number_string.replace('-', ' - ')
            number_string = number_string.replace('+', ' + ')
            return number_string


def input_number():
    while True:
        number = input('Введите число: ')
        number = number.replace(',', '.')
        try:
            number = float(number)
            return number
        except:
            print('Введено некорректное значение!')


def input_operation():
    while True:
        operation = input('Введите знак операции: ')
        if operation in ['+', '-', '*', '/', '=', '']:
            return operation
        else:
            print('Введено некорректное значение!')


def print_to_console(text):
    print(text)


def print_start():
    print('***Добро пожаловать в "Костыльный Калькулятор!"***\n'
          'Можно вводить одиночные операции и элементы (окончание программы через Enter),\n'
          'либо введите сразу числовое выражение. Поддерживаются как целые числа, так и вещественные.\n'
          'Удачи! Да и поможет нам Проц!\n')


def print_end():
    print('Работа программы завершена. До свидания!')


def print_error_divzero():
    print('Деление на ноль запрещено!')
