<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>Student form result</h1>
First name: ${student.firstName}
<br>
Last name: ${student.lastName}
<br>
Country: ${student.country}
<br>
Programming languages:
<ul>
    <c:forEach var="item" items="${student.programmingLanguages}">
        <li>${item}</li>
    </c:forEach>
</ul>
<a href="/">Home page</a>
</body>
</html>