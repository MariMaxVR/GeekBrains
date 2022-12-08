# Урок 6. Ускоренная обработка данных: lambda, filter, map, zip, enumerate, list comprehension. Продолжение
# Пройтись по своим предыдущим ДЗ и где возможно использовать ускоренную обработку данных
# (достаточно 3 примеров)

# 1. Простой пример - быстрое и более правильное создание списка (исправлено в PythonWork2_2):
# my_list = [0] * n
my_list = [i for i in range(n)]

# 1.1 Также к примеру переделал создание списка сразу с обработкой каждого элемента (PythonWork2_3):
# from random import randint as Magic

# orig_list = []
# for i in range(size):
#     orig_list.append(Magic(0, 100))
orig_list = [(Magic(0, 100)) for i in range(size)]

# 2. Применение обработки данных через функцию map для быстрого перевода строковых элементов списка в числовые,
# а также выполнение автоматической замены символа ',' на точку '.' и построение более сложной
# конструкции с функцией input (PythonWork3_3):

# user_list = input('Введите вещественные числа через пробел:\n')
new_list = input('Введите вещественные числа через пробел:\n').replace(',', '.')
new_list = list(map(float, new_list.split(' ')))

# 2.1 #Использовании list comprehension совместно с обработкой данных (PythonWork3_3):

# result_list = []
# for i in new_list:
#     if i % 1 != 0:
#         result_list.append(round(i % 1, 2))
result_list = [round(i % 1, 2) for i in new_list if i % 1 != 0]

# 3. Пример использования функции filter и lambda-функции:
# К списку my_list применяется функция filter первым аргументом которой указывается безымянная функция lambda,
# а вторым аргументом сам список, по которому и происходит фильтрация исходя из значений lambda функции (True/False)

my_list = [1, 3, 4, 6, 10, 11, 15, 12, 14]
new_list = list(filter(lambda x: (x % 2 == 0), my_list))

# 3.1 Также как пример использования lambda-функции создание универсального кода для вывода сообщения
# (с передачей апгумента):

message = lambda x: print(x + ' четверть')