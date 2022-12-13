def input_number() -> int:
    while True:
        try:
            number = int(input('Введите число: '))
            return number
        except:
            print('Введено некорректное значение!')

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
