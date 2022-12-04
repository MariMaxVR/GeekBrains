# Задайте список из n чисел последовательности (1 + 1/n)^n. Вывести в консоль сам список и сумму его элементов.

n = int(input('Введите число: '))

my_list = [0] * n

for i in range(1, n + 1):
    my_list[i - 1] = round((i + i / n) ** n)

print(f'Получился список {my_list}')

def numsum(list):
    sum = 0
    for i in range(len(list)):
        sum += list[i]
    return sum

print(f'Сумма элементов списка равна {numsum(my_list)}')
