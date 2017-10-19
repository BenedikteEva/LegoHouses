/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ejer
 */
public class Admin extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
        
        int user_id =  Integer.parseInt(request.getParameter("user_id"));
        request.setAttribute("user_id", user_id);
        return "ordersadminpage";
   
    }
    
}
