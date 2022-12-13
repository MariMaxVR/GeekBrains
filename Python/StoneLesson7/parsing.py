expression = ''


def set_expression(text_expression):
    global expression
    expression = text_expression


def get_result_expression():
    global expression
    expression = expression.replace(',', '.')
    expression = expression.replace('=', '')
    expression = expression.replace(' ', '')
    expression = expression.replace('*', ' * ')
    expression = expression.replace('/', ' / ')
    expression = expression.replace('-', ' - ')
    expression = expression.replace('+', ' + ')
    result_expression = 0
    list = expression.split()

    for i in range(len(list)):
        try:
            list[i] = float(list[i])
        except:
            list[i] = list[i]
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
    if result_expression == int(result_expression):
        return int(result_expression)
    else:
        return round(result_expression, 3)
