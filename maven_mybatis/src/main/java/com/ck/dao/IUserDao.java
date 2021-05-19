package com.ck.dao;

import com.ck.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    @Select("select * from users")
    public List<User> select();
}
