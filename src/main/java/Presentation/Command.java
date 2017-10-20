package Presentation;

import BusinessLayer.BenedikteEvasNewException;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The purpose of Command is to...
 *
 * @author kasper
 */
abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        
        commands.put("login", new Login());
        commands.put("logout", new LogOut());
        commands.put("errormsg", new ErrorMsg());
        commands.put("register", new Register());
        commands.put("odetails", new Odetails());
        commands.put("stykliste", new stykListe());
        commands.put("backcustomer", new backCustomer());
        commands.put("orderscustomer", new OrdersCustomer());
        commands.put("custordersadmin", new CustOrdersAdmin());
        commands.put("aboutassignment", new aboutAssignment());
        commands.put("setshippedstatus", new setShippedStatus());
        commands.put("getorderdata", new GetOrderData());
        commands.put("getallusers", new getAllUsers());
        commands.put("admin", new Admin());
        
    }

    static Command from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        request.setAttribute("commands", commands);
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new ErrorMsg());
    }

    abstract String execute(HttpServletRequest request, HttpServletResponse response) throws BenedikteEvasNewException;

}
