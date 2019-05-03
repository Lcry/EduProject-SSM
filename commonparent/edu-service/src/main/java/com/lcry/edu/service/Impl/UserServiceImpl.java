package com.lcry.edu.service.Impl;

import com.lcry.edu.base.BaseServiceImpl;
import com.lcry.edu.model.User;
import com.lcry.edu.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl
 *
 * @author lcry
 * @date 2019/05/03 19:41
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    public User findById(Integer id) {
        //    测试一下
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User login(String username, String password) {
        return null;
    }
}
