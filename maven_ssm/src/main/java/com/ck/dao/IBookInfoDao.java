package com.ck.dao;

import com.ck.entity.BookInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookInfoDao {


    public List<BookInfo> select();


}
