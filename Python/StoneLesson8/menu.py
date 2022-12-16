import view as VIEW
import phone_book as PB
import data_base as DB


def main_menu(choice: int):
    match choice:
        case 1:
            DB.load_phone_book()
            VIEW.load_successful()

        case 2:
            phone_book = PB.get_phone_book()
            VIEW.print_phone_book(phone_book)

        case 3:
            try:
                DB.save_phone_book()
                VIEW.save_successful()
            except:
                VIEW.save_error()

        case 4:
            contact = VIEW.new_contact()
            PB.add_contact(contact)

        case 5:
            phone_book = PB.get_phone_book()
            VIEW.print_phone_book(phone_book)
            id = VIEW.change_choice()
            try:
                if PB.remove_contact(id):
                    contact = VIEW.new_contact()
                    PB.change_contact(id, contact)
                    VIEW.change_successful()
            except:
                VIEW.change_error()

        case 6:
            phone_book = PB.get_phone_book()
            VIEW.print_phone_book(phone_book)
            id = VIEW.remove_choice()
            try:
                PB.remove_contact(id)
                VIEW.remove_successful()
            except:
                VIEW.remove_error()

        case 7:
            pass

        case 0:
            VIEW.exit()
            return True


def start():
    while True:
        choice = VIEW.show_menu()
        if main_menu(choice):
            break
