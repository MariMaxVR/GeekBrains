USE lesson_4;

# 1. Подсчитать общее количество лайков, которые получили пользователи младше 12 лет.

SELECT COUNT(*) AS 'Количество лайков'
FROM likes WHERE user_id IN (SELECT user_id FROM profiles WHERE TIMESTAMPDIFF(YEAR, birthday, NOW()) < 12);

# 2. Определить кто больше поставил лайков (всего): мужчины или женщины.

SELECT CASE (gender)
WHEN 'm' THEN 'Мужчины'
WHEN 'f' THEN 'Женщины'
END AS 'Кто сколько ставит:', COUNT(*) as 'Количество:'
FROM profiles INNER JOIN likes 
WHERE likes.user_id = profiles.user_id
GROUP BY gender;
-- LIMIT 1 если нужна одна запись.

# 3. Вывести всех пользователей, которые не отправляли сообщения.

SELECT DISTINCT id AS 'ID Пользователя:', firstname AS 'Имя',  lastname AS 'Фамилия'
FROM users WHERE NOT EXISTS (SELECT from_user_id FROM messages WHERE users.id = messages.from_user_id);