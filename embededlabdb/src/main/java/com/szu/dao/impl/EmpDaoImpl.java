package com.szu.dao.impl;


import com.szu.dao.EmpDao;
import com.szu.db.pojo.Employee;
import org.springframework.stereotype.Repository;

/**
 * Created by kamyang on 2017/10/31.
 */
@Repository
public class EmpDaoImpl extends BaseHibernateDaoSupport implements EmpDao {

    public void save(Employee employee) {
        getHibernateTemplate().save(employee);
    }
}
