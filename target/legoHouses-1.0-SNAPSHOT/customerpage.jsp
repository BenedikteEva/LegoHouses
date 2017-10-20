<%-- 
    Document   : customerpage
    Created on : 10-10-2017, 15:40:23
    Author     : Ejer
--%>


<%@page import="BusinessLayer.StykCalculator"%>
<%@page import="BusinessLayer.OrderEntity"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.Arrays"%>
<%@page import="BusinessLayer.OdetailsEntity"%>
<%@page import="Presentation.Odetails"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Customer page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/miniCss.css" rel="stylesheet" type="text/css"/>
    </head>


    <body>
        <div class="container">
            <%out.println(request.getAttribute("view"));%>
            <nav> 
                <ul>

                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout">Log ud</a></li>
                    </form>
                    <form name="orderscustomer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderscustomer">
                        <li><input type="submit" value="Historik" name="orderscustomer">Historik</a></li>
                    </form>
                    <form name="aboutassignment" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="aboutassignment">
                        <li><input type="submit" value="Om opgaven" name="aboutassignment">Om opgaven</a></li>
                    </form>
                </ul> 
            </nav>




            <h1>Du er logget ind som:  <%out.println(session.getAttribute("username"));%></h1>
            <form name="odetails" action="FrontController" method="POST">
                <input type="hidden" name="command" value="odetails">
                <h3> Sæt proportionerne for dit legohus. </h3>
                <br>

                <p>  Du kan vælge alle størrelser over 4x4x1 men vær opmærksom på at alt under 5x5prikker ikke har et hulrum <br>
                    og derfor næppe kan kaldes et hus.<br> Ligeledes hvis højden er mindre end 2 klodser vil legohuset mere være 
                    som en kiste.</p>
                <br>

                Vælg længde, bredde og højde i dit legohus:
                <br>
                Længde:<br>
                <input type="number" name="length" min="5" value="5">prikker<br>
                Bredde:<br>
                <input type="number" name="width" min="5" value="5">prikker<br>
                Højde:<br>
                <input type="number" name="height" min="1" value="1">klodser<br>
                <br> <br>
                Vælg forbandt:
                <br>
                <select name="type">
                    <option value="1">Forbandt type 1</option>
                    <option value="2">Forbandt type 2</option>
                    <option value="3">Forbandt type 3</option>
                </select><br>

                <button type="submit" value="action" name="odetails">Udfør</button>  
                <input type="hidden" name="command" value="odetails">

                <br>
                <%  if (request.getParameter("odetails") == null) {

                    } else {
                        out.println("<a>" + (OdetailsEntity) session.getAttribute("odetails") + "</a>");
                    }
                %>
            </form>
            <form name="stykliste" action="FrontController" method="POST">  
                <input type="hidden" name="command" value="stykliste">

                <button type="submit" value="action" name="stykliste">Se stykliste for huset</button>  
                <br>
           


                <% if (request.getParameter("stykliste") == null) {
                        out.println("");
                    } else {

                        out.println("<a>Stykliste for ordrenummer:" + request.getAttribute("order_id") + "  "
                                + (StringBuilder) request.getAttribute("stykliste") + " </a>");
                    }
                %>
                <br>
                <br>
            </form>

        </div>



        <footer >
          Made by BenedikteEva 2017
        </footer>     
    </body>
</html>
