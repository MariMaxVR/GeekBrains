def input_number():
        number = input('Введите число или значение: ')
        try:
            number = int(number)
            return number
        except:
            expression = number
            return expression




def input_operation():
    while True:
        operation = input('Введите знак операции: ')
        if operation in ['+', '-', '*', '/', '=']:
            return operation
        else:
            print('Введено некорректное значение!')


def print_to_console(text):
    print(text)


def print_end():
    print(f'Работа программы завершена. До свидания!')


def print_error_divzero():
    print('Деление на ноль запрещено!')
