<%--
  Created by IntelliJ IDEA.
  User: yaroslav
  Date: 31.01.2018
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdatePhone</title>
    <title>Administration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
          integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
</head>
<body>
<%
    String name_phone = (String) session.getAttribute("name_phone");
    String color = (String) session.getAttribute("color");
    String memory = (String) session.getAttribute("memory");
    String megapixels = (String) session.getAttribute("megapixels");
    String photo = (String) session.getAttribute("photo");

%>

<div id="warning">
    <div align="center">
        <br>
        <br>
        <b>update products</b>
        <br>
        <br>
        <br>
        <div style="width: 250px">
            <form action="${pageContext.request.contextPath}/update" method="get">
                <input type="text" name="name" class="form-control" value=<%=name_phone%>>
                <input type="text" name="color" class="form-control" value=<%=color%>>
                <input type="number" name="memory" class="form-control" value=<%=memory%>>
                <input type="number" name="megapixeles" class="form-control" value=<%=megapixels%>>
                <input type="text" name="photo" class="form-control" value=<%=photo%>>
                <br>
                <a>
                    <input type="submit" name="submit" class="form-control" value="Submit" placeholder="Submit"
                           id="submit">
                </a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
