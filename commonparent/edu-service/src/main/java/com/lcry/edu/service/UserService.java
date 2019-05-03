package com.lcry.edu.service;

import com.lcry.edu.base.BaseService;
import com.lcry.edu.model.User;

/**
 * UserService
 *
 * @author lcry
 * @date 2019/05/03 19:40
 */
public interface UserService extends BaseService<User> {

    //特有的方法
    public User login(String username, String password);
}
