package com.lcry.edu.mapper;

import com.lcry.edu.mapper.base.BaseMapper;
import com.lcry.edu.model.User;

/**
 * UserMapper
 *
 * @author lcry
 * @date 2019/05/03 19:16
 * 定义特殊的方法
 */
public interface UserMapper extends BaseMapper<User> {
//    定义特有的方法
    public  void login();
}
