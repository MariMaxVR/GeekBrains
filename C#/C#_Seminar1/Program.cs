﻿// // Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.

// // a = 5; b = 7 -> max = 7
// // a = 2 b = 10 -> max = 10
// // a = -9 b = -3 -> max = -3

// Console.Write("Введите первое число: ");
// int number1 = int.Parse(Console.ReadLine());
// Console.Write("Введите второе число: ");
// int number2 = int.Parse(Console.ReadLine());

// if (number1 > number2)
// {
//     Console.Write($"Наибольшим числом из введённых двух является число {number1}, а наименьшим является число {number2}.");
// }

// else if (number1 < number2)
// {
//     Console.Write($"Наибольшим числом из введённых двух является число {number2}, а наименьшим является число {number1}.");
// }

// else if (number1 == number2)
// {
//     Console.Write("Числа равнозначны.");
// }

// // ***********************************************************************************************************************

// // Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

// // 2, 3, 7 -> 7
// // 44 5 78 -> 78
// // 22 3 9 -> 22

// Console.Write("Введите первое число: ");
// int number1 = int.Parse(Console.ReadLine());
// Console.Write("Введите второе число: ");
// int number2 = int.Parse(Console.ReadLine());
// Console.Write("Введите третье число: ");
// int number3 = int.Parse(Console.ReadLine());

// int max_number = number1;

// //Здесь не ставил {} так как видел по роликам когда-то, что если в if одно условие то 
// //{} можно не ставить в начале и в конце условия. Проверил - всё работает.

// if (max_number < number2)  
 
//     max_number = number2;

// if (max_number < number3)
//     max_number = number3;

// Console.Write($"Максимальным числом из введёных чисел является число - {max_number}");

// // ***********************************************************************************************************************

// // Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).

// // 4 -> да
// // -3 -> нет
// // 7 -> нет

// Console.Write("Введите число: ");
// int number = int.Parse(Console.ReadLine());
// if (number % 2 == 0)
// {
//     Console.Write($"Число {number} является чётным числом.");
// }
// else
// {
//     Console.Write($"Число {number} нечётное.");
// }

// // ***********************************************************************************************************************

// // Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.

// // 5 -> 2, 4
// // 8 -> 2, 4, 6, 8

// Console.Write("Введите число: ");
// int number = int.Parse(Console.ReadLine());

// if (number % 2 == 0)
// {
//     int x = 2;
//     while (x <= number)
//     {
//         Console.Write($"{x} ");
//         x += 2;
//     }
// }

// else if (number % 2 != 0)
// {
//     int x = 2;
//     while (x < number)
//     {
//         Console.Write($"{x} ");
//         x += 2;
//     }
// }

// // ***********************************************************************************************************************