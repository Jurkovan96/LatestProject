<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>This is the home page!</title>>
</head>

<body>

<%--<c:set value="${LoggedUser}" var="user"/>--%>
<%--<label><c:out value="${user.firstname}"/></label>--%>
<%--<label><c:out value="${user.id}"/></label>--%>
<p>Hello user! ${ValidId} + ${user.firstname}</p>



</body>

</html>