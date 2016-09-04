package com.mycms.service;

import com.mycms.entity.Students;

import java.util.List;

public interface IStudentsService {
    //查询所有学生资料
    public List<Students> queryAllStudents();
    //添加一个用户
    public boolean addStudents(Students s);
    //删除一个用户
    public boolean deleteStudents(String sid);
    //根据id查询一个用户
    public Students queryStudents(String sid);
    //保存修改后的学生资料
    public boolean updateStudents(Students s);
}
