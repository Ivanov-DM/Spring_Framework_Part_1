<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br>
    Last name: <form:input path="lastName"/>
    <br>
    Country: <form:select path="country">
                <form:option value="Russia" label="Russia"/>
                <form:option value="France" label="Franse"/>
                <form:option value="England" label="England"/>
                <form:option value="Japan" label="Japan"/>
            </form:select>
    Programming languages:
    <br>
    <form:checkbox path="programmingLanguages" label="Java" value="Java"/>
    <form:checkbox path="programmingLanguages" label="C++" value="C++"/>
    <form:checkbox path="programmingLanguages" label="PHP" value="PHP"/>
    <form:checkbox path="programmingLanguages" label="Pyton" value="Pyton"/>
    <input type="submit" value="Submit"/>
</form:form>
<br>
<a href="/">Home page</a>
</body>
</html>