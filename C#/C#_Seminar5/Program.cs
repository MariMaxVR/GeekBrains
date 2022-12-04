// Все массивы от 5-ти элементов
// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.

// [345, 897, 568, 234] -> 2


Console.Write("Введите число из скольки элементов будет состоять массив: ");
int size = int.Parse(Console.ReadLine());
int[] Array = CreateArr(size);

Console.WriteLine($"Случайный массив состоящий из трёхначных чисел {String.Join(" ", Array)}");
Console.WriteLine();
Console.Write($"Количество чётных чисел в данном массиве составляет: {CountArr(Array)}");

int[] CreateArr(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(100, 1000);
    }
    return array;
}

int CountArr(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] % 2 == 0)
        {
            count++;
        }

    }
    return count;
}


//*******************************************************************************************************************************************************
// Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0


Console.Write("Введите число из скольки элементов будет состоять массив: ");
int size = int.Parse(Console.ReadLine());
int[] Array = CreateArr(size);

Console.WriteLine($"В следующем массиве состоящем из {size} элементов, а именно в массиве: {String.Join(" ", Array)}");
Console.Write($"Сумма элементов, стоящих на нечётных позициях равна {CountArr(Array)}");

int[] CreateArr(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-10, 11);
    }
    return array;
}

int CountArr(int[] array)
{
    int counter = 0;
    for (int i = 1; i < array.Length; i += 2)
    {
        counter += array[i];
    }
    return counter;
}


//*******************************************************************************************************************************************************
// Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76


Console.Write("Введите число из скольки элементов будет состоять массив: ");
int size = int.Parse(Console.ReadLine());
double[] Array = CreateArr(size);

Console.WriteLine($"Массив из {size} элементов состощий из вещественных чисел: {String.Join(" ", Array)}");
Console.WriteLine();
Console.Write($"Число представляющее собой разницу между максимальным и минимальным элементом массива является число {Result(Array)}");


double[] CreateArr(int size)
{
    double[] array = new double[size];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(0, 100);
    }
    return array;
}

double Result(double[] array)
{
    double max_value = array[0];
    double min_value = array[1];
    double result = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > max_value)
        {
            max_value = array[i];
        }
        else if (array[i] < min_value)
        {
            min_value = array[i];
        }

    }
    result = max_value - min_value;
    return result;

}

