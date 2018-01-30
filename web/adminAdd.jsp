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

    /*b {*/
        /*color: blue;*/
    /*}*/

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
            <form action="${pageContext.request.contextPath}/admin" method="post">
                <input type="text" name="nameModel" class="form-control" placeholder="name">
                <input type="text" name="color" class="form-control" placeholder="color">
                <input type="number" name="memory" class="form-control" placeholder="memory">
                <input type="number" name="megapixeles" class="form-control" placeholder="megapixeles">
                <input type="text" name="photo" class="form-control" placeholder="photo">
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
