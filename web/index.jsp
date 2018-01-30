<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>::Welcome online store::</title>
    <link href="css/jquery.bxslider.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/style.css">

<body>
<%
    String name = (String) session.getAttribute("name");
    String surname = (String) session.getAttribute("surname");
    String role = (String) session.getAttribute("role");
%>
<div id="wrapper">
    <div id="header">
        <div id="subheader">
            <div class="container">
                <p>::Welcome online store::</p>

                <%if (name == null) {%>

                <%}%>
                <% if ("user".equals(role)) {%>
                <a href="#"><%=name + " " + surname%>
                    <a href="${pageContext.request.contextPath}/basket.jsp">Basket</a>
                    <a href="${pageContext.request.contextPath}/exit">Exit</a>
                </a>
                <%}%>
                <% if ("admin".equals(role)) {%>
                <a href="adminChoose.jsp">Admin add product</a>
                <a href="#"><%=name + " " + surname%>
                    <a href="${pageContext.request.contextPath}/basket.jsp">Basket</a>
                    <a href="${pageContext.request.contextPath}/exit" class="exit">Exit</a>
                </a><%}%>

            </div>
        </div>

        <!--== header ==-->
        <div id="main-header">
            <!-- logo -->
            <div id="logo">
                <span id="ist">Online</span><span id="iist">store.com</span>
            </div>
            <!--==search area==-->

            <%--<div id="search">--%>
            <%--<form action="">--%>
            <%--<input class="search-area" type="text" name="text" placeholder="Search here">--%>
            <%--<input class="search-btn" type="submit" name="submit" value="SEARCH">--%>
            <%--</form>--%>
            <%--</div>--%>
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

            </nav>
        </div>

        <!----===== how Phone =====--->
        <div align="center">
            <jsp:useBean id="phoneShow" scope="request" class="dao.impl.PhoneDaoImpl"/>
            <br>
            <br>
            <h2>Phone</h2>
            <form action="${pageContext.request.contextPath}/bay" method="get">
                <c:forEach items="${phoneShow.showPhoneAll()}" var="phone">

                    <br>
                    <a>${phone.id}</a>
                    <a>${phone.name}</a>
                    <a>${phone.memory}</a>
                    <a>${phone.color}</a>
                    <a>${phone.numberOfMegapixels}</a>
                    <br>
                    <img src="${phone.photo}" height="150" width="230" alt="Card image cap">
                    <br>
                    <br>
                    <input type="submit" name="bay" class="form-control" value="Bay" placeholder="BAY"
                           id="bay">
                    <br>
                </c:forEach>
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>


