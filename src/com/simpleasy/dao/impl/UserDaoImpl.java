package com.simpleasy.dao.impl;

import com.simpleasy.dao.UserDao;
import com.simpleasy.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {


    @Resource
    private SessionFactory sessionFactory;

    //事务必须是开启的(Required)，否则获取不到
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public String add(User user) {
        getSession().save(user);
        return user.getId();
    }
}
