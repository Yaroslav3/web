<%--
  Created by IntelliJ IDEA.
  User: yaroslav
  Date: 24.01.2018
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>::Welcome online store::</title>
    <link href="css/jquery.bxslider.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <div id="subheader">
            <div class="container">
                <p>::Welcome online store::</p>
                <a href="#">Help</a>
                <a href="#">Guest</a>
                <a href="#">Consumer</a>
                <a href="#">Download App </a>
            </div>
        </div>

        <!--== header ==-->
        <div id="main-header">

            <!-- logo -->
            <div id="logo">
                <span id="ist">MY</span><span id="iist">Shop.com</span>
            </div>
            <!--==search area==-->

            <div id="search">
                <form action="">
                    <input class="search-area" type="text" name="text" placeholder="Search here">
                    <input class="search-btn" type="submit" name="submit" value="SEARCH">
                </form>
            </div>
            <!--==user-menu==-->
            <div id="user-menu">
                <li><a href="#">Cart</a></li>
                <li><a href="#">Login</a></li>
            </div>
        </div>
        <!--===== navigation bar ======---->
        <div id="navigation">
            <nav>
                <a href="#">Home</a>
                <a href="#">New arrivals</a>
                <a href="#">Deals</a>
                <a href="#">Electronic</a>
                <a href="#">Accessroies</a>
                <a href="#">Other</a>
            </nav>
        </div>

        <!--================== home slider=====---------------->

        <div id="slider">
            <ul class="bxslider">
                <li><img src="image/photo/523175.jpg"></li>
                <li><img src="image/photo/872207.jpg"></li>
                <li><img src="image/photo/517247.jpg"></li>
            </ul>
        </div>
    </div>
    <script
            src="http://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
            crossorigin="anonymous"></script>

    <script src="js/jquery.bxslider.min.js"></script>
    <script src="js/my.js"></script>

</div>

</body>
</html>
