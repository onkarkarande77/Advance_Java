<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Form </title>
</head>

<body>
   
   <c:form modelAttribute="payment" method="post" action="http://localhost:8080/spring_mvc_res/payment/pay">
      <c:input path="custId"/>
      <input type="submit" value="pay"/>
   </c:form>

</body>
</html>