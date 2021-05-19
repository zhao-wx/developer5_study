package com.ck.controller;

import com.ck.entity.Role;
import com.ck.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Role> select(){
        return roleService.queryAll();
    }
}
