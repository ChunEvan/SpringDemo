<%--
  Created by IntelliJ IDEA.
  User: huangchun
  Date: 2020/12/14
  Time: 9:47 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
<%--    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>--%>
    <script>
        var userList= new Array();
        userList.push({name:"zhangsan",address:"nccncn"});
        userList.push({name:"lisi",address:"ncdgsn"});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick15",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8",
        })

    </script>


</head>
<body>

</body>
</html>
