package com.szu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by kamyang on 2017/10/31.
 */
public abstract class BaseHibernateDaoSupport extends HibernateDaoSupport {
    @Autowired
    public void  autoSetSessionFactory(SessionFactory sessionFactory){
        setSessionFactory(sessionFactory);
    }
}
