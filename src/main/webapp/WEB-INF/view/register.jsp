<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <title>Calculator - Register</title>
    <style>
        .error { color: red; }
    </style>
</head>
<body>
    <h2>Web Calculator</h2>
    <h3>Registration form</h3>
    <form:form method="post" action="register" modelAttribute="user">

        <label for="userName">User name:</label><br>
        <form:input type="text" id="userName" path="userName"/>
        <form:errors path="userName" cssClass="error"/><br><br>

        <label for="email">Email:</label><br>
        <form:input type="text" id="email" path="email"/>
        <form:errors path="email" cssClass="error"/><br><br>

        <label for="password">Password:</label><br>
        <form:input type="password" id="password" path="password"/>
        <form:errors path="password" cssClass="error"/><br><br>

        <label for="confirmPassword">Confirm password:</label><br>
        <form:input type="password" id="confirmPassword" path="confirmPassword"/>
        <form:errors path="confirmPassword" cssClass="error"/><br><br>

        <input type="submit" value="Register">
    </form:form>
</body>
</html>
