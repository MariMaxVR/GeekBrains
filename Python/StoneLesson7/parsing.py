import controller

expression = ''

def get_expression():
    global expression
    return expression


def set_expression(text_expression):
    global expression
    expression = text_expression