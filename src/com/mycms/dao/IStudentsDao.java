package com.mycms.dao;

import com.mycms.entity.Students;

import java.util.List;

//学生业务逻辑接口
public interface IStudentsDao {
    //查询所有学生资料
    public List<Students> queryAllStudents();

    //根据学号查询学生资料
    public Students queryStudentsBySid(String sid);

    //添加学生资料
    public boolean addStudents(Students s);

    //修改学生资料
    public boolean updateStudents(Students s);

    //删除学生系列
    public boolean deleteStudents(String sid);
}
