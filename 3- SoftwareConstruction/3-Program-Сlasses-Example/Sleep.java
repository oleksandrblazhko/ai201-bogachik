package com.company.sleep;

public class Sleep {

    private int sleep_quality; // оцінка якості сну
    private String data; // дата заповнення
    private User human; // користувач
    private int hours_sleep; // кількість годин сну


    public User getHuman() {
        return human;
    }

    public int recordSleep(int sleep_quality, int hours_sleep, String data){// введення параметрів сну
        this.hours_sleep = hours_sleep; // введення у базу нового значення годин сну
        this.sleep_quality = sleep_quality; // введення у базу нового значення якості сну
        this.data = data; // введення у базу нової дати
        return 0;// повернення значення 0 після виповнення методу
    }

    public int[] viewSleep(){ // виведення покаників сну
        int A[] = new int[2]; // створення масиву для виведення значень
        A[0] = sleep_quality; // занесення у масив значень якості сну
        A[1] = hours_sleep; // занесення у масив кількість годин сну
        return A; // повернення значнь масиву
    }

    @Override
    public String toString() {
        return "Sleep{" +
                "sleep_quality=" + sleep_quality +
                ", hours_sleep=" + hours_sleep +
                ", data=" + data +
                '}';
    }
}

