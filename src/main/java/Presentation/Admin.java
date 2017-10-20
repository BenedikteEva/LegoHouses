/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ejer
 */
public class Admin extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        int order_id = Integer.parseInt(request.getParameter("order_id"));
        LogicFacade.updateShippedStatus(order_id);
        
        return "ordersadminpage";
   
    }
    
}
