/*
 * BenedikteEva
 * Lego Houses
 */
package Presentation;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.LogicFacade;
import BusinessLayer.RendUserListUtil;
import BusinessLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ejer
 */
public class getAllUsers extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        List<User> users = LogicFacade.getAllUsers();
        String getusers = RendUserListUtil.UserList(users);
        session.setAttribute("getusers", getusers);

        return "employeepage";

    }

}
