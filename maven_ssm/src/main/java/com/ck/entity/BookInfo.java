package com.ck.entity;

public class BookInfo {
    private int bid;
    private String bname;
    private double price;
    private String dtime;
    private String imgurl;
    private int state;;
    private BookType bookType;

    public BookInfo() {
    }

    public BookInfo(int bid, String bname, double price, String dtime, String imgurl, int state, BookType bookType) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
        this.bookType = bookType;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}
