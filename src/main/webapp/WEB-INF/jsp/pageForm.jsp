<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>This is the home page!</title>
</head>

<body>




<p>Hello user ${pageContext.request.userPrincipal.name} !</p>
<p>${sessionScope.get(pageContext.request.userPrincipal.name)}</p>


<p>Hello + ${LoggedUsr} + ${userId}</p>
</body>

</html>