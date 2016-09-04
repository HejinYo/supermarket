package com.hello;

import com.mycms.common.SpringContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@Transactional(transactionManager = "transactionManager")
public class TestHello {
    @Test
    public void testHello(){
        IHelloMessage helloChina = (IHelloMessage) SpringContext.getBean("helloChina");
        helloChina.printMessage("贺双双");
    }
}
