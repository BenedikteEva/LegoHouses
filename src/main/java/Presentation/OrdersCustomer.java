/*
 * BenedikteEva
 * Lego Houses
* 
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.OrderEntity;
import BusinessLayer.RendOrderUtil;
import BusinessLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BenedikteEva
 */
public class OrdersCustomer extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int user_id = user.getUser_id();
        List<OrderEntity> orders = LogicFacade.getAllOrderIdByUserId(user_id);
        request.setAttribute("orders", orders);
        String orderList = RendOrderUtil.OrderTabel(orders);
        request.setAttribute("orderList", orderList);
        if (orders.isEmpty()) {
            return "customerpage";
        } else {
            return "orderscustomerpage";
        }
    }

}
