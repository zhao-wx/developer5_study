package com.ck.service.impl;

import com.ck.dao.IRoleDao;
import com.ck.entity.Role;
import com.ck.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IRoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao iRoleDao;

    public List<Role> queryAll() {
        return iRoleDao.queryAll();
    }
}
