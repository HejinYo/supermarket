package com.simpleasy.action;

import com.simpleasy.entity.User;
import com.simpleasy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.Serializable;


@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/UserAction")
public class UserAction extends ActionSupport implements Serializable {
    private User user;

    @Autowired
    private UserService service;

    @Action(value = "toAdd", results = {
            @Result(name = "success", location = "/WEB-INF/user/user_add.jsp")
    })
    public String to() {
        return SUCCESS;
    }

    @Action(value = "add", results = {
            @Result(name = "success", location = "/WEB-INF/user/user_add.jsp")
    })
    public String add() {
        System.out.println("action"+user.toString());
        service.add(user);
        return SUCCESS;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
