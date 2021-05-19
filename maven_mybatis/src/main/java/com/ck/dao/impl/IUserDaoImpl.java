package com.ck.dao.impl;

import com.ck.dao.IUserDao;
import com.ck.entity.User;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IUserDaoImpl implements IUserDao {
    @Override
    public List<User> select() {
        SqlSession session = MybatisUtil.openSession(false);
        IUserDao mapper = session.getMapper(IUserDao.class);
        return mapper.select();
    }
}
