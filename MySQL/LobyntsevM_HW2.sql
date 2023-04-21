# Удалим базу если она создана для очистки:
drop database if exists lesson_2;
# Создадим базу заново:
create database lesson_2;

use lesson_2;

# 1. Используя операторы языка SQL, создайте табличку “sales”. Заполните ее данными.

create table sales
(
	id int primary key auto_increment not null unique,
	order_date date not null,
	count_product int
);
insert into `sales` (order_date, count_product)
values
('2022-01-01', 156),
('2022-01-02', 180),
('2022-01-03', 21),
('2022-02-04', 124),
('2022-01-05', 341);

# 2. Сгруппируйте значений количества в 3 сегмента — меньше 100, 100-300 и больше 300.

select 
id as 'id заказа',
case 
when count_product < 100 then 'Маленький заказ'
when count_product between 100 and 300 then 'Средний заказ'
when count_product > 300 then 'Большой заказ'
else 'Не определено'
end as 'Тип заказа'
from sales;

/* 
3. Создайте таблицу “orders”, заполните ее значениями. Выберите все заказы. 
В зависимости от поля order_status выведите столбец full_order_status: 
OPEN – «Order is in open state»; 
CLOSED - «Order is closed»; 
CANCELLED - «Order is cancelled»
*/

create table orders
(
	id int primary key auto_increment not null unique,
    employee_id varchar(10) not null,
    amount float,
    order_status varchar(20) 
);

insert into orders (employee_id, amount, order_status)
values
('e03', 15.00, 'OPEN'),
('e01', 25.50, 'OPEN'),
('e05', 100.70, 'CLOSED'),
('e02', 22.18, 'OPEN'),
('e04', 9.50, 'CANCELLED');

select
id, 
employee_id, 
amount,
order_status,
case 
when order_status = 'OPEN' then 'Order is in open state'
when order_status = 'CLOSED' then 'Order is closed'
when order_status = 'CANCELLED' then 'Order is cancelled'
end as 'full_order_status'
from orders;

# 4. Чем NULL отличается от 0?

/*
	0 - это значение, пусть и пустое (к примеру результат математичекой операции), а NULL - это ничто,
    то есть отсутствие какого-либо значения вовсе. Также к примеру может служить для определения не заданного значения строки,
    ведь визуально полностью пустая строка не имеет никаких символов, однако она имеет значение - пустую строку, а NULL в этом 
    случае показывал бы, что значения для данной строки не задано вовсе.
    Ноль это ноль, а NULL это ничто, пустота. NULL не поддаётся сравнению, когда как 0 можно сравнить с помощью операторов.
*/