<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Data</title>
</head>
<body>
    
     <c:form modelAttribute="student" method="get" action="http://localhost:8080/spring_mvc/student/fetch">
      <input type="submit" value="click">
     </c:form>
 
</body>
</html>