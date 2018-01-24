<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
          integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    <link rel="stylesheet">
</head>
<body class="back">

<div align="center">

    <style>
        body {
            background: url("image/background/beach.jpg");
            background-size: cover;
            margin:0;
        }

        input {
            width: 70%;
            outline: none;
            padding: 10px 11px;
            border: 1px #aaa solid;
            font-size: 15px;
            background: #fff;
            display: block;
            margin: 20px auto;
        }

        #submit {
            background: #19b1ca;
            color: #fff;
            border: none;
        }
        div {
            width: 30%;
            height: 400px;
            background: rgba(0, 0, 0, .2);
            box-shadow: 5px 4px 43px #000;
            position: absolute;
            top: 80px;
            left: 200px;
        }
        form {
            margin: 1cm 1cm 1cm 1cm;
            text-align:center;
        }

        b {
            font-size: 25px;
            color: #fff;
        }

        a {
            color: #fff;
        }

        img {
            display: block;
            margin: -75px auto 0 auto;
        }

    </style>

    <b>Online store</b>
        <form action="${pageContext.request.contextPath}/authenticationServlet" method="post">
            <input type="text" name="email" class="form-control" placeholder="@email">
            <input type="password" name="password" class="form-control" id="exampleInputPassword1"
                   placeholder="Password">
            <input type="submit" name="submit" class="form-control" value="Submit" placeholder="Submit" id="submit">
            <a href="registration.jsp">Registration</a>
        </form>
    </div>
</div>
</body>
</html>