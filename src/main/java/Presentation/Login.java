package Presentation;
import BusinessLayer.LogicFacade;
import BusinessLayer.User;
import BusinessLayer.BenedikteEvasNewException;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 The purpose of Login is to...

 @author kasper
 */
public class Login extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws BenedikteEvasNewException {
        String username = request.getParameter("username");
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password" );
        User user = LogicFacade.login( username, email, password);
        HttpSession session = request.getSession();
      
        session.setAttribute( "user", user );
        session.setAttribute( "admin", user.getAdminStatus());
        session.setAttribute ("username", user.getUsername().toUpperCase());
        return user.getAdminStatus() + "page";
    }

}
