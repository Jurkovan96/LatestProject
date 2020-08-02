<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>This is a login form!</head>

<body>
<c:if test="${not empty error}">
    <div>Error: ${error}</div>
</c:if>
</body>
</html>