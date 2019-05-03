package com.lcry.controller;

import com.lcry.edu.model.User;
import com.lcry.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController
 *
 * @author lcry
 * @date 2019/05/03 19:55
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    测试根据id查询用户
    @RequestMapping("find")
    public String find(Integer id){
        System.out.println(".....");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

//    测试插入用户
    @RequestMapping("insert")
    public void insert(User user){
        System.out.println(user);
        userService.insert(user);
    }
}

