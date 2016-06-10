<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>

<h1>Registration</h1>

<form action="${contextPath}/controller/register/register" method="post">
    <table>
        <tr>
            <td>First Name: </td>
            <td><input id="firstName" name="firstName" type="text" value="${register.firstName}"></td>
            <td style="color:red">${errors.firstName}</td>
        </tr> 
        
        <tr>
           <td>Last Name: </td>
           <td><input id="lastName" name="lastName" type="text" value="${register.lastName}"></td>
           <td style="color:red">${errors.lastName}</td>
        </tr>
        
        <tr>
           <td>DOB:</td>
           <td><input id="dob" name="dob" type="date" value="${register.dob}"/></td>
        </tr>
        <tr>
                
            <td colspan="3">
                <input type="submit" name="action" value="Submit" type="button"/>
                <input type="submit" name="action" value="Cancel" type="button"/>
                
            </td>
        </tr>
    </table>
</form>

</body>
</html>