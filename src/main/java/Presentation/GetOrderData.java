/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.OrderData;
import BusinessLayer.OrderEntity;
import BusinessLayer.StykCalculator;

import BusinessLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ejer
 */
public class GetOrderData extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int god = Integer.parseInt(request.getParameter("order_id"));
        OrderData od = LogicFacade.getOdetialsByOrderID(user.getUser_id(), god);
        request.setAttribute("od", od);

        StykCalculator sc = new StykCalculator();
        
        int length = od.getLength();
        int width = od.getWidth();
        int height = od.getHeight();
        int forbandt = od.getBondtype();
        sc.forbandtChoice(forbandt, height, length, width, request);

        return "orderscustomerpage";
    }

}
