<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student SignUp Form</title>
</head>
<body>
       <s:form modelAttribute="student" method="post" action="http://localhost:8080/spring_mvc/student/senddata">
         <s:input path="stdId"/>
         <s:input path="stdName"/>
         <s:input path="city"/>
         
         <input type="submit" value="send data"/>
       </s:form>
     
</body>
</html>