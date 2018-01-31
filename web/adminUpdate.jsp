<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yaroslav
  Date: 28.01.2018
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<br>
<br>
<br>
<br>
<jsp:useBean id="phone"  class="dao.impl.PhoneDaoImpl">
<div align="center">


    <br>
    <br>
    select the element to update
    <br>
    <br>
    <form action="${pageContext.request.contextPath}/getIdForUpdate" method="get">
        <div class="list-view" align="center" style="width: 250px">
            <c:forEach items="${phone.showPhoneAll()}" var="elem">
                <a href="${pageContext.request.contextPath}/getIdForUpdate?id=${elem.id}"
                   class="list-group-item list-group-item-action disabled">${elem.name}</a>
            </c:forEach>
        </div>
    </form>
    </jsp:useBean>
</div>
</body>
</html>
