// // ***********************************************************************************************************************************************************
// // Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
// // Например, задан массив:
// // 1 4 7 2
// // 5 9 2 3
// // 8 4 2 4

// // В итоге получается вот такой массив:
// // 7 4 2 1
// // 9 5 3 2
// // 8 4 4 2

// Console.Clear();
// Console.Write("Введите количество строк в создаваемом двумерном массиве: ");
// int rows = int.Parse(Console.ReadLine()!);
// Console.Write("Введите количество столбцов в создаваемом массиве: ");
// int columns = int.Parse(Console.ReadLine()!);

// int[,] array = CreateArray(rows, columns);
// FillArray(array, 1, 10);

// Console.WriteLine($"Получился неупорядоченный массив состоящий из {rows} строк и {columns} столбцов: ");
// PrintArray(array);
// int temp;

// for (int i = 0; i < array.GetLength(0); i++)
// {
//     for (int j = 0; j < array.GetLength(1); j++)
//     {
//         for (int k = j + 1; k < array.GetLength(1); k++)
//         {
//             if (array[i, j] < array[i, k])
//             {
//                 temp = array[i, j];
//                 array[i, j] = array[i, k];
//                 array[i, k] = temp;
//             }
//         }
//     }
// }
// Console.WriteLine();
// Console.WriteLine("Массив с упорядоченными элементами по каждой строке представляет из себя следующие значения: ");
// PrintArray(array);



// // ***********************************************************************************************************************************************************
// // Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

// // Например, задан массив:
// // 1 4 7 2
// // 5 9 2 3
// // 8 4 2 4
// // 5 2 6 7

// // Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка.

// Console.Clear();
// Console.WriteLine("Введите значение размеров прямоугольного двумерного массива: ");
// int rows = int.Parse(Console.ReadLine()!);
// int columns = rows;

// int[,] array = CreateArray(rows, columns);
// FillArray(array, 1, 10);
// Console.WriteLine("Получился следующий массив: ");
// PrintArray(array);

// int firstValue = 0;
// int nextValue = 0;
// int indexMinValue = 1;

// for (int j = 0; j < array.GetLength(1); j++)
//     firstValue += array[0, j]; // Сумма первой строки массива.

// for (int i = 1; i < array.GetLength(0); i++)
// {
//     nextValue = 0;
//     for (int j = 0; j < array.GetLength(1); j++)
//     {
//         nextValue = nextValue + array[i, j];
//     }
//     if (nextValue < firstValue)
//     {
//         firstValue = nextValue;
//         indexMinValue = i + 1;
//     }
// }

// Console.WriteLine();
// Console.WriteLine($"Минимальное значение суммы всех элементов находится на {indexMinValue} строке.");


// // ***********************************************************************************************************************************************************
// // Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// // Например, даны 2 матрицы:
// // 2 4    |   3 4
// // 3 2    |   3 3
// // Результирующая матрица будет:
// // 18 20
// // 15 18

// // В произведении матриц для получения одного элемента с индексом i,j производится 
// // поэлементное умножение i-ой строки первой матрицы на j-ый столбец второй и складывается результат.

// Console.Clear();
// Console.WriteLine("Введите значение размеров двух матриц: ");
// int rows = int.Parse(Console.ReadLine()!);
// int columns = rows;

// int[,] matrix1 = CreateArray(rows, columns);
// int[,] matrix2 = CreateArray(rows, columns);
// int[,] matrixResult = CreateArray(rows, columns);
// FillArray(matrix1, 1, 5);
// FillArray(matrix2, 1, 5);

// Console.WriteLine("Получились две матрицы: ");
// Console.WriteLine();
// PrintMatrix(matrix1);
// Console.WriteLine();
// PrintMatrix(matrix2);
// Console.WriteLine();

// for (int i = 0; i < matrix1.GetLength(0); i++)
// {
//     for (int j = 0; j < matrix2.GetLength(1); j++)
//     {
//         matrixResult[i, j] = 0;
//         for (int k = 0; k < matrix1.GetLength(1); k++)
//         {
//             matrixResult[i, j] += matrix1[i, k] * matrix2[k, j];
//         }
//     }
// }

// Console.WriteLine("Произведением двух вышеобозначенных матриц является матрица:");
// PrintMatrix(matrixResult);




// // ***********************************************************************************************************************************************************
// // Методы

// void PrintMatrix(int[,] matrix)
// {
//     for (int i = 0; i < matrix.GetLength(0); i++)
//     {
//         Console.Write("|");
//         for (int j = 0; j < matrix.GetLength(1); j++)
//         {
//             if (j < matrix.GetLength(1) - 1) Console.Write($"{matrix[i, j],1}|");
//             else Console.Write($"{matrix[i, j],1}");
//         }
//         Console.WriteLine("|");
//     }
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
