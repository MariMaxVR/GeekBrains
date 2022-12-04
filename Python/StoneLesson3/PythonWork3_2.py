# Напишите программу, которая найдёт произведение пар чисел списка. Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# Пример:
# [2, 3, 4, 5, 6] => [12, 15, 16]
# [2, 3, 5, 6] => [12, 15]
from random import randint

size = int(input('Из скольки случайных элементов будет состоять список? >>> '))

my_list = []
for i in range(size):
    my_list.append(randint(1, 10))

new_list = []

if len(my_list) % 2 == 0:

    for i in range(int(len(my_list) / 2)):
        new_list.append(my_list[i] * my_list[-1 - i])

else:
    s = int(len(my_list) / 2)
    for i in range(s):
        new_list.append(my_list[i] * my_list[-1 - i])
    new_list.append(my_list[s] ** 2)

print(f'Произведение пар чисел списка {my_list} является результат: \n {new_list}')
