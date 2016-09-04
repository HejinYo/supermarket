package com.mycms.dao.impl;

import com.mycms.dao.IStudentsDao;
import com.mycms.entity.Students;
import jdk.nashorn.internal.runtime.ECMAException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentsDao")
public class StudentsImpl implements IStudentsDao {

    @Resource
    private SessionFactory sessionFactory;

    //事务必须是开启的(Required)，否则获取不到
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    //查询所有学生资料
    public List<Students> queryAllStudents() {
        List<Students> list = null;
        String hql = "from Students";
        Query query = getSession().createQuery(hql);
        list = query.list();
        return list;
    }

    @Override
    //按照ID查询一个学生资料
    public Students queryStudentsBySid(String sid) {
        Students students =(Students) getSession().get(Students.class,sid);
        return students;
    }

    //添加一个学生资料
    @Override
    public boolean addStudents(Students s) {
        s.setSid(getNewSid());
        getSession().save(s);
        return true;
    }

    //修改一个学生资料
    @Override
    public boolean updateStudents(Students s) {
        getSession().update(s);
        return true;
    }

    //删除一个学生资料
    @Override
    public boolean deleteStudents(String sid) {
        Students students =queryStudentsBySid(sid);
        getSession().delete(students);
        return true;
    }

    //生成学生的学号
    private String getNewSid() {
        String hql  = "select max(sid) from Students";
        String sid = null;
        Query query = getSession().createQuery(hql);
        sid = (String) query.uniqueResult();
        if (sid == null || "".equals(sid)) {
            //给一个默认最大编号
            sid = "S0000001";
        } else {
            String temp = sid.substring(1);
            int i = Integer.parseInt(temp);
            i++;
            //还原成字符串
            temp = String.valueOf(i);
            int len = temp.length();
            //凑足7位
            for (int j = 0; j < 7 - len; j++) {
                temp = "0" + temp;
            }
            sid = "S" + temp;
        }
        return sid;

    }
}
