package com.szu.dao.impl;


import com.szu.dao.UserDao;
import com.szu.db.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by kamyang on 2017/10/31.
 */
@Repository
public class UserDaoImpl extends BaseHibernateDaoSupport implements UserDao {

    public void save(User user) {
        getHibernateTemplate().save(user);
    }
}
