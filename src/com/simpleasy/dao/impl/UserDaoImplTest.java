package com.simpleasy.dao.impl;

import com.simpleasy.common.SpringContext;
import com.simpleasy.dao.UserDao;
import com.simpleasy.entity.User;
import com.simpleasy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@Transactional(transactionManager = "transactionManager")
public class UserDaoImplTest {

    @Resource
    UserDao dao;

    @Test
    public void add() throws Exception {
        //User user = (User) SpringContext.getBean("user");
        UserService userService = (UserService) SpringContext.getBean("UserService");
        //user.setName("1");
        //user.setAge(12);
       // dao.add(user);
    }

}