// Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.

// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

Console.Clear();
Console.Write("Введите число от которого нужно показать все натуральные число до 1 включительно: ");
int number = int.Parse(Console.ReadLine()!);

string RecursNumber(int number, int finalValue)
{
    if (number == 1)
    {
        return number.ToString();
    }
    return (number + " " + RecursNumber(number - 1, 1));
}

Console.WriteLine($"Все натуральные числа от числа {number} до 1 представляют из себя порядок: \n{RecursNumber(number, 1)}");


// *********************************************************************************************************************************************


// Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

Console.Clear();
Console.Write("Введите от какого числа начинается вычисление суммы элементов: ");
int startValue = int.Parse(Console.ReadLine()!);
Console.Write("Введите до какого числа производится вычисление суммы элементов: ");
int finalValue = int.Parse(Console.ReadLine()!);

int SumRecurs(int m, int n)
{
    if (m == n)
    {
        return m;
    }
    return (m + SumRecurs(m + 1, n));
}

Console.WriteLine($"Суммой элементов в промежутке от {startValue} до {finalValue} является число: {SumRecurs(startValue, finalValue)}");


// *********************************************************************************************************************************************


// Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29

Console.Clear();
Console.WriteLine("Вычисление функции Аккермана");
Console.Write("Введите первое число >>>M<<< для вычисления в диапазоне от 0 до 3: ");
int m = int.Parse(Console.ReadLine()!);
Console.Write("Введите второе число >>>N<<< в диапазоне от 0 до 4: ");
int n = int.Parse(Console.ReadLine()!);

int AccermanFunc(int m, int n)
{
    if (m == 0) return n + 1;

    else if ((m != 0) && (n == 0)) return AccermanFunc(m - 1, 1);

    return AccermanFunc(m - 1, AccermanFunc(m, n - 1));
}

Console.Write($"Результатом вычисления функции Аккермана при условии исходных цифр {m} и {n} является число: {AccermanFunc(m, n)}");
