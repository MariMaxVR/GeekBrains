// // Задача 19
// // Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
// // 14212 -> нет
// // 12821 -> да
// // 23432 -> да


// Console.Write("Введите пятизначное число: ");
// int number = int.Parse(Console.ReadLine());

// int first_num = number / 10000;
// int second_num = (number / 1000) % 10;
// int penult_num = (number / 10) % 10;
// int last_num = number % 10;

// if (first_num == last_num && second_num == penult_num)
// {
//     Console.Write("Обалдеть! Это же палиндром!");
// }
// else
// {
//     Console.Write("Нет, это не палиндром.");
// }

// // ****************************************************************************************************************
// // Задача 21
// // Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
// // A (3,6,8); B (2,1,-7), -> 15.84
// // A (7,-5, 0); B (1,-1,9) -> 11.53

// Console.WriteLine("Введите координаты первой точки в формате X, Y, Z: ");

// int A_x1 = int.Parse(Console.ReadLine());
// int A_y1 = int.Parse(Console.ReadLine());
// int A_z1 = int.Parse(Console.ReadLine());

// Console.WriteLine("Введите координаты второй точки в формате X, Y, Z: ");

// int B_x2 = int.Parse(Console.ReadLine());
// int B_y2 = int.Parse(Console.ReadLine());
// int B_z2 = int.Parse(Console.ReadLine());

// double result = Math.Sqrt(Math.Pow(B_x2 - A_x1, 2) + Math.Pow(B_y2 - A_y1, 2) + Math.Pow(B_z2 - A_z1, 2));
// Console.Write($"Расстояние между этими двумя точками в 3D пространстве составляет: {result:f2}");

// // ****************************************************************************************************************
// // Задача 23
// // Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// // 3 -> 1, 8, 27
// // 5 -> 1, 8, 27, 64, 125

// Console.Write("Введите число: ");
// int number = int.Parse(Console.ReadLine());
// Console.WriteLine($"Таблица кубов от 1 до {number} равна:");

// for (int i = 1; i <= number; i++)

// {
//     Console.Write(Math.Pow(i, 3));
//     if (i < number)
//     {
//         Console.Write(", ");
//     }
// }