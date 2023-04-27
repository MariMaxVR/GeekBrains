use lesson_4;

# 1. Создайте представление, в которое попадет информация о пользователях (имя, фамилия, город и пол), которые не старше 20 лет.

CREATE OR REPLACE VIEW ShowUsers AS SELECT firstname, lastname, hometown, gender FROM users JOIN profiles ON users.id = profiles.user_id
WHERE TIMESTAMPDIFF(YEAR, birthday, NOW()) < 20;

/* 2. Найдите количество отправленных сообщений каждым пользователем и выведите ранжированный список пользователь,
 указать имя и фамилию пользователя, количество отправленных сообщений и место в рейтинге 
 первое место у пользователя с максимальным количеством сообщений) (используйте DENSE_RANK)*/
 
SELECT DENSE_RANK() OVER (ORDER BY COUNT(from_user_id) DESC) AS '№ в Рейтинге',
COUNT(from_user_id) AS 'Отправлено сообщений', firstname AS 'Имя', lastname AS 'Фамилия'
FROM users JOIN messages ON users.id = messages.from_user_id 
GROUP BY users.id;

/* 3. Выберите все сообщения, отсортируйте сообщения по возрастанию даты отправления (created_at) 
 и найдите разницу дат отправления между соседними сообщениями, получившегося списка. (используйте LEAD или LAG)*/
 
SELECT id, from_user_id, to_user_id, body, created_at, 
LAG(created_at, 1, 0) OVER (PARTITION BY TIMESTAMPDIFF(MINUTE, created_at, created_at)) AS LAG_Created,
LEAD(created_at, 1, 0) OVER (PARTITION BY TIMESTAMPDIFF(MINUTE, created_at, created_at)) AS LEAD_Created
FROM messages ORDER BY TIMESTAMPDIFF(MINUTE, created_at, NOW()) DESC;