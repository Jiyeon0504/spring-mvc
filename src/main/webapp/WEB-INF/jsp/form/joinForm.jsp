<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/form/join.do" method="post">
아이디: <input type="text" name="id" size="20" /> <br/>
암 호: <input type="text" name="password" size="20" /><br/>
이 름: <input type="text" name="name" size="20" /><br/>
<input type="submit" value="저장" />

</form>


</body>
</html>