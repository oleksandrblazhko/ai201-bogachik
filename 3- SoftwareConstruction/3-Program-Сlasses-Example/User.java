package com.company.sleep;

public class User {
    private String nickname; // ям'я корисувача
    private String password; // парололь користувача
    private String mail; // почта користувача
    private Health mental_health; // психічне та фізичне здоров'я користувача
    private Info information; // інформаційна панель
    private Sleep sleep; // інформація про сон користувача

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public Health getMental_health() {
        return mental_health;
    }

    public Info getInformation() {
        return information;
    }

    public Sleep getSleep() {
        return sleep;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMental_health(Health mental_health) {
        this.mental_health = mental_health;
    }

    public void setInformation(Info information) {
        this.information = information;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }

    public boolean authorization(String nickname, String password){
        return this.nickname.equals(nickname) && this.password.equals(password);
    }

}
