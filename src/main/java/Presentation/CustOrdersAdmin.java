/*
 * BenedikteEva
 * Lego Houses
* 
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import BusinessLayer.OrderEntity;
import BusinessLayer.RendOrderUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BenedikteEva
 */
public class CustOrdersAdmin extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        HttpSession session = request.getSession();
       
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        List<OrderEntity> orders = LogicFacade.getAllOrderIdByUserId(user_id);
        String orderList = RendOrderUtil.OrderTabel(orders);
        request.setAttribute("orders", orders);
        request.setAttribute("orderList", orderList);
        return "ordersadminpage";
    }
}


