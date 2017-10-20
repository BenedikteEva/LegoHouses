/*
 * BenedikteEva
 * Lego Houses
* 
 */
package Presentation;

import BusinessLayer.LogicFacade;
import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.OrderEntity;
import BusinessLayer.StykCalculator;
import BusinessLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BenedikteEva
 */
public class Odetails extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        int order_id = 0;
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        int forbandt = Integer.parseInt(request.getParameter("type"));
 
        
        BusinessLayer.OdetailsEntity odetails = LogicFacade.updateOdetails(order_id, length, width, height, forbandt);
        order_id=odetails.getOrder_id();
        BusinessLayer.OrderEntity order = LogicFacade.placeOrder(order_id, user.getUser_id());
        session.setAttribute("order", order);
        session.setAttribute("odetails", odetails);
        request.setAttribute("odetails", odetails);
        return user.getAdminStatus() + "page";
    }

}
