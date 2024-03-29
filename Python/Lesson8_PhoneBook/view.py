def show_menu():
    print('\n********************************\n'
          '|Выберите нужный пункт меню: ↓ |\n'
          '|------------------------------|\n'
          '|1. Загрузить телефонную книгу |\n'
          '|------------------------------|\n'
          '|2. Показать телефонную книгу  |\n'
          '|------------------------------|\n'
          '|3. Сохранить телефонную книгу |\n'
          '|------------------------------|\n'
          '|4. Добавить контакт           |\n'
          '|------------------------------|\n'
          '|5. Изменить контакт           |\n'
          '|------------------------------|\n'
          '|6. Удалить контакт            |\n'
          '|------------------------------|\n'
          '|7. Найти контакт              |\n'
          '|------------------------------|\n'
          '|0. Выход из программы         |\n'
          '|______________________________|\n')
    return user_choice()


def user_choice():
    while True:
        try:
            choice = int(input('Пункт меню: '))
            if choice >= 0 and choice <= 7:
                return choice
            else:
                print('Такого пункта в меню нет, выберите повторно.')
        except:
            print('Введено некорректное значение!')


def print_phone_book(phone_book: list):
    if len(phone_book) > 0:
        print('\nТелефонная книга на данный момент имеет вид: ')
        for id, contact in enumerate(phone_book, 1):
            print(id, *contact)
    else:
        print('\nТелефонная книга пуста или не загружена. Попробуйте загрузить телефонную книгу.')


def print_find_contact(phone_book: list):
    if len(phone_book) > 0:
        print('\nТелефонная книга на данный момент имеет вид: ')
        for id, contact in enumerate(phone_book, 1):
            print(id, *contact)
    else:
        print('\nПо указанным параметрам ни один контакт не найден. Уточните параметры поиска.')


def exit():
    print('\nРабота программы завершена. До свидания.')


def load_successful():
    print('\nЗагрузка телефонной книги выполнена успешно.')


def save_successful():
    print('\nСохранение телефонной книги выполнено успешно.')


def remove_successful():
    print('\nУдаление контакта выполнено успешно.')


def change_successful():
    print('\nИзменение контакта выполнено успешно.')


def remove_error():
    print('\nУдаление контакта не выполнено! Проверьте корректность введения ID.')


def save_error():
    print('\nСохранение телефонной книги не выполнено! Книга пуста.')


def find_error():
    print('\nПо указанным параметрам ни один контакт не найден. Уточните параметры поиска.')


def change_error():
    print('\nИзменение контакта не выполнено! Проверьте корректность введения ID.')


def new_contact():
    surname = (input('Введите Фамилию контакта: ')).capitalize()
    name = (input('Введите Имя контакта: ')).capitalize()
    patronymic = (input('Введите Отчество контакта: ')).capitalize()
    phone_number = input('Введите номер контакте: ').replace('8', '+7', 1)
    comment = input('Введите комментарий для контакта: ').capitalize()
    return [surname, name, patronymic, phone_number, comment]


def find_input():
    text = input('\nПо какому параметру выполнить поиск контактов?\n'
                 'Введите полностью или частично ФИО / номер / комментарий:\n'
                 '>>> ')
    return text


def remove_choice():
    try:
        id = int(input('\nВведите ID номер контакта для удаления: '))
        return id
    except:
        print('\nВведены некорректные данные! Укажите ID контакта.')


def change_choice():
    try:
        id = int(input('\nВведите ID номер контакта для изменения: '))
        return id
    except:
        print('\nВведены некорректные данные! Укажите ID контакта.')

