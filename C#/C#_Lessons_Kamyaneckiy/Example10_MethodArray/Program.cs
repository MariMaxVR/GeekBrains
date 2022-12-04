int[] array = { 3, 121, 9, 414, 39, 81, 78, 81 };

int n = array.Length;
int find = 139;
int index = 0;

while (index < n)
{
    if (array[index] == find)
    {

        Console.WriteLine(index);
        break;
    }
    else if (index == n - 1)
    {
        Console.Write("Указанный элемент в массиве не найден");
        break;

    }
    index++;
}








