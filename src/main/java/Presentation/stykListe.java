/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.StykCalculator;
import BusinessLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ejer
 */
public class stykListe extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        OdetailsEntity ode = (OdetailsEntity) session.getAttribute("odetails");
        StykCalculator sc = new StykCalculator();
        int order_id = ode.getOrder_id();
        request.setAttribute("order_id", order_id);
        int length = ode.getLength();
        int width = ode.getWidth();
        int height = ode.getHeight();
        int forbandt = ode.getBondtype();
        sc.forbandtChoice(forbandt, height, length, width, request);
        return user.getAdminStatus() + "page";
    }

}
