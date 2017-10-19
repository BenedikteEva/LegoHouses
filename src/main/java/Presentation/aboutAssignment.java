/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ejer
 */
public class aboutAssignment extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
       HttpSession session = request.getSession();
       User user = (User) session.getAttribute("user");
    session.setAttribute( "admin", user.getAdminStatus());
        session.setAttribute ("username", user.getUsername());
  
        return "AboutAssignment";
     
    }
    
}
