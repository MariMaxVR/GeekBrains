import view
import model


def input_first_number():
    number = view.input_number()
    model.set_first_number(number)


def input_second_number():
    while True:
        number = view.input_number()
        if model.get_operation() == '/' and number == 0:
            view.print_error_divzero()
        else:
            model.set_second_number(number)
            break


def input_operation():
    operation = view.input_operation()
    model.set_operation(operation)


def solution():
    operation = model.get_operation()
    if operation == '+':
        model.get_sum()
    elif operation == '-':
        model.get_dif()
    elif operation == '*':
        model.get_mult()
    elif operation == '/':
        model.get_div()

    result_string = (f'{model.get_first_number()} {operation} {model.get_second_number()} = {model.get_result()}')
    view.print_to_console(result_string)
    model.set_first_number(model.get_result())


def start():
    input_first_number()
    if type(model.first_number) == int:
        print('Режим программы - одиночный ввод значений.')
        while True:
            input_operation()
            if model.get_operation() == '=':
                view.print_to_console(f'Итоговый результат = {model.get_result()}')
                view.print_end()
                break
            input_second_number()
            solution()
    else:
        print('Режим программы - строковый ввод значений.')
