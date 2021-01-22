<%--
  Created by IntelliJ IDEA.
  User: huangchun
  Date: 2020/12/16
  Time: 9:47 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick23" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        名称<input type="file" name="uploadFile"><br/>
        名称<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
