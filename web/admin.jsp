<%--
  Created by IntelliJ IDEA.
  User: yaroslav
  Date: 24.01.2018
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
          integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    <link rel="stylesheet">
    <link href="css/jquery.bxslider.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/admin/admin.css">
</head>
</head>
<body>
<style>

    b{
        color: blue;
    }

</style>
<div id="warning">

<div align="center">
    <br>
    <br>
    <b>Add products</b>
    <br>
    <br>
    <br>
    <div style="width: 250px">
        <form action="${pageContext.request.contextPath}/registrationUser" method="post">
            <input type="text" name="name" class="form-control" placeholder="name">
            <br>
            <input type="text" name="surname" class="form-control" placeholder="surname">
            <br>
            <input type="text" name="age" class="form-control" placeholder="age">
            <br>
            <input type="text" name="login" class="form-control" placeholder="login">
            <br>
            <input type="email" name="email" class="form-control" placeholder="@email">
            <br>
            <input type="password" name="password" class="form-control" placeholder="Password">
            <br>
            <a>
                <input type="submit" name="submit" class="form-control" value="Submit" placeholder="Submit" id="submit">
            </a>
        </form>

    </div>
</div>
</div>
</body>
</html>
