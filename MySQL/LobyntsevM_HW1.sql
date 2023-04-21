
/* Задача 1
Создайте таблицу с мобильными телефонами, используя графический интерфейс. 
Заполните БД данными (поля и наполнение см. в презентации)
*/
-- создание таблиц
USE lesson_1;
CREATE TABLE `lesson_1`.`mobile_phones` (
`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(20) NOT NULL,
  `manufacturer` VARCHAR(45) NOT NULL,
  `product_count` INT UNSIGNED NOT NULL,
  `price` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`));
  
-- наполнение нужными данными
INSERT INTO `lesson_1`.`mobile_phones` (`product_name`, `manufacturer`, `product_count`, `price`) VALUES ('iPhone X', 'Apple', '3', '76000');
INSERT INTO `lesson_1`.`mobile_phones` (`product_name`, `manufacturer`, `product_count`, `price`) VALUES ('iPhone 8', 'Apple', '2', '51000');
INSERT INTO `lesson_1`.`mobile_phones` (`product_name`, `manufacturer`, `product_count`, `price`) VALUES ('Galaxy S9', 'Samsung', '2', '56000');
INSERT INTO `lesson_1`.`mobile_phones` (`product_name`, `manufacturer`, `product_count`, `price`) VALUES ('Galaxy S8', 'Samsung', '1', '41000');
INSERT INTO `lesson_1`.`mobile_phones` (`product_name`, `manufacturer`, `product_count`, `price`) VALUES ('P20 Pro', 'Huawei', '5', '36000');

/* Задача 2
Выведите название, производителя и цену для товаров, количество которых превышает 2
*/
-- выборки данных
SELECT product_name, manufacturer, price FROM mobile_phones WHERE product_count > 2;

/* Задача 3
Выведите весь ассортимент товаров марки “Samsung”
*/
-- выборки данных
SELECT product_name, product_count , price FROM mobile_phones WHERE manufacturer = 'Samsung';

/* Задача 4
(по желанию)* С помощью регулярных выражений найти:
4.1. Товары, в которых есть упоминание "Iphone"
4.2. Товары, в которых есть упоминание "Samsung"
4.3. Товары, в которых есть ЦИФРЫ
4.4. Товары, в которых есть ЦИФРА "8" 
*/
-- выборки данных
SELECT product_name, product_count , price FROM mobile_phones WHERE product_name REGEXP 'iPhone';
SELECT product_name, product_count , price FROM mobile_phones WHERE manufacturer REGEXP 'Samsung';
SELECT product_name, product_count , price FROM mobile_phones WHERE product_name REGEXP '[0-9]';
SELECT product_name, product_count , price FROM mobile_phones WHERE product_name REGEXP '8';

