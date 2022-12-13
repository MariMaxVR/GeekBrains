import view
import model
import parsing

def mode_initial(value):
    if type(value) == int or type(value) == float:
        return True
    else:
        return False


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

    result_string = (f'{model.get_first_number()} {operation} {model.get_second_number()} = {model.get_result()}')
    view.print_to_console(result_string)
    model.set_first_number(model.get_result())

# def solution_expression():
#     parsing.set_expression(model.first_number)
#     print(parsing.expression)


def start():
    input_first_number()
    if mode_initial(model.get_first_number()):
        print('Режим программы - одиночный ввод значений.')
        while True:
            input_operation()
            if model.get_operation() == '=':
                view.print_to_console(f'Итоговый результат = {model.get_result()}')
                view.print_end()
                break
            input_second_number()
            solution_number()
    else:
        print('Режим программы - строковый ввод значений.')

