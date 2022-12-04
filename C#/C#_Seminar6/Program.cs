// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 4

Console.Write("Массив из скольки чисел необходимо создать? >>> ");
int size = int.Parse(Console.ReadLine()!);
int[] ArrayUser = CreateArray(size);

int[] CreateArray(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    {
        Console.Write("Введите следующее число: ");
        array[i] = int.Parse(Console.ReadLine()!);
    }
    return array;
}

int Count(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > 0)
        {
            count++;
        }

    }
    return count;
}

// Console.WriteLine($" Созданный вами массив: {String.Join(" ", ArrayUser)}");
// Console.WriteLine();
// Console.Write($"Количество положительных чисел больше нуля в указанном массиве составляет = {Count(ArrayUser)}");

//***************************************************************************************************************************************************

// Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями 
//y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

Console.Write("Введите значение b1 = ");
double b1 = double.Parse(Console.ReadLine()!);
Console.Write("Введите значение k1 = ");
double k1 = double.Parse(Console.ReadLine()!);
Console.Write("Введите значение b2 = ");
double b2 = double.Parse(Console.ReadLine()!);
Console.Write("Введите значение k2 = ");
double k2 = double.Parse(Console.ReadLine()!);

double x = (b2 - b1) / (k1 - k2);
double y1 = k1 * x + b1,
       y2 = k2 * x + b2;

if (y1 == y2)
{
Console.WriteLine($"Точка пересечения двух прямых находится на координатах = {x} ; {y1}");
}