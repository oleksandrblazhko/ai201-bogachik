package com.company;

import com.company.sleep.Sleep;
import com.company.sleep.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Egor", "1234567", "egor@gmail.com"); // створюємо користувача
        Sleep sleep = new Sleep(); // створюємо об'єкт сну
        sleep.recordSleep(4, 8, "23.06.2022"); // записуємо данні сну
        user.setSleep(sleep); // додаємо ці данні користувачеві
        System.out.println(user); // виводимо значення корисувача
    }
}
