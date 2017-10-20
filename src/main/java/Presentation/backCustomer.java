package Presentation;

import BusinessLayer.LogicFacade;
import BusinessLayer.User;
import BusinessLayer.BenedikteEvasNewException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The purpose of Login is to...
 *
 * @author kasper
 */
public class backCustomer extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        session.setAttribute("admin", user.getAdminStatus());
        session.setAttribute("username", user.getUsername());
        if (user.getAdminStatus() == "employee") {
           return "employeepage";
        } if(user.getAdminStatus()=="customer"){
             return "customerpage";
        }else{
            return "index";
        }
    }
}
