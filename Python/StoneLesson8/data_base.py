import phone_book


def load_phone_book():
    with open('phone_book.txt', 'r', encoding='UTF-8') as file:
        phone_book = file.readlines()
    phone_book.set_phone_book(str_to_list(phone_book))


def str_to_list(phone_book: list):
    new_phone_book = []
    for i in phone_book:
        new_phone_book.append(i.strip().split(';'))
    return new_phone_book


def save_phone_book():
    with open('phone_book.txt', 'w', encoding='UTF-8') as file:
        file.write(list_to_str())


def list_to_str():
    phone_book_list = phone_book.get_phone_book()
    new_phone_book = []
    for i in phone_book_list:
        new_phone_book.append(';'.join(i) + '\n')
    new_phone_book[-1] = new_phone_book[-1][:-1]
    return ''.join(new_phone_book)
