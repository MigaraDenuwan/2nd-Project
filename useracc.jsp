<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
</head>
<body>
    <h2>User Details</h2>
    <table>
        <c:forEach var="ss" items="${userDetails}">
        
        <c:set var="id" value="${ss.id }"/>
        <c:set var="fName" value="${ss.fName }"/>
        <c:set var="lName" value="${ss.lName }"/>
        <c:set var="email" value="${ss.email }"/>
        <c:set var="phone" value="${ss.phone }"/>
        <c:set var="username" value="${ss.username }"/>
        <c:set var="password" value="${ss.password }"/>
        
            <tr>
                <td>User ID</td>
                <td>${ss.id}</td>
            </tr>
            <tr>
                <td>First Name</td>
                <td>${ss.fName}</td>
            </tr>
            <tr>
            <tr>
                <td>Last Name</td>
                <td>${ss.lName}</td>
            </tr>
            <tr>
                <td>User email</td>
                <td>${ss.email}</td>
            </tr>
            <tr>
                <td>User phone</td>
                <td>${ss.phone}</td>
            </tr>
            <tr>
                <td>Username</td>
                <td>${ss.username}</td>
            </tr>
            <tr>
                <td>Password</td>
                <td>${ss.password}</td>
            </tr>
        </c:forEach>
    </table>
    <c:url value = "userUpdate.jsp" var = "userUpdate">
    <c:param name = "id" value = "${id}"/>
    <c:param name = "fName" value = "${fName}"/>
    <c:param name = "lName" value = "${lName}"/>
    <c:param name = "email" value = "${email}"/>
    <c:param name = "phone" value = "${phone}"/>
    <c:param name = "username" value = "${username}"/>
    <c:param name = "password" value = "${password}"/>
    </c:url>
    <a href="${userUpdate}">
    <input type = "button" name="update" value="Update My Details"></a>
    
    <c:url value = "deleteUser.jsp" var = "deleteAcc">
    <c:param name = "id" value = "${id}"/>
    <c:param name = "fName" value = "${fName}"/>
    <c:param name = "lName" value = "${lName}"/>
    <c:param name = "email" value = "${email}"/>
    <c:param name = "phone" value = "${phone}"/>
    <c:param name = "username" value = "${username}"/>
    <c:param name = "password" value = "${password}"/>
    </c:url>
    <a href="${deleteAcc}">
    <input type = "button" name="delete" value="Delete My Account"></a>
</body>
</html>
