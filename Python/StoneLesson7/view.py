def mode_initial():  # Функция для определения в каком режиме будет работать калькулятор
    while True:  # Возврат числа или отформатированной строки в программе для решения по ветвлению.
        number_string = input('Введите число или числовое выражение: ')
        try:
            number_string = number_string.replace(',', '.')
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


def input_number():  # Функция для получения последующих чисел с проверкой на значение.
    while True:  # Оставлена, чтобы не вводить дополнительные проверки и не усложнять функцию mode_initial
        number = input('Введите число: ')
        number = number.replace(',', '.')
        try:
            number = float(number)
            return number
        except:
            print('Введено некорректное значение!')


def input_operation():  # Функция определения знака математической операции
    while True:
        operation = input('Введите знак операции: ')
        if operation in ['+', '-', '*', '/', '']:
            return operation
        else:
            print('Введено некорректное значение!')


def print_to_console(text):  # Вывод сообщения в консоль
    print(text)


def print_start():  # Вывод приветственного сообщения
    print('***Добро пожаловать в "Костыльный Калькулятор!"***\n'
          'Можно вводить одиночные операции и элементы (окончание программы через Enter),\n'
          'либо введите сразу числовое выражение. Поддерживаются как целые числа, так и вещественные.\n'
          'Удачи! Да и поможет нам Проц!\n')


def print_end():  # Вывод сообщения по окончанию программы
    print('Работа программы завершена. До свидания!')


def print_error_divzero():  # Вывод сообщения об ошибке при попытке математического деления на ноль
    print('Деление на ноль запрещено!')
