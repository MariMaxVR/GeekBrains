# Задайте список из вещественных чисел. Напишите программу, которая найдёт разницу между максимальным и минимальным значением дробной части элементов.
# Пример: [1.1, 1.2, 3.1, 5, 10.01] => 0.19

# user_list = input('Введите вещественные числа через пробел:\n')
new_list = input('Введите вещественные числа через пробел:\n').replace(',', '.')
new_list = list(map(float, new_list.split(' ')))

result_list = []
for i in new_list:
    if i % 1 != 0:
        result_list.append(round(i % 1, 2))


print(f'Получился список из числел: {new_list}')
print(f'Разница между максимальным и минимальным значением (отличным от нуля) дробной части элементов списка равна: \n'
      f'{max(result_list) - min(result_list)}')
