# Напишите программу для проверки истинности утверждения ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.

x = int(input('Введите значение X - True/False - 1 or 0 >>> '))
y = int(input('Введите значение X - True/False - 1 or 0 >>> '))
z = int(input('Введите значение X - True/False - 1 or 0 >>> '))

left = not (x or y or z)
right = not (x) and not (y) and not (z)

if left == right:
    print(True)
else:
    print(False)
