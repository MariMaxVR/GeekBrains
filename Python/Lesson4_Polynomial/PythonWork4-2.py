# Даны два файла, в каждом из которых находится запись многочлена.
# Задача - сформировать файл, содержащий сумму многочленов.


with open('Polynomial_1.txt', 'r') as file:
    polynomial_1 = file.readline()

with open('Polynomial_2.txt', 'r') as file:
    polynomial_2 = file.readline()

print(polynomial_1)
print(polynomial_2)

polynomial_1 = polynomial_1.replace(' ', '')[:-2]
polynomial_2 = polynomial_2.replace(' ', '')[:-2]
polynomial_1 = polynomial_1.replace('+', ' ')
polynomial_2 = polynomial_2.replace('+', ' ')
polynomial_1 = polynomial_1.replace('x**', ' ')
polynomial_2 = polynomial_2.replace('x**', ' ')
polynomial_1 = polynomial_1.replace('x ', ' ')
polynomial_2 = polynomial_2.replace('x ', ' ')


polynomial_1 = polynomial_1.split()
polynomial_2 = polynomial_2.split()

if len(polynomial_1) > len(polynomial_2):

    poly_result = [0] * len(polynomial_1)
    for i in range(len(polynomial_1) - len(polynomial_2)):
        polynomial_2.insert(0, '0')

else:
    poly_result = [0] * len(polynomial_2)
    for i in range(len(polynomial_2) - len(polynomial_1)):
        polynomial_1.insert(0, '0')

polynomial_1 = list(map(int, polynomial_1))
polynomial_2 = list(map(int, polynomial_2))


for i in range(len(polynomial_1)):
    if polynomial_1[i] != polynomial_2[i]:
        poly_result[i] = polynomial_1[i] + polynomial_2[i]
    else:
        poly_result[i] = polynomial_1[i]

print()
poly_string = ''

for i in range(0, len(poly_result) - 2, 2):
    poly_string += f'{poly_result[i]}x**{poly_result[i + 1]} + '
poly_string += f'{poly_result[-2]}x + {poly_result[-1]} = 0'

print(poly_string)

with open('Sum_Polynomials.txt', 'w') as file:
    file.write(poly_string)
