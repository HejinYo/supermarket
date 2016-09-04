<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>My CMS</title>
</head>
<body>
<meta http-equiv="Refresh" content="1;url=<%=path%>/Students/Students_query">
</body>
</html>
