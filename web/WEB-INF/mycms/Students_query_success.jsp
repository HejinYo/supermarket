<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %><%--sturts2 标签库，显示表单错误--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<!-- 模板名称: Clip-Two - Responsive Admin Template build with Twitter Bootstrap 3.x | Author: ClipTheme -->
<!--[if IE 8]><html class="ie8" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- start: HEAD -->
<head>
    <title>查询所有</title>
    <!-- start: META -->
    <!--[if IE]>
    <meta http-equiv='X-UA-Compatible' content="IE=edge,IE=9,IE=8,chrome=1"/><![endif]-->
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <!-- end: META -->
    <!-- start: GOOGLE FONTS -->
    <!-- end: GOOGLE FONTS -->
    <!-- start: MAIN CSS -->
    <link rel="stylesheet" href="../vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../vendor/fontawesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../vendor/themify-icons/themify-icons.min.css">
    <link href="../vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
    <link href="../vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
    <link href="../vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
    <!-- end: MAIN CSS -->
    <!-- start: CLIP-TWO CSS -->
    <link rel="stylesheet" href="../assets/css/styles.css">
    <link rel="stylesheet" href="../assets/css/plugins.css">
    <link rel="stylesheet" href="../assets/css/themes/theme-1.css"/>
    <!-- end: CLIP-TWO CSS -->
    <!-- start: CSS需要这种 PAGE ONLY -->
    <!-- end: CSS需要这种 PAGE ONLY -->
</head>
<!-- end: HEAD -->
<title>seccess</title>
</head>
<body>

<!-- start: RESPONSIVE TABLE -->
<div class="container-fluid container-fullw bg-white">
    <div class="row">
        <div class="col-md-12">

            <a href="<%=path %>/Students/Students_query">
                    <div class="item-inner">
                        <i class="ti-home"></i>
                        <span class="title"> 返回主页 </span>
                    </div>
            </a>

            <h5 class="over-title margin-bottom-15">Responsive <span class="text-bold">Table</span></h5>
            <div class="alert alert-info">
                Please try to re-size your browser window in order to see the tables in responsive mode.
            </div>
            <div class="table-responsive">
                <table class="table table-bordered table-hover" id="sample-table-1">
                    <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>出生日期</th>
                        <th>地址</th>
                        <th>操作 | <a href="<%= basePath%>/Students/toAdd">添加</a></th>

                    </tr>
                    </thead>
                    <tbody>
                    <!-- 遍历开始 -->
                    <s:iterator value="#students_list" var="stu">
                        <tr class="list">
                            <td><s:property value="#stu.sid"/></td>
                            <td><s:property value="#stu.sname"/></td>
                            <td><s:property value="#stu.gender"/></td>
                            <td><s:date name="#stu.birthday" format="yyyy年MM月dd日"/></td>
                            <td><s:property value="#stu.address"/></td>
                            <td><a href="<%=path%>/Students/Students_delete?students.sid=<s:property value="#stu.sid"/>" onclick="javascript: return confirm('真的要删除吗？');">删除</a> | <a href="<%=path%>/Students/Students_modify?students.sid=<s:property value="#stu.sid"/>">修改</a></td>
                        </tr>
                    </s:iterator>
                    <!-- 遍历结束 -->


                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<!-- end: RESPONSIVE TABLE -->


</body>
</html>
