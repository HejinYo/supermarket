package com.mycms.test;

import com.mycms.common.SpringContext;
import com.mycms.dao.IStudentsDao;
import com.mycms.dao.impl.StudentsImpl;
import com.mycms.entity.Students;
import com.mycms.service.IStudentsService;
import com.simpleasy.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@Transactional(transactionManager = "transactionManager")
public class TestHibernate {

    @Test
    public void testStudentsDao() throws Exception {
        IStudentsService studentsService = (IStudentsService) SpringContext.getBean("studentsService");
        List list = studentsService.queryAllStudents();
        Iterator<Students> it = list.iterator();
        while (it.hasNext()) {
            String sname = it.next().toString();
            System.out.println(sname);
        }
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void TestStudentsAdd() throws Exception {
        IStudentsDao studentsService = (IStudentsDao) SpringContext.getBean("studentsDao");
        //IStudentsService studentsService = (IStudentsService) SpringContext.getBean("studentsService");
        Students s = (Students) SpringContext.getBean("students");
        s.setSname("测试333");
        System.out.print(studentsService.addStudents(s));

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void TestqueryStudentsById(){
        IStudentsService studentsService = (IStudentsService) SpringContext.getBean("studentsService");
    }

}
