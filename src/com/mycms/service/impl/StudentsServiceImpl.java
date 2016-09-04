package com.mycms.service.impl;

import com.mycms.dao.IStudentsDao;
import com.mycms.entity.Students;
import com.mycms.service.IStudentsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("studentsService")
public class StudentsServiceImpl implements IStudentsService {

    @Resource
    private IStudentsDao studentsDao;

    //查询所有学生资料
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Students> queryAllStudents() {
        return studentsDao.queryAllStudents();
    }

    //添加一个学生资料
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean addStudents(Students s) {
        return studentsDao.addStudents(s);
    }

    //删除一个学生资料
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean deleteStudents(String sid) {
        return studentsDao.deleteStudents(sid);
    }

    //根据id查询一个用户
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Students queryStudents(String sid) {
        return studentsDao.queryStudentsBySid(sid);
    }

    //修改学生资料
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean updateStudents(Students s) {
        return studentsDao.updateStudents(s);
    }


}
