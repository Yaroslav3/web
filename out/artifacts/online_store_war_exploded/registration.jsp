<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
          integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    <link rel="stylesheet">
</head>
<body>

<style>

    body {
        background: beige;
        background-size: cover;
        marfin: 0;
    }

    #submit {
        background: #19b1ca;
        color: #fff;
        border: none;
    }
    fieldset legend{
        color: brown;
    }

</style>
<div align="center">
    <br>
    <br>
    <div style="width: 250px">
        <fieldset>
            <legend>Registration</legend>
            <br>
            <br>
            <br>
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
                    <input type="submit" name="submit" class="form-control" value="Submit" placeholder="Submit"
                           id="submit">
                    <input type="checkbox" name="role" id="role"> admin
                </a>
            </form>
        </fieldset>
    </div>
    <label>
    </label>
</div>
</body>
</html>
