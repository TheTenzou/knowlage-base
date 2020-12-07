# Базы знаний
Самостоятельные работы по базам знаний

## Первая
Пентагональные числа генерируются по формуле

`P (n)= n (3 n −1) / 2` 

Первые десять пятиугольных чисел:

`1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...`

Видно, что `P(4) + P(7) = 22 + 70 = 92 = P 8` . Однако их различие `70 - 22 = 48` не является пятиугольным. Найдите пару пятиугольных чисел `P j` и `P k` ,
меньших числа 1000000 для которых их сумма и разность пятиугольны и `D = | P k - P j |` сведено к минимуму; какова стоимость D?
Задача должна быть решена без использования списков.

## Вторая
Отсортировать введенный список по возрастанию (методом вставок).

## Третья
Дан текст, являющийся шифром, полученным применением шифра
Цезаря. (Алфавит определите самостоятельно). Реализовать предикат,
позволяющий получить все возможные исходные тексты.

## Четвертая
Пять студентов должны посещать лекции всю неделю, но по определенным ими установленным правилам, а именно:

1. Если пришли Андрей и Дмитрий, то Бориса быть не должно, но если
Дмитрий не пришел, то Борис должен быть, а Виктор быть не должен.
2. Если Виктор пришел, то Андрея быть не должно и наоборот.
3. Если Дмитрий пришел, то Григория быть не должно.
4. Если Бориса нет, то Дмитрий должен быть, но если нет также и Виктора, а
если Виктор есть, Дмитрия быть не должно, но должен быть Григорий.
5. Каждый день студенты должны приходить в разных сочетаниях. 

Какие это сочетания?

## Пятая

Составить предикат средствами SWI-Prolog, который составляет и
выводит в файл все слова алфавита `{a,b,c,d,e,f}` длины 8, состоящих из 3
различных букв.

## Шестая

Дан взвешенный неориентированный граф. Построить остов наименьшего веса с помощью алгоритма Крускала.

## Седьмая

Разработать программу в среде SWI-prolog, которая позволяет отвечать на вопросы об объектах предметной 
области (персонажи книги, фильма, объекты недвижимости, виды животных, художники 19 века, политические 
деятели, студенты Вашего факультета, марки шампуней и т.д.), (выбор темы не ограничен). Приложение задает 
пользователю вопросы и пользователь на них отвечает, в результате чего программа формирует ответ (кто был загадан). 
Для реализации обязательно воспользоваться механизмом динамической базы фактов. Если в базе данных нет 
информации о введенном объекте, программа предлагает пользователю ввести наименование объекта и сохранить 
его в базу фактов. При следующем запуске данный объект уже должен быть доступен для отгадывания. 
Для сдачи подготовить базу из 20-30 объектов с возможностью интерактивного расширения до 40-50 
объектов. Для сдачи формализовать предметную область и подготовить модель в отдельном файле 
в свободной форме (для обоснования выбора вопросов, задаваемых пользователю).