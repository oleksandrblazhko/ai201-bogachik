package com.company.sleep;

public class Сourses {
    private String teacher; // викладач курсу
    private Info information_course; // дані курсу
    private String description; // інформація про курс
    private String session_data; // дата проведення

    public String getTeacher() {
        return teacher;
    }

    public Info getInformation_course() {
        return information_course;
    }

    public String getDescription() {
        return description;
    }

    public String getSession_data() {
        return session_data;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setInformation_course(Info information_course) {
        this.information_course = information_course;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSession_data(String session_data) {
        this.session_data = session_data;
    }
}
