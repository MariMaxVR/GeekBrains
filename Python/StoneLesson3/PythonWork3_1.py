# Задайте список из нескольких чисел. Напишите программу, которая найдёт сумму элементов списка с нечетными индексами.
# Пример: [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12
from random import randint

def count_sum(list):
    counter = 0
    for i in range(1, len(list), 2):
        counter += list[i]
    return counter

size = int(input('Из скольки случайных элементов будет состоять список? >>> '))

user_list = []
for i in range(size):
    user_list.append(randint(1, 10))

print(f'Получился список вида {user_list}')
print(f'Сумма элементов списка с нечётными индексами равна {count_sum(user_list)}')
