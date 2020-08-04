<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>This is a login form!</head>

<body>
<%--<c:catch var="e">--%>
<%--    <c:set var="x" value="10" scope="page" />--%>

<%--    <c:set var="y" value="five" scope="page" />--%>

<%--    x divided by y is--%>
<%--    <c:out value="${x/y}" />--%>

<%--    <br />--%>
<%--</c:catch>--%>
<c:if test="${e!=null}">The caught exception is:

    <p><c:out value="${e}"/></p>

</c:if>




</body>
</html>