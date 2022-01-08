package com.ahmedhossny61.newsapp;

public class News {
    private String title;
    private String author;
    private String date;
    private String url;
    private String section;
    public News(String mtitle,String mAuthor,String mdate,String murl,String msection){
        title=mtitle;
        author=mAuthor;
        date=mdate;
        url=murl;
        section=msection;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }

    public String getDate() {
        return date;
    }


    public String getSection() {
        return section;
    }

}
