# use lesson_3;
# Работаем с таблицей staff (скрипт создания в материалах к уроку)

# 1. Отсортируйте данные по полю заработная плата (salary) в порядке: убывания; возрастания
																					  
-- SELECT id, firstname, lastname, post, seniority, salary, age from staff order by salary DESC;
																					  -- ASC
-- SELECT id, firstname, lastname, post, seniority, salary, age from staff order by salary;

# 2. Выведите 5 максимальных заработных плат (salary)

-- SELECT salary from staff order by salary DESC LIMIT 5;


# 3. Посчитайте суммарную зарплату (salary) по каждой специальности (роst)

-- Select post, sum(salary) from staff group by post;

# 4. Найдите кол-во сотрудников со специальностью (post) «Рабочий» в возрасте от 24 до 49 лет включительно.

-- Select post, count(*) from staff where post = 'Рабочий' && age >= 24 && age <= 49
-- Group by post;

# 5. Найдите количество специальностей

-- Select count(distinct post) as number_of_posts FROM staff;

# 6. Выведите специальности, у которых средний возраст сотрудников меньше 30 лет

-- Select post, avg(age) from staff group by post having avg(age) < 30;