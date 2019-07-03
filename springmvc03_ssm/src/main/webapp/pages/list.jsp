<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h3>账户列表</h3>

    <table border="1">
        <tr>
            <th>账户ID</th>
            <th>用户ID</th>
            <th>余额</th>
        </tr>
        <c:forEach var="account" items="${list}">
            <tr>
                <td>${account.accountId}</td>
                <td>${account.uid}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
