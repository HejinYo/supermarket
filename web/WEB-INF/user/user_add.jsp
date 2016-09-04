<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="ss" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>User add</title>
    <ss:head locale="en" parseContent="true"/>
<body>

<form action="/UserAction/add" method="post">
    <input type="text" name="user.name" value="${user.name}" placeholder="李明">
    <input type="text" name="user.age" value="${user.age}" placeholder="18">
    ${user.id != null?"用户添加成功":""}
    <input type="submit" value="提交">
</form>

<s:form name="UserAdd" action="/UserAction/add" method="POST" namespace="/UserAction" >
    <s:textfield name="user.name" label="用户名"></s:textfield>
    <ss:datetimepicker label="出生日期" name="user.birthday"></ss:datetimepicker>
</s:form>
</body>
</html>
