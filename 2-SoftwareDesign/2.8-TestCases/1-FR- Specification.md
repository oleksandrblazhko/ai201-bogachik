Функціональна вимога FR2.1
Метод-функція recordSleep

### Вхідні параметри:

1. sleep_quality - якість сну
- умова 1) Тільки одне вибране значення

2. hours_sleep - кількість годин сну
- умова 2) Цифри тільки від 0 до 24

3. data - дата внесення даних
- умова 3) значення можуть бути тільки числовими.
- умова 4) Формат часу дд.мм.рррр.


### Вихідні параметри:

- значення = 1 – дані успішно введено;
- значення = -1 – неправильно вибрано якість;
- значення = -2 – кількість сну не відповідвє умовам;
- значення = -3 – дата не відповідвє умовам.
