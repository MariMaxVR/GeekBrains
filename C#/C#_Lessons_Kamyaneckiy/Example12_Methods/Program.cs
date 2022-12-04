// //Вид 1

// void Method1()
// {
// Console.WriteLine("Метод 1 Привет Макс!");
// }

// //Method1();





// //Вид 2

// void Method2(string msg)

// {
//     Console.WriteLine(msg);
// }

// //Method2(msg: "Текст Сообщения)");

// void Method21(string msg, int count)

// {
//     int i = 0;
//     while (i < count)
//     {
//         Console.WriteLine(msg);
//         i++;
//     }
// }

// // Method21("Текст на экране", 4);
// // Method21(count: 4, msg: "Явное именование");




// //Вид 3

// int Method3()
// {
    
//     return DateTime.Now.Year;

// }

// int year = Method3();

// //Console.Write(year);




// //Вид 4


// // string Method4(int count, string Text)
// // {

// //     int i = 0;
// //     string result = String.Empty;
// //     while(i < count)
// //     {
// //         result = result + Text;
// //         i++;

// //     }
// //     return result;
// // }

// // string res = Method4(10, "Тест"); 
// // Console.WriteLine(res);


// // string Method4(int count, string Text)
// // {

    
// //     string result = String.Empty;
// //     for(int i = 0; i < count; i++)
// //     {
// //         result = result + Text;
// //     }
// //     return result;
// // }

// // string res = Method4(10, "Тест"); 
// // Console.WriteLine(res);



// //Цикл в цикле создание таблицы умножения.

// // for (int i = 2; i <= 10; i++)
// // {
// //     for(int j = 2; j<= 10; j++)
// //     {

// //         Console.WriteLine($"{i} x {j} = {i*j}");
// //     }
// //     Console.WriteLine();
// // }


// string text = "- Я думаю, - сказал князь, улыбаясь, - что, "
//             + "ежели бы вас послали вместо нашего милого Винценгероде,"
//             + "вы бы взяли приступом согласие прусского короля. "
//             + "Вы так красноречивы. Вы дадите мне чаю?";

// // string s = "qwerty
//              //012345
// //s[3] = r

// string Replace(string text, char oldValue, char newValue)
// {

//     string result = String.Empty;

//     int lenght = text.Length;
//     for (int i = 0; i < lenght; i++)
//     {

//     if (text[i] == oldValue)
//     {
//         result = result + $"{newValue}";
//     }    
//     else
//     {
//         result = result + $"{text[i]}";
//     }

//     }


//     return result;

// }

// string newText = Replace(text, ' ', '|');
// Console.WriteLine(newText);
// Console.WriteLine();

// newText = Replace (newText, 'к', 'К');

// Console.WriteLine(newText);
