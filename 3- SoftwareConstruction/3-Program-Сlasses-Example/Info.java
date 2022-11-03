package com.company.sleep;

public class Info {
    private String[] video; // ссилки на інформаційні відео
    private String[] articles; // ссилки на інформаційні статті
    private String[] news; // новини сайту
    private String support; // контакти підтримки сайту
    private String[] courses; // інормація про курси на сайті


    public String[] viewVideo(){
        return video;
    }
    public String[] viewArticles(){
        return articles;
    }
    public String[] viewNews(){
        return news;
    }
    public String[] viewCourses(){
        return courses;
    }

    public void setVideo(String[] video) {
        this.video = video;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public void setNews(String[] news) {
        this.news = news;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
