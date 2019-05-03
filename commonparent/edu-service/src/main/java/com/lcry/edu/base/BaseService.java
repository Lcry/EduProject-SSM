package com.lcry.edu.base;

/**
 * BaseService
 *
 * @author lcry
 * @date 2019/05/03 19:43
 * service公共的方法
 */
public interface BaseService<T> {
    public T findById(Integer id);

    public T findByUUID(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
