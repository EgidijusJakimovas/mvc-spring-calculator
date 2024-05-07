<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Number update</title>
        <jsp:include page="header.jsp"/>
        <style>
            form{margin-left: 20px}
        </style>
    </head>
    <body>
        <form:form name="number" action="/refreshNumber" method="post">
                 <input type="hidden" name="id" value="${number.id}"><p>
                 First number:<br>
                 <input type="number" name="number1" value="${number.number1}"><p>
                 Operation:<br>
                 <input type="text" name="operation" value="${number.operation}"><p>
                 Second number:<br>
                 <input type="number" name="number2" value="${number.number2}"><p>
                 Result:<br>
                 <input type="number" name="result" value="${number.result}"><p>
                 <input type="submit" value="Update">
        </form:form>
    </body>
</html>
