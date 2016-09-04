package com.mycms.action;

import com.mycms.common.SpringContext;
import com.mycms.common.SuperAciton;
import com.mycms.entity.Students;
import com.mycms.service.IStudentsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.location.Location;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/Students")
public class StudnetsAction extends SuperAciton implements Serializable {

    private Students students;
    //生成sid setter，getter方法，解决Error setting expression 'sid' with value ['', ]
    private String sid;
    @Resource
    private IStudentsService studentsService;

    public IStudentsService getStudentsService() {
        return studentsService;
    }

    public void setStudentsService(IStudentsService studentsService) {
        this.studentsService = studentsService;
    }

    //查询所有学生的动作
    @Action(value = "Students_query", results = {
            @Result(name = "query_success", location = "/WEB-INF/mycms/Students_query_success.jsp")
    })
    public String query() {
        List<Students> list = studentsService.queryAllStudents();
        if (list != null && list.size() > 0) {
            ActionContext.getContext().put("students_list", list);
            //return "Students_query_seccess";
        }
        return "query_success";
    }

    //添加一个学生页面
    @Action(value = "toAdd", results = {
            @Result(name = "success", location = "/WEB-INF/mycms/Students_add.jsp")
    })
    public String to() {
        return SUCCESS;
    }

    //添加一个学生
    @Action(value = "Students_add", results = {
            @Result(name = "add_success", location = "/WEB-INF/mycms/Students_add_success.jsp")
    })
    public String add() throws Exception {
        Students s = (Students) SpringContext.getBean("students");
        s.setSname(students.getSname());
        s.setGender(students.getGender());
        s.setAddress(students.getAddress());
        s.setBirthday(students.getBirthday());
        studentsService.addStudents(s);
        return "add_success";

    }

    //删除一个学生
    @Action(value = "Students_delete", results = {
            @Result(name = "delete_success",type = "chain",location = "Students_query")
    })
    public String delete() {
        studentsService.deleteStudents(students.getSid());
        return "delete_success";
    }


    //修改学生资料
    @Action(value = "Students_modify", results = {
            @Result(name = "modify_success", location = "/WEB-INF/mycms/Students_modify.jsp")
    })
    public String modify() {
        String sid = students.getSid();
        Students s = studentsService.queryStudents(sid);
        ActionContext.getContext().put("modify_students", s);
        return "modify_success";
    }

    //保存修改后的学生资料

    @Action(value = "Students_save",results = {
        @Result(name = "save_success",type = "chain",location = "Students_query")
    })
    public String save() throws Exception{
        Students s = (Students) SpringContext.getBean("students");
        s.setSid(students.getSid());
        s.setSname(students.getSname());
        s.setGender(students.getGender());
        s.setAddress(students.getAddress());
        s.setBirthday(students.getBirthday());
        studentsService.updateStudents(s);
        return "save_success";
    }


    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
