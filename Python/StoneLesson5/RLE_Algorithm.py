# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.
# Входные и выходные данные хранятся в отдельных текстовых файлах.

def rle_input():
    with open('rle_input.txt', 'r', encoding='UTF8') as file:
        file = file.readline()
    return file


def rle_output(text):
    with open('rle_output.txt', 'w') as file:
        file = file.write(text)


def rle_encoding(text):
    count = 1
    result = ''
    for i in range(len(text) - 1):
        if text[i] == text[i + 1]:
            count += 1
        else:
            result = result + str(count) + text[i]
            count = 1
    if count > 1 or (text[len(text) - 2] != text[-1]):
        result = result + str(count) + text[-1]
    return result


def rle_decoding(text):
    number = ''
    result = ''
    for i in range(len(text)):
        if not text[i].isalpha():
            number += text[i]
        else:
            result = result + text[i] * int(number)
            number = ''
    return result


rle_str = rle_input()

print(f"Исходный текст: {rle_str}")

for i in range(len(rle_str)):
    if rle_str[i].isdigit():
        rle_dec = rle_decoding(rle_str)
        print(f"Текст после дешифровки: {rle_dec}")
        rle_output(rle_dec)
        break
    else:
        rle_enc = rle_encoding(rle_str)
        print(f"Текст после кодировки: {rle_enc}")
        rle_output(rle_enc)
        break
