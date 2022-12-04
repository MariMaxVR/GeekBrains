# Реализуйте алгоритм перемешивания списка. Встроенный алгоритм SHUFFLE не использовать! Реализовать свой метод.

from random import randint as Magic

size = int(input("Введите размер списка: "))
orig_list = []
for i in range(size):
    orig_list.append(Magic(0, 100))

print(f'Получился список, состоящий из {size} элементов и имеющий вид:')
print(orig_list)

def swirl(list):
    size = len(list)
    for i in range(size):
        rand_num = Magic(0, size - 1)
        temp = list[i]
        list[i] = list[rand_num]
        list[rand_num] = temp
    return list

print(f'Перемешанный список имеет вид {swirl(orig_list)}')

# swirl(orig_list) #Если не использовать return в функции
# print(orig_list)

