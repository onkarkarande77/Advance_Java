<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
             <!-- it is same to import package -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is the Customer ID </title>
</head>
<body bgcolor="pink">
    
    <c:form modelAttribute="payment" method="post" action="http://localhost:8080/spring_mvc/payment/pay">
      <c:input path="custId"/>
      <input type="submit" value="pay"/>
    </c:form>
     
</body>
</html>