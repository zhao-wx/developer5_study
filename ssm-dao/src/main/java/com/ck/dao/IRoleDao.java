package com.ck.dao;

import com.ck.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleDao {
    @Select("SELECT * from role")
    public List<Role> queryAll();
}
