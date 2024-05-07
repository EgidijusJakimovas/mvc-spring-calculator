<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <title>Calculate</title>
    <jsp:include page="header.jsp"/>
    <style>
        .error { color: red; }
        form { margin-left: 20px; }
    </style>
</head>
<body>
    <h2>Online calculator. Possible operations: addition, subtraction, multiplication, division.</h2>
    <h3>Calculator can not count negative numbers.</h3>
    <br>
    <form:form method="post" action="calculate" modelAttribute="number">
        First number: <form:input type="number" path="number1"/>
                      <form:errors path="number1" cssClass="error"/><br><br>
        Second number: <form:input type="number" path="number2"/>
                       <form:errors path="number2" cssClass="error"/><br><br>
        Operation:
        <select name="operation">
            <option selected="selected" value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
        </select><br><br>

        <input type="submit" value="Calculate"><br><br>
    </form:form>

    <form:form method="get" action="register">
        <input type="submit" value="Register">
    </form:form>
</body>
</html>
