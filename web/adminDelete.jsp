<%@ page import="jdk.nashorn.internal.ir.RuntimeNode" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="javax.xml.ws.RequestWrapper" %>
<%@ page import="org.omg.CORBA.Request" %>
<%@ page import="model.Phone" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yaroslav
  Date: 28.01.2018
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Delete product</title>
</head>
<body>
<br>
<br>
<br>
<br>

<jsp:useBean id="phone" scope="request" class="dao.impl.PhoneDaoImpl">

<div align="center">
    <form action="${pageContext.request.contextPath}/delete" method="get">
        <select class="list-group"  style="width: 500px" >
            <c:forEach items="${phone.showPhoneAll()}" var="elem">
                <option value="${elem.id}">${elem.name}</option>
            </c:forEach>
        </select>
        <br>
        <br>
         <input type="submit" name="submit"  placeholder="Submit"
                 id="submit" value="Delete" >
    </form>
    </jsp:useBean>
</div>
</body>
</html>
