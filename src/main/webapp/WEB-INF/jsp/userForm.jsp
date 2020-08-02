<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <title>This is a jsp page</title>>
</head>

<body>

<%--@elvariable id="user" type="user"--%>
<form:form action="/registerSuccess" method="post" modelAttribute="user">
    <table>

        <tr>
            <td>First name</td>
            <td><form:input path="firstname"/></td>
        </tr>

        <tr>
            <td>Last name</td>
            <td><form:input path="lastname"/></td>
        </tr>


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

        <tr>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>




</body>

</html>