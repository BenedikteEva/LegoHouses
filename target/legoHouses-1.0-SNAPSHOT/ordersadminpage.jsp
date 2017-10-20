<%-- 
    Document   : orderscustomerspage
    Created on : 17-10-2017, 11:57:41
    Author     : Ejer
--%>

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

            <nav> <%out.println(request.getAttribute("view"));%>
                <ul>  
                    
                    <form name="backcustomer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="backcustomer">
                        <li><input type="submit" value="Medarbejdersiden" name="backcustomer">Bestil et hus </a></li>
                    </form>
                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout">Log ud</a></li>
                    </form>

                    <form name="aboutassignment" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="aboutassignment">
                        <li><input type="submit" value="Om opgaven" name="aboutassignment">om opgaven</a></li>
                    </form>
                </ul> 
            </nav>

            <h1>Du er logget ind som:  <%out.println(session.getAttribute("username"));%></h1>

            
          

            <form name="setshippedstatus" action="FrontController" method="POST">
                <input type="hidden" name="command" value="setshippedstatus">
            
             
                 <% out.println("<a>" + (String) request.getAttribute("orderList") + "</a>");%>
            
              <input type="submit" value="Sæt markerede ordre som afsendt" name="setshippedstatus"></a>
            </form>




            <footer >
                <p>Made by BenedikteEva 2017</p>
            </footer>     
    </body>
</html>
