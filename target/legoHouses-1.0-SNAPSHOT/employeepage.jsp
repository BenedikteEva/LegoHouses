<%-- 
    Document   : admin
    Created on : 09-10-2017, 22:22:18
    Author     : BenedikteEva
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/miniCss.css" rel="stylesheet" type="text/css"/>
        <title>Admin page</title>
    </head>
    <body>
        <div class="container">

            <nav> 
                <ul>
                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout">Log ud</a></li>
                    </form>

                    <form name="admin" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="admin">
                        <li><input type="submit" value="behandl ordrer" name="admin">behandl ordrer</a></li>
                    </form>

                    <form name="aboutassignment" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="aboutassignment">
                        <li><input type="submit" value="Om opgaven" name="aboutassignment">om opgaven</a></li>
                    </form>
                </ul> 
            </nav>

            <h1>Du er logget ind som:  <%out.println(session.getAttribute("username"));%></h1>


            <form name="getallusers" action="FrontController" method="POST">
                <input type="hidden" name="command" value="getallusers">
                <br><br> 

                <input type="submit" value="se brugere" name="getallusers"></a>
            </form>
            <% out.println("<a>" + (String) session.getAttribute("getusers") + "</a>");%>
            <br><br>
            <a><input type="submit" value="Behandl ordrer" name="admin"></a>
        </form>
        <br>
        <br>

    </div>
    <footer >
        <p>Made by BenedikteEva 2017</p>
    </footer>     
</body>
</html>
