/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import BusinessLayer.OrderEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ejer
 */
public class setShippedStatus extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
        
          HttpSession session = request.getSession();
       
          int order_id = Integer.parseInt(request.getParameter("order_id"));
        LogicFacade.updateShippedStatus(order_id);
      
        return "employeepage";
     
    }
    
}
