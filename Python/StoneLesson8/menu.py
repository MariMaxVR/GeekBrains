import view
import phone_book as PB
import data_base as DB


def main_menu(choice: int):
    match choice:
        case 1:
            DB.load_phone_book()
            view.load_successful()
        case 2:
            phone_book = PB.get_phone_book()
            view.print_phone_book(phone_book)
        case 3:
            DB.save_phone_book()
            view.save_successful()
        case 4:
            contact = view.new_contact()
            PB.add_contact((contact))
        case 5:
            pass
        case 6:
            phone_book = PB.get_phone_book()
            view.print_phone_book()
            id = view.remove_choice()
            if PB.remove_contact(id):
                view.remove_successful()
        case 7:
            pass
        case 0:
            view.exit()
            return True


def start():
    while True:
        choice = view.show_menu()
        if main_menu(choice):
            break
