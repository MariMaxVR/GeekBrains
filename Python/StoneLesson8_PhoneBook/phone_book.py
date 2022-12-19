phone_book = []


def get_phone_book():
    global phone_book
    return phone_book


def set_phone_book(new_phone_book):
    global phone_book
    phone_book = new_phone_book


def add_contact(contact: list):
    global phone_book
    phone_book.append(contact)


def remove_contact(id):
    global phone_book
    phone_book.pop(id - 1)
    return True


def change_contact(id, contact):
    global phone_book
    phone_book.insert(id - 1, contact)
