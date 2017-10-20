<%-- 
    Document   : orderscustomerpage
    Created on : 17-10-2017, 11:57:41
    Author     : Ejer
--%>

<%@page import= "javax.swing.*"%>
<%@page import="BusinessLayer.OrderData"%>
<%@page import="BusinessLayer.OdetailsEntity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>orderscustomer.jsp</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/miniCss.css" rel="stylesheet" type="text/css"/>
    </head>


    <body>
        <div class="container">

            <nav> 
                <ul>  
                    
                    <form name="backcustomer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="backcustomer">
                        <li><input type="submit" value="Hjem" name="backcustomer"></a></li>
                    </form>
                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout"></a></li>
                    </form>
              
                    <form name="aboutassignment" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="aboutassignment">
                        <li><input type="submit" value="Om opgaven" name="aboutassignment"></a></li>
                    </form>
                </ul> 
            </nav>

            <h1>Tidligere ordrer for: <%out.println(session.getAttribute("username"));%></h1>
            
              <form  name="getorderdata" action="FrontController" method="POST">
                <input type="hidden" name="command" value="getorderdata">

                <% if (request.getParameter("getorderdata") == null) {
                       out.println("<a>" + request.getAttribute("orderList") + "</a>");
                %>
              
                <button   type="submit"   value="action" name="getorderdata" id="myButton2" >Se stykliste</button>
   
                <%} else {
                        out.println("<a>" + (OrderData) request.getAttribute("od") + "</a>");
                        out.println("<a>" + (StringBuilder) request.getAttribute("stykliste") + "</a>");
                    }
                %>

            </form>
                      
            <form  name="orderscustomer" action="FrontController" method="POST">
                <button type="submit" value="action" name="orderscustomer" id="myButton2">Se alle dine ordrer</button>
                <input type="hidden" name="command" value="orderscustomer">
            </form>
 

        </div>
                
          <footer >
          Made by BenedikteEva 2017
        </footer>        
                
    </body>
</html>
