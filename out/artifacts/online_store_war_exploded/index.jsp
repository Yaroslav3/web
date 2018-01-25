<%@ page import="dao.DaoFactory.ConnectionDatabase" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>::Welcome online store::</title>
    <link href="css/jquery.bxslider.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<%
    String mame =(String) session.getAttribute("email");
    String role = (String) session.getAttribute("role");
%>
<div id="wrapper">
    <div id="header">
        <div id="subheader">
            <div class="container">
                <p>::Welcome online store::</p>

                <a href="#">Exit</a>
                <a href="#">Basket</a>
                <a href="admin.jsp">Admin add product</a>
                <a href="#">Basket</a>
                <a href="#">Exit</a>
            </div>
        </div>

        <!--== header ==-->
        <div id="main-header">

            <!-- logo -->
            <div id="logo">
                <span id="ist">Online</span><span id="iist">store.com</span>
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
                <li><a href="authentication.jsp">Enter</a></li>
                <li><a href="registration.jsp">Registration</a></li>
            </div>
        </div>
        <!--===== navigation bar ======---->
        <div id="navigation">
            <nav>
                <a href="#">Phone</a>
                <a href="#">TY</a>
                <a href="#">Laptops</a>
                <a href="#">Other</a>
            </nav>
        </div>

        <!--================== home slider=====---------------->

        <%--<div id="slider">--%>
        <%--<ul class="bxslider">--%>
        <%--<li><img src="image/photo/523175.jpg"></li>--%>
        <%--<li><img src="image/photo/872207.jpg"></li>--%>
        <%--<li><img src="image/photo/517247.jpg"></li>--%>
        <%--</ul>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--<script--%>
        <%--src="http://code.jquery.com/jquery-2.2.4.js"--%>
        <%--integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="--%>
        <%--crossorigin="anonymous"></script>--%>

        <%--<script src="js/jquery.bxslider.min.js"></script>--%>
        <%--<script src="js/my.js"></script>--%>

    </div>

</body>
</html>


