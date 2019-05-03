<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM测试</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/insert.do" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    性别:<input type="text" name="gender"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="birthday"><br>
    爱好:<input type="checkbox" name="hobbyIds" value="1">打球
    <input type="checkbox" name="hobbyIds" value="2">打人
    <input type="checkbox" name="hobbyIds" value="3">打假<br>
    <input type="submit">
</form>
</body>
</html>
