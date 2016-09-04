<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %><%--sturts2 标签库，显示表单错误--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- Template Name: Clip-Two - Responsive Admin Template build with Twitter Bootstrap 3.x | Author: ClipTheme -->
<!--[if IE 8]><html class="ie8" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- start: HEAD -->
<!-- start: HEAD -->
<head>
    <title>修改信息</title>
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
    <link rel="stylesheet" href="<%=path %>/vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path %>/vendor/fontawesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=path %>/vendor/themify-icons/themify-icons.min.css">
    <link href="<%=path %>/vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
    <link href="<%=path %>/vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
    <link href="<%=path %>/vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
    <!-- end: MAIN CSS -->
    <!-- start: CLIP-TWO CSS -->
    <link rel="stylesheet" href="<%=path %>/assets/css/styles.css">
    <link rel="stylesheet" href="<%=path %>/assets/css/plugins.css">
    <link rel="stylesheet" href="<%=path %>/assets/css/themes/theme-1.css" id="skin_color"/>
    <!-- end: CLIP-TWO CSS -->
    <!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
    <!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
</head>
<!-- end: HEAD -->
<!-- start: BODY -->
<body class="login">
<!-- start: LOGIN -->
<div class="row">
    <div class="main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
        <div class="logo margin-top-30">
            <img src="<%=path %>/assets/images/logo.png" alt="Clip-Two"/>
        </div>
        <!-- start: LOGIN BOX -->
        <div class="box-login">
            <form class="form-login" action="<%=path %>/Students/Students_save" method="post">
                <fieldset>
                    <legend>
                        修改您的信息
                    </legend>
                    <p>
                        请输入您需要修改的信息.
                    </p>
                    <input type="hidden" name="students.sid" value="<s:property value="#modify_students.sid"/>">
                    <div class="form-group">
                        <span class="input-icon">
                            <label class="block">
                                姓名
                            </label>
                            <input type="text" class="form-control" name="students.sname" placeholder="用户名" value="<s:property value="#modify_students.sname"/>">
                            <label class="block">
                                <label class="block">
                                    性别
                                </label>
                                <div class="clip-radio radio-primary">
                                    <s:if test='%{#modify_students.gender=="男"}'>
                                        <input type="radio" id="rg-female" name="students.gender" value="女">
                                        <label for="rg-female">
                                            女
                                        </label>
                                        <input type="radio" id="rg-male" name="students.gender" value="男" checked="checked">
                                        <label for="rg-male">
                                            男
                                        </label>
                                    </s:if>
                                    <s:if test='%{#modify_students.gender=="女"}'>
                                        <input type="radio" id="rg-female" name="students.gender" value="女" checked="checked">
                                        <label for="rg-female">
                                            女
                                        </label>
                                        <input type="radio" id="rg-male" name="students.gender" value="男">
                                        <label for="rg-male">
                                            男
                                        </label>
                                    </s:if>
                                </div>
                                出生日期
                            </label>
                            <input type="text" class="form-control" name="students.birthday" value="<s:date name="#modify_students.birthday" format="yyyy-MM-dd"/>"
                            <label class="block">
                                地址
                            </label>
                            <input type="text" class="form-control" name="students.address" value='<s:property value="#modify_students.address"/>'>
                        </span>
                    </div>

                    <button onclick="javascript: return confirm('真的要修改吗？'); "type="submit" class="btn btn-primary pull-right" >
                        提交 <i class="fa fa-arrow-circle-right"></i>
                    </button>
                    <button onclick="javascript:history.go(-1);" class="btn btn-primary pull-left">
                        取消 <i class="fa fa-arrow-circle-left"></i>
                    </button>

                </fieldset>
            </form>
            <!-- start: COPYRIGHT -->
            <div class="copyright">
                &copy; <span class="current-year"></span><span class="text-bold text-uppercase"> ClipTheme</span>. <span>All rights reserved</span>
            </div>
            <!-- end: COPYRIGHT -->
        </div>
        <!-- end: LOGIN BOX -->
    </div>
</div>
<!-- end: LOGIN -->
<!-- start: MAIN JAVASCRIPTS -->
<script src="../vendor/jquery/jquery.min.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="../vendor/modernizr/modernizr.js"></script>
<script src="../vendor/jquery-cookie/jquery.cookie.js"></script>
<script src="../vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
<script src="../vendor/switchery/switchery.min.js"></script>
<!-- end: MAIN JAVASCRIPTS -->
<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
<script src="../vendor/jquery-validation/jquery.validate.min.js"></script>
<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
<!-- start: CLIP-TWO JAVASCRIPTS -->
<script src="../assets/js/main.js"></script>
<!-- start: JavaScript Event Handlers for this page -->
<script src="../assets/js/login.js"></script>
<script>
    jQuery(document).ready(function () {
        Main.init();
        Login.init();
    });
    function refreshCode() {
        $("#validateCode").attr("src", "verify");
    }
</script>
<!-- end: JavaScript Event Handlers for this page -->
<!-- end: CLIP-TWO JAVASCRIPTS -->
</body>
<!-- end: BODY -->
</html>