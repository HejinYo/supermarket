package com.simpleasy.service.impl;

import com.simpleasy.dao.UserDao;
import com.simpleasy.entity.User;
import com.simpleasy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String add(User user) {
        System.out.println("service"+user.toString());
        return userDao.add(user);
    }
}
