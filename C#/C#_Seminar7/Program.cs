// // // Задача 47. Задайте двумерный массив размером m×n, заполненный случайными целыми числами.

// // // m = 3, n = 4.
// // // 1 7 -2 -85
// // // 1 -3 8 -9
// // // 8 7 -7 9

// // Console.Write("Введите количество строк в массиве: ");
// // int rows = int.Parse(Console.ReadLine()!);
// // Console.Write("Введите количество столбцов в массиве: ");
// // int columns = int.Parse(Console.ReadLine()!);

// // int[,] UserArray = CreateArray(rows, columns);
// // FillArray(UserArray, -50, 100);
// // PrintArray(UserArray);


// // //*****************************************************************************************************************************
// // // Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// // // и возвращает значение этого элемента или же указание, что такого элемента нет.

// // // Например, задан массив:

// // // 1 4 7 2
// // // 5 9 2 3
// // // 8 4 2 4

// // // i = 4, j = 2 -> такого числа в массиве нет
// // // i = 1, j = 2 -> 2


// // int rows = new Random().Next(2, 8);
// // int columns = new Random().Next(2, 8);
// // int[,] RandomArray = CreateArray(rows, columns);
// // FillArray(RandomArray, 0, 100);

// // Console.WriteLine("Получился массив заполненный случайными числами:");
// // PrintArray(RandomArray);
// // Console.WriteLine();

// // Console.Write("Укажите строку: ");
// // int row = int.Parse(Console.ReadLine()!);
// // Console.Write("Укажите столбец: ");
// // int column = int.Parse(Console.ReadLine()!);

// // if ((row > 0 && row <= RandomArray.GetLength(0)) && (column > 0 && column <= RandomArray.GetLength(1)))
// //     Console.Write($"В данном массиве значением на {row} строке и в {column} столбце является число: {RandomArray[row - 1, column - 1]}");

// // else
// //     Console.Write("В данном случайном массиве такого числа нет (не совпадает количество строк и/или столбцов, попробуйте ещё раз.");



// // //*****************************************************************************************************************************
// // // Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// // // Например, задан массив:
// // // 1 4 7 2
// // // 5 9 2 3
// // // 8 4 2 4
// // // Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.



// // Console.Write("Введите количество строк в массиве: ");
// // int rows = int.Parse(Console.ReadLine()!);
// // Console.Write("Введите количество столбцов в массиве: ");
// // int columns = int.Parse(Console.ReadLine()!);

// // int[,] UserArray = CreateArray(rows, columns);
// // FillArray(UserArray, -10, 10);

// // Console.WriteLine($"Получился массив состоящий из {rows} строк и {columns} столбцов:");
// // PrintArray(UserArray);
// // Console.WriteLine();

// // Console.Write("Среднее арифметическое каждого столбца: ");
// // MathDivColumns(UserArray);


// // // Методы:

// int[,] CreateArray(int rows, int columns)
// {
//     int[,] array = new int[rows, columns];
//     return array;
// }



// int[,] FillArray(int[,] array, int minValue, int maxValue)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             array[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return array;
// }



// void PrintArray(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             Console.Write($"{array[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }



// void MathDivColumns(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(1); i++)
//     {
//         double result = 0;
//         for (int j = 0; j < array.GetLength(0); j++)
//         {
//             result = result + array[j, i];
//         }
//         Console.Write($"|{Math.Round(result / array.GetLength(0), 2)}| ");
//         //Console.Write($"{result / array.GetLength(0):F2}; ");
//     }
// }
