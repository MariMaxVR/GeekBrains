Console.Write("Введите ваше имя: ");
string? user_name = Console.ReadLine();

if (user_name?.ToLower() == "макс")
{
    Console.WriteLine("Ура! это же Максим!");
}

else
{
    Console.Write("Привет, ");
    Console.WriteLine(user_name);
}