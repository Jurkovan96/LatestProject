<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>This is the registration page</title>
</head>

<body>


<%--@elvariable id="user" type="user"--%>
<form:form action="/register" method="post" modelAttribute="user">
    <table>

        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>

        <tr>
            <td>Password</td>
            <td><form:password path="password"/></td>
        </tr>

        <tr>
            <td>First name</td>
            <td><form:input path="firstname"/></td>
        </tr>

        <tr>
            <td>Last name</td>
            <td><form:input path="lastname"/></td>
        </tr>

        <tr>


        <tr>
            <td>Role</td>
            <td>
                <form:select path="role">
                    <form:option value="admin">Admin</form:option>
                    <form:option value="powerUser">Power User</form:option>
                    <form:option value="user">Simple user</form:option>
                </form:select>
            </td>
        </tr>


        <c:if test="${e!=null}">The caught exception is:

            <p><c:out value="${e}"/></p>

        </c:if>


        <tr>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>





</body>


</html>