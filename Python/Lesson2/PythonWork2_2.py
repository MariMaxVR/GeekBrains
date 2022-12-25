# Задайте список из n чисел последовательности (1 + 1/n)^n. Вывести в консоль сам список и сумму его элементов.

n = int(input('Введите число: '))

def func_number(i, n):
    number = round((i + i / n) ** n)
    return number

# my_list = [0] * n
my_list = [i for i in range(n)]

for i in range(1, n + 1):
    # my_list[i - 1] = round((i + i / n) ** n)
    my_list[i-1] = func_number(i, n)


print(f'Получился список {my_list}')

def numsum(list):
    sum = 0
    for i in range(len(list)):
        sum += list[i]
    return sum

print(f'Сумма элементов списка равна {numsum(my_list)}')
