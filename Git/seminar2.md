# Инструкция для работы с Git и удалёнными репозиториями

## **Что такое Git?** 
***
___
---
<br/>

**Git** - это одна из реализаций распределённых систем контроля версий, имеющая как и локальные, так и удалённые репозитории. ***Является самой популярной*** реализацией систем контроля версий в мире.

<br/>

## **Подготовка репозитория**

Для создание репозитория необходимо выполнить команду *git init*  в папке с репозиторием и у Вас создаться репозиторий (появится скрытая папка ***.git***)

<br/>

## **Создание коммитов**

***Git add***

Для добавления измений в коммит используется команда _git add_. Чтобы использовать команду _git add_ напишите *git add* **<имя файла>**

<br/>

## **Просмотр состояния репозитория**
Для того, чтобы посмотреть состояние репозитория используется команда _git status_. Для этого необходимо в папке с репозиторием написать *git status*, и Вы увидите ***были ли*** измения в файлах, или их ***не было***.

<br/>

## **Создание коммитов**
Для того, чтобы создать коммит(*сохранение*) необходимо выполнить команду _git commit_. Выполняется она так: _git commit -m "<сообщение к коммиту>_. Все файлы для коммита ~~не~~ **должны** быть **ДОБАВЛЕНЫ** и сообщение к коммиту писать ~~необязательно~~ **ОБЯЗАТЕЛЬНО**.

<br/>

## **Перемещение между сохранениями**
Для того, чтобы перемещаться между коммитами, используется команда _git checkout_. Используется она в ***папке*** с пепозиторием следующим образом: _git checkout_ ***<номер коммита>***

<br/>

## **Журнал изменений**
Для того, чтобы посмтреть все сделанные изменения в репозитории, используется команда *git log*. Для этого достаточно выполнить команду _git log_ в папке с репозиторием

<br/>

## **Ветки в Git**

***Создание ветки***

Для того, чтобы создать ветку, используется команда _git branch_. Делается это следующим образом в папке с репозиторием: *git branch* ***<название новой ветки>***

***Слияние веток***

Для того чтобы дабавить ветку в текущую ветку используется команда *git merge* <name branch>

***Удаление веток***
Для удаления ветки ввести команду _"git branch -d 'name branch'"_

---

<br/>

# Ещё некоторые другие возможности языка разметки Markdown:

1. **Вставка картинок в виде ссылок и напрямую**

[Картинка с котиком ссылкой](https://catherineasquithgallery.com/uploads/posts/2021-02/1612575999_29-p-chernaya-koshka-na-zelenom-fone-45.jpg)

![Картинка с котиком напрямую](https://catherineasquithgallery.com/uploads/posts/2021-02/1612575999_29-p-chernaya-koshka-na-zelenom-fone-45.jpg)

---

<br/>

2. **Добавление ссылок интернет-ресурсов:**

</br>

[Ссылка на поисковую страницу Яндекс](https://yandex.ru)

[Ссылка на страницу измерения скорости интернет-соединения](https://speedtest.net)



</br>

3. **Создание различного вида списков:**

### Нумерованные:

1. Раз
2. Два
3. Три

### Не нумерованные:

* Раз
* Два
* Три
---
* Раз
- Два
+ Три

</br>

4. **Добавление цитат в текст:**

>Послушайте! Ведь, если звезды зажигают — значит — это кому-нибудь нужно?
---
 
>И тогда я прочитал ей стих:
>>Увидеть мир в одной песчинке </br>
>>И Космос весь - в лесной травинке! </br>
>>Вместить в ладони бесконечность </br>
>>И в миге мимолетном вечность! </br>
***