package com.szu.user;

import java.util.List;

/**
 * Created by kamyang on 2017/10/30.
 */
public interface BaseDao<T> {
    boolean save(T object);
    boolean save(List<T> objects);
    boolean delete(T object);
    boolean delete(List<T> objects);
}
