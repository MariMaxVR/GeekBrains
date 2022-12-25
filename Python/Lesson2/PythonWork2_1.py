# Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр.
# Пример:
# 6782 -> 23
# 0,56 -> 11

number = input("Введите число: ")
print(f'Вы ввели число {number}')
def sum_digits(number):
    number = number.replace(',', '.')  # На тот случай, если пользователь введёт число не через точку, а через запятую.
    number = number.split('.')
    sum = 0
    for i in range(len(number)):
        digits = int(number[i])
        while digits != 0:
            sum += digits % 10
            digits = digits // 10
    return sum

print(f'Сумма цифр числа равна {sum_digits(number)}')
