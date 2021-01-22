<%--
  Created by IntelliJ IDEA.
  User: huangchun
  Date: 2020/12/14
  Time: 9:32 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick14" method="post">
        <input type="text" name="userList[0].name">
        <input type="text" name="userList[0].address">
        <input type="text" name="userList[1].name">
        <input type="text" name="userList[1].address">
        <input type="submit" value="提交">
    </form>
</body>
</html>
