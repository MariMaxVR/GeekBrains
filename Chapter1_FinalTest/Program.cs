/* Задача:
Написать программу, которая из имеющегося массива строк формирует массив из строк, длина которых меньше либо равна 3 символа.
Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма.
При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.
*/

Console.Clear();
Console.Write("Укажите, из скольки элементов будет сформирован первоначальный строковый массив? >>> ");
int elements = int.Parse(Console.ReadLine()!);
string[] array = new string[elements];

for (int i = 0; i < elements; i++)
{
    Console.Write("Введите элемент массива: ");
    array[i] = Console.ReadLine()!;
    if (array[i] == String.Empty)
    {
        Console.WriteLine("Введена пустая строка! Повторите ввод заново!");
        i--;
    }
}

Console.WriteLine($"Получился массив, состоящий из {elements} строковых элементов и имеющий вид: ");
PrintStringArray(array);
Console.WriteLine();

int counter = 0;

for (int i = 0; i < array.Length; i++)
{
    if (array[i].Length <= 3) counter++;
}

string[] resultArray = new string[counter];
for (int i = 0, j = 0; i < array.Length; i++)
{
    if (array[i].Length <= 3)
    {
        resultArray[j] = array[i];
        j++;
    }
}


if (resultArray.Length > 0)
{
    Console.WriteLine("Новый массив на основе ранее созданного и состоящий из элементов, длина которых меньше либо равна 3 символа имеет вид: ");
    PrintStringArray(resultArray);
}
else
    Console.WriteLine($"[Элементов удовлетворяющих условию в первоначальном массиве нет.]");



// Метод печати строкового массива.
void PrintStringArray(string[] array)
{
    Console.WriteLine("[" + String.Join(", ", array) + "]");
}

