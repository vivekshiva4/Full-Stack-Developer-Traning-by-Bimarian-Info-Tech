<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="emp.*"/>
<form action="sucessAdmission">
Name:<input name="fName">
Age:<input name="age">
Country:<input name="empAddress.country">
City:<input name="empAddress.city">

<input type="submit" value="GO">
</form>


</body>
</html>