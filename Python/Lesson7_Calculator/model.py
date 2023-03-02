first_number = 0
second_number = 0
operation = ''
result = 0
start_point = 0

def get_start_point():  # Получение первоначального значения по которому определяется режим программы
    global start_point
    return start_point


def set_start_point(value):  # Установка первоначального значения.
    global start_point
    start_point = value


def get_number():
    global first_number
    return first_number


def set_number(value):
    global first_number
    first_number = value


def get_second_number():
    global second_number
    return second_number


def set_second_number(value):
    global second_number
    second_number = value


def get_operation():
    global operation
    return operation


def set_operation(value):
    global operation
    operation = value


def get_result():
    global result
    if result == int(result):
        return int(result)
    else:
        return round(result, 3)


def get_sum():
    global first_number
    global second_number
    global result
    result = first_number + second_number
    if result == int(result):
        result = int(result)


def get_dif():
    global first_number
    global second_number
    global result
    result = first_number - second_number
    if result == int(result):
        result = int(result)


def get_mult():
    global first_number
    global second_number
    global result
    result = first_number * second_number
    if result == int(result):
        result = int(result)


def get_div():
    global first_number
    global second_number
    global result
    result = first_number / second_number
    if result == int(result):
        result = int(result)
    else:
        result = round(result, 3)
