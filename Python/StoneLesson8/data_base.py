import phone_book as PB


def load_phone_book():
    with open('phone_book.txt', 'r', encoding='UTF-8') as file:
        phone_book = file.readlines()
    PB.set_phone_book(str_to_list(phone_book))


def str_to_list(phone_book: list):
    new_phone_book = []
    for i in phone_book:
        new_phone_book.append(i.strip().split(' * '))
    return new_phone_book


def save_phone_book():
    with open('phone_book.txt', 'w', encoding='UTF-8') as file:
        file.write(list_to_str())


def list_to_str():
    phone_book_list = PB.get_phone_book()
    new_phone_book = []
    for i in phone_book_list:
        new_phone_book.append(' * '.join(i) + '\n')
    new_phone_book[-1] = new_phone_book[-1][:-1]
    return ''.join(new_phone_book)


def find_contact(phone_book, text):
    find_list = []
    if len(phone_book) > 0:
        for i in range(len(phone_book)):
            for j in range(len(phone_book[i])):
                if text in phone_book[i][j]:
                    find_list.append(phone_book[i])
                    break
        return find_list
    else:
        print('Телефонная книга пуста или не загружена. Попробуйте загрузить телефонную книгу.')
