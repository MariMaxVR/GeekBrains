import controller

expression = '1 + 3 * 6 / 2 + 3'
result_expression = 0


def set_expression(text_expression):
    global expression
    expression = text_expression


def get_result_expression():
    global expression
    global result_expression
    # print(expression)
    list = expression.split()
    # print(list)
    for i in range(len(list)):
        if list[i].isdigit():
            list[i] = int(list[i])
    # print(list)

    while len(list) != 1:
        i = 0
        while ('*' in list or '/' in list) and i < len(list):
            if list[i] == '*':
                result_expression = list[i - 1] * list[i + 1]
                list.pop(i)
                list.pop(i)
                list[i - 1] = result_expression
                i = i - 1
            elif list[i] == '/':
                result_expression = list[i - 1] / list[i + 1]
                list.pop(i)
                list.pop(i)
                list[i - 1] = result_expression
                i -= 1

            i += 1

        while ('+' in list or '-' in list) and i < len(list):
            if list[i] == '+':
                result_expression = list[i - 1] + list[i + 1]
                list.pop(i)
                list.pop(i)
                list[i - 1] = result_expression
                i = i - 1
            elif list[i] == '-':
                result_expression = list[i - 1] - list[i + 1]
                list.pop(i)
                list.pop(i)
                list[i - 1] = result_expression
                i -= 1

            i += 1

    # print(result_expression)
    return result_expression


print(get_result_expression())
