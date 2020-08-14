<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"--%>
<%--         pageEncoding="ISO-8859-1" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--&lt;%&ndash;<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>&ndash;%&gt;--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<head></head>--%>

<%--<body>--%>


<%--<form name="loginForm" action="/login" method="post">--%>
<%--    &lt;%&ndash;    <fieldset>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <legend>Please enter your info</legend>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <c:if test="${!error=null}">&ndash;%&gt;--%>
<%--    &lt;%&ndash;            <div class="alert">Invalid</div>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        </c:if>&ndash;%&gt;--%>
<%--    &lt;%&ndash;    </fieldset>&ndash;%&gt;--%>

<%--    <label for="email">Please enter your email address</label>--%>
<%--    <input type="text" id="email" name="email"/>--%>
<%--    <label for="password">Password</label>--%>
<%--    <input type="password" id="password" name="password"/>--%>
<%--    <div>--%>
<%--        <button type="submit" class="button">Login</button>--%>
<%--    </div>--%>
<%--</form>--%>
<%--&lt;%&ndash;<c:if test="${e!=null}">The caught exception is:&ndash;%&gt;--%>

<%--&lt;%&ndash;    <p><c:out value="${e}"/></p>&ndash;%&gt;--%>

<%--&lt;%&ndash;</c:if>&ndash;%&gt;--%>


<%--</body>--%>
<%--</html>--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>My Custom Login Page</title>
</head>
<body style='margin:50px;'>
<h2>My Custom Login Page</h2>
<form action="/login" method="post">
    <c:if test="${param.error != null}">
        <p style='color:red'>
            Invalid username and password.
        </p>
    </c:if>
    <c:if test="${param.logout != null}">
        <p style='color:blue'>
            You have been logged out.
        </p>
    </c:if>
    <p>
        <label for="username">Username</label>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">Password</label>
        <input type="password" id="password" name="password"/>
    </p>
<%--    <input type="hidden"--%>
<%--           name="${_csrf.parameterName}"--%>
<%--           value="${_csrf.token}"/>--%>
    <button type="submit">Log in</button>
</form>
</body>
</html>
