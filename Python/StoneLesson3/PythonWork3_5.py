# # Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов (Негафибоначчи).
# # Пример: для k = 8 список будет выглядеть так: [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]

size = int(input("До скольки значений выводим последовательность чисел Фибоначчи? >>>  "))

def show_fibo(size):
    fibo_nums = [1, 1]
    for i in range(2, size):
        fibo_nums.append(fibo_nums[i - 1] + fibo_nums[i - 2])

    fibor_nums = [1, 0]
    for i in range(size - 1):
        fibor_nums.insert(0, fibor_nums[1] - fibor_nums[0])
    return fibor_nums + fibo_nums

if size == 0:
    print(f'Последовательность Фибоначчи для {size} элементов будет иметь вид: \n[0]')
elif size == 1:
    print(f'Последовательность Фибоначчи для {size} элементов будет иметь вид: \n[0, 1]')
else:
    print(f'Последовательность Фибоначчи для {size} элементов будет иметь вид: \n{show_fibo(size)}')
