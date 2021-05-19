package com.ck.entity;

import java.util.List;

public class BookType {
    private int btid;
    private String btname;
    private List<BookInfo> bookInfoList;

    public BookType() {
    }

    public BookType(int btid, String btname, List<BookInfo> bookInfoList) {
        this.btid = btid;
        this.btname = btname;
        this.bookInfoList = bookInfoList;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public List<BookInfo> getBookInfoList() {
        return bookInfoList;
    }

    public void setBookInfoList(List<BookInfo> bookInfoList) {
        this.bookInfoList = bookInfoList;
    }
}
