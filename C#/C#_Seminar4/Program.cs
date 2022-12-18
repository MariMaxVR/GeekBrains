// // Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

// // 3, 5 -> 243 (3⁵)
// // 2, 4 -> 16

// Console.Write("Укажите число: ");
// int number = int.Parse(Console.ReadLine()!);
// Console.Write("В какую степень нужно возвести число? ");
// int number_pow = int.Parse(Console.ReadLine()!);

// Console.Write($"Число {number} в степени {number_pow} будет равно {NumPow(number, number_pow)}");

// int NumPow(int num, int num_pow)
// {
//     int result = number;
//     for (int i = 2; i <= number_pow; i++)
//     {
//         result *= number;
//     }
//     return result;
// }

// // **********************************************************************************************************************

// // Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

// // 452 -> 11
// // 82 -> 10
// // 9012 -> 12

// Console.WriteLine("Получаем случайное число от 100 до 10 000 к примеру.");
// int number = new Random().Next(100, 10001);
// Console.Write($"Сумма всех чисел {number} равна {DigitSum(number)}");

// int DigitSum(int num)
// {
//     int result = 0;
//     while (number > 0)
//     {
//         result += number % 10;
//         number /= 10;
//     }
//     return result;
// }

// // **********************************************************************************************************************

// // Задача 29: Напишите программу, которая задаёт массив из 8 рандомных элементов и выводит их на экран.

// // 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// // 6, 1, 33 -> [6, 1, 33]

// Console.Write("Введите число из скольки элементов создать массив: ");
// int array_size = int.Parse(Console.ReadLine()!);

// Console.WriteLine($"Массив состоящий из {array_size} случайных элементов представляет из себя: {string.Join(", ", NewArray(array_size))}");

// int[] NewArray(int array_size)
// {
//     int[] NewArray = new int[array_size];
//     for (int i = 0; i < array_size; i++)
//     {
//         NewArray[i] = new Random().Next(-999, 1000);
//     }
//     return NewArray;
// }

