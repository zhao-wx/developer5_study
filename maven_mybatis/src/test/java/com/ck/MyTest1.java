package com.ck;

import com.ck.dao.IUserDao;
import com.ck.dao.impl.IUserDaoImpl;
import com.ck.entity.User;
import org.junit.Test;

import java.util.List;

public class MyTest1 {
    @Test
    public void test1(){
        List<User> select = new IUserDaoImpl().select();
        System.out.println(select);
    }
}
