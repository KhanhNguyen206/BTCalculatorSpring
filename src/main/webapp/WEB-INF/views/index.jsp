<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: adminu
  Date: 27/06/2019
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form:form action="/calculate" method="post" modelAttribute="calculator">
    First Operand:
    <form:input path="firstOperand"/><br/>
    Second Operand:
    <form:input path="secondOperand"/><br/>
    <form:input path="operator"/><br>

    <input type="submit" value="Calculator"/>

<%--    <form:button path="operator" value="+" >+</form:button>--%>
<%--    <form:button path="operator" value="-">+</form:button>--%>
<%--    <form:button path="operator" value="">+</form:button>--%>
<%--    <form:button path="operator" value="+">+</form:button>--%>
</form:form>
</body>
</html>
