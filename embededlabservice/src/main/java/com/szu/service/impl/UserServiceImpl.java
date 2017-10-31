package com.szu.service.impl;

import com.szu.dao.UserDao;
import com.szu.db.pojo.User;
import com.szu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kamyang on 2017/10/31.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }
}
