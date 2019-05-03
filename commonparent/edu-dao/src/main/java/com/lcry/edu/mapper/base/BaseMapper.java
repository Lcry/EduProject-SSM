package com.lcry.edu.mapper.base;

/**
 * BaseMapper
 *
 * @author lcry
 * @date 2019/05/03 19:15
 * Mapper公共接口
 */
public interface BaseMapper<T> {
    public T findById(Integer id);

    public T findByUUID(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
