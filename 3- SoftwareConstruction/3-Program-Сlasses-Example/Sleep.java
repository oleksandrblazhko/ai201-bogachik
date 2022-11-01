package com.company.sleep;

public class Sleep {

    private int sleep_quality; // оцінка якості сну
    private String data; // дата заповнення
    private User human; // користувач
    private int hours_sleep; // кількість годин сну


    public String getData() {
        return data;
    }

    public User getHuman() {
        return human;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int recordSleep(int sleep_quality, int hours_sleep){
        this.hours_sleep = hours_sleep;
        this.sleep_quality = sleep_quality;
        return 0;
    }

    public int[] viewSleep(){
        int A[] = new int[2];
        A[0] = sleep_quality;
        A[1] = hours_sleep;
        return A;
    }
}
