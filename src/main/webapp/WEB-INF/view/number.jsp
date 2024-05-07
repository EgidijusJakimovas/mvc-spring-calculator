<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Number</title>
        <jsp:include page="header.jsp"/>
    </head>
    <body class="container">
        <div class="table-responsive">
            <caption>Number information</caption>
            <table class="table table-striped">
                <tr>
                    <td><b>Id:</b></td>
                    <td>${number.id}</td>
                </tr>
                <tr>
                    <td><b>First number:</b></td>
                    <td>${number.number1}</td>
                </tr>
                <tr>
                    <td><b>Operation:</b></td>
                    <td>${number.operation}</td>
                </tr>
                <tr>
                    <td><b>Second number:</b></td>
                    <td>${number.number2}</td>
                </tr>
                <tr>
                    <td><b>Result:</b></td>
                    <td>${number.result}</td>
                </tr>
            </table>
        </div>
        <br>
        <a type="button" href="/numbers" class="button">Back</a>
    </body>
</html>
