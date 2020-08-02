<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Store Application</title>
</head>
<body>

<h2 align="center">User Management Application</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h3>List of Users</h3></caption>
        <tr>
            <th>Name</th>
            <th>Last Name</th>
            <th>Role</th>

        </tr>
        <jsp:useBean id="userList" scope="request" type="java.util.List"/>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td><c:out value="${user.firstname}" /></td>
                <td><c:out value="${user.lastname}" /></td>
                <td><c:out value="${user.role}" /></td>
                <td><a href="/${user.id}/delete">Delete user</a><td>
                <td><a href="/${user.id}/get">View user</a><td>
                <td><a href="/${user.lastname}/get">View user by name</a><td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>