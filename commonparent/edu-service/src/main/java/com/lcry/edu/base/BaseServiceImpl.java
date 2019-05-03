package com.lcry.edu.base;

import com.lcry.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseServiceImpl
 *
 * @author lcry
 * @date 2019/05/03 19:44
 *
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}

