<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FILL THE FORM & CLICK SUBMIT</h1>
	<form:form action="confirm-identification" modelAttribute="humidverfi">
		
		Name: <form:input path="name"/>
		<br>
		<br>
Age : <form:input path= "age"/>
		<br>
		<br>
Gender: 
Male<form:radiobutton path="gender" value="Male" />
Female<form:radiobutton path="gender" value="Female" />
Others<form:radiobutton path="gender" value="Others" />
Prefer not to say<form:radiobutton path="gender"
			value="Prefer not to say" />
		<br>
		<br>
		
Address : <form:input path="address" />
		<br>
		<br>
		
Occupation: 
Student <form:checkbox path="occupation" value="Student" />
Full-Time <form:checkbox path="occupation" value="Full-Time" />
Part-Time <form:checkbox path="occupation" value="Part-Time" />
Business <form:checkbox path="occupation" value="Business" />
UnEmployeed <form:checkbox path="occupation" value="UnEmployeed" />
		<br>
		<br>
		
Humanity: 
I'm a human <form:radiobutton path="humanity" value="I'm a human" />
I'm a robot <form:radiobutton path="humanity" value="I'm a robot" />
		<br>
		<br>
		
		<Input type="Reset" value="reset" />
		<Input type="Submit" value="Submit" />
	
	</form:form>

</body>
</html>