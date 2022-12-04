# Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100)
# многочлена и записать в файл многочлен степени k.
# Пример:
# если k = 2, то многочлены могут быть => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

import random

def create_poly(k):
    koef = list(range(k + 1))

    for i in range(len(koef)):
        koef[i] = random.randint(0, 100)

    new_list = koef[::-1]
    result = ''

    for i in range(len(new_list)):
        if i != len(new_list) - 1 and new_list[i] != 0 and i != len(new_list) - 2:
            result = result + f'{new_list[i]}x**{len(new_list) - i - 1}'
            if new_list[i + 1] != 0:
                result = result + ' + '
        elif i == len(new_list) - 2 and new_list[i] != 0:
            result = result + f'{new_list[i]}x'
            if new_list[i + 1] != 0:
                result = result + ' + '
        elif i == len(new_list) - 1 and new_list[i] != 0:
            result = result + f'{new_list[i]} = 0'
        elif i == len(new_list) - 1 and new_list[i] == 0:
            result = result + ' = 0'

    return result


# Создаём многочлены, которые будут записаны в два разных файла, для выполнения второй части задания:
k1 = int(input("Введите натуральную степень k для создания первого многочлена = "))
k2 = int(input("Введите натуральную степень k для создания второго многочлена = "))

poly1 = create_poly(k1)
poly2 = create_poly(k2)

print(poly1)
print(poly2)

with open('Polynomial_1.txt', 'w') as file:
    file.write(poly1)

with open('Polynomial_2.txt', 'w') as file:
    file.write(poly2)
