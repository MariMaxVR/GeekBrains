import parsing
import view
import model


def mode_initial(value):
    if type(value) == int or type(value) == float:
        return True
    else:
        return False


def input_start_number():
    number = view.mode_initial()
    model.set_start_point(number)


def input_number():
    number = view.input_number()
    model.set_number(number)


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


def solution_number():
    operation = model.get_operation()
    if operation == '+':
        model.get_sum()
    elif operation == '-':
        model.get_dif()
    elif operation == '*':
        model.get_mult()
    elif operation == '/':
        model.get_div()

    result_string = (f'{model.get_number()} {operation} {model.get_second_number()} = {model.get_result()}')
    view.print_to_console(result_string)
    model.set_number(model.get_result())


def start():
    input_start_number()
    if mode_initial(model.get_start_point()):
        print('Режим программы - одиночный ввод.')
        model.set_number(model.start_point)
        while True:
            input_operation()
            if model.get_operation() == '=':
                view.print_to_console(f'Итоговый результат = {model.get_result()}')
                view.print_end()
                break
            input_second_number()
            solution_number()
    else:
        view.print_to_console('Режим программы - строковый ввод.')
        parsing.set_expression(model.get_start_point())
        view.print_to_console(f'Результатом выражения {model.get_start_point()} '
                              f'является число = {parsing.get_result_expression()}')

        view.print_end()

