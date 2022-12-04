// Создание алгоритма для решения задачи с двумя друзьями идущими навстречу и собакой.
int firstFriendSpeed = 1; //Скорость первого друга
int secondFriendSpeed = 2; //Скорость второго друга
int dogSpeed = 5; //Скорость собаки
int distance = 10000; //Дистанция между друзьями (метры)
int friend = 2; //Значеник К какому другу бежит собака (в данном случае старт движения собаки ОТ первого друга и ко второму другу)
int count = 0; //Счётчик сколько раз собака смогла добежать от одного друга к другому и вернуться обратно.

while(distance > 10)
{

    if(friend == 1)
    {
        int time = distance / (firstFriendSpeed + dogSpeed);
        friend = 2;
        distance = distance - (firstFriendSpeed +secondFriendSpeed) * time;
    }

   else
    {
        int time = distance / (secondFriendSpeed + dogSpeed);
        friend = 1;
        distance = distance - (firstFriendSpeed +secondFriendSpeed) * time;
    }

count += 1;

}

Console.Write("Собака пробежала между друзьями " + count +" раз.");

