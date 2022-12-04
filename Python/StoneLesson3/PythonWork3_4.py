# Напишите программу, которая будет преобразовывать десятичное число в двоичное. Без применения встроеных методов (арифметически)
# Пример:
# 45 -> 101101
# 3 -> 11
# 2 -> 10

number = int(input('Введите число: '))

binary_number = []
print(f'Число {number} в десятичной системе счисления представляет из себя число:')

while number > 0:
    if number % 2 != 0:
        binary_number.append(1)
    else:
        binary_number.append(0)
    number = number // 2

for i in range(len(binary_number)):
    print(str(binary_number[-1 - i]), end='')
