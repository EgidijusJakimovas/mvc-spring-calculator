<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Numbers</title>
    <jsp:include page="header.jsp"/>
</head>
<body class="container">
    <div class="table-responsive">
        <table class="table table-striped">
            <tr>
                <th>First number</th>
                <th>Operation</th>
                <th>Second number</th>
                <th>Result</th>
                <th>Action</th>
            </tr>
            <c:forEach var="number" items="${numbers}">
                <c:url var="refresh" value="/refresh">
                    <c:param name="id" value="${number.id}"/>
                </c:url>
                <c:url var="delete" value="/delete">
                    <c:param name="id" value="${number.id}"/>
                </c:url>
                <c:url var="view" value="/view">
                    <c:param name="id" value="${number.id}"/>
                </c:url>
                <tr>
                    <td>${number.number1}</td>
                    <td>${number.operation}</td>
                    <td>${number.number2}</td>
                    <td>${number.result}</td>
                    <td>
                        <a href="${refresh}">Update</a>
                        | <a href="${delete}"
                             onclick="if (!(confirm('Are you sure you want to delete this record?'))) return false">Delete</a>
                        | <a href="${view}">Show</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
