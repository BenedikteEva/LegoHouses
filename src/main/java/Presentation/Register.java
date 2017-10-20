package Presentation;

import BusinessLayer.LogicFacade;
import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 The purpose of Register is to...

 @author kasper
 */
public class Register extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws BenedikteEvasNewException {
        String username = request.getParameter("username");
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
      
        if ( password1.equals( password2 ) ) {
            User user = LogicFacade.createUser(username, email, password1);
            HttpSession session = request.getSession();
            session.setAttribute( "user", user );
            session.setAttribute("username", username);
            session.setAttribute( "adminstatus", user.getAdminStatus());
            return (user.getAdminStatus()+"page"); 
           
        } else {
            throw new BenedikteEvasNewException( "the two passwords did not match" );
        }
    }

}
