<%-- 
    Document   : index
    Created on : 09-10-2017, 22:08:31
    Author     : Kasper/ BenedikteEva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/miniCss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Lego Houses user interface</title>
    </head>
    <body>
    
        <h1>Lego Houses for sale</h1>
        <table>
         <td>
         <tr><td>Login</td>
           
            <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                       
                        Email:<br>
                        <input type="text" name="email" value="tr@tr.tr">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="tr">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                   
                </td>
    
      <td>Or Register</td>
    
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                          Username:<br>
                        <input type="text" name="username" value="username">
                        <br>
                        Email:<br>
                        <input type="text" name="email" value="some@new.dk">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="1234">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="1234">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
                       </td></table>

        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { %>
           <H2>Error!!</h2>
           <p><%= error %>
        <% }
        %>
        
           <footer >
                Made by BenedikteEva 2017
        </footer>     
    </body>
</html>
