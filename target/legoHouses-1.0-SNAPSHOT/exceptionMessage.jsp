<%-- 
    Document   : exceptionHandling
    Created on : 09-10-2017, 22:20:54
    Author     : BenedikteEva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
    </head>
    <body>
          <nav> 
                <ul>
                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout">Log ud</a></li>
                    </form>

                    <form name="backcustomer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="backcustomer">
                        <li><input type="submit" value="Gå tilbage" name="backcustomer">Gå tilbage </a></li>
                    </form>

                    <form name="aboutassignment" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="aboutassignment">
                        <li><input type="submit" value="Om opgaven" name="aboutassignment">om opgaven</a></li>
                    </form>
                </ul> 
            </nav>
        
        
        <h1>Der var en fejl i systemet. Være sød at gøre noget andet!!</h1>
        <a href="customerpage.jsp">Bestil legohuse</a>
        <a href="employeepage.jsp">Behandl dine kunder venligt</a>
        <p>Okay måske ikke helt optimalt men i det mindste bliver man ikke smidt af når man får en nullpointer eller numberformat exception</p>
        
        <footer >
        Made by BenedikteEva 2017
        </footer>     

    </body>
</html>
