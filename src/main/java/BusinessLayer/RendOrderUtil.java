/*
 * BenedikteEva
 * Lego Houses
 */
package BusinessLayer;

import java.util.List;

/**
 *
 * @author Ejer
 */
public class RendOrderUtil {

    public static String OrderTabel(List<OrderEntity> customerOrders) {

        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n"
                + "<tr><th>Kunde nummer:</th><th>Ordre nummer</th><th>Status</th><th>vælg ordre</th></tr>\n");

        for (OrderEntity o : customerOrders) {

            sb.append("<tr><form name=\"admin\" action=\"FrontController\" method=\"POST\">");
            sb.append("<tr> <input type=\"hidden\" name=\"command\" value=\"admin\">");
            sb.append("<td>").append(o.getUser_id()).append("</td>");
            sb.append("<td>").append(o.getOrder_id()).append("</td>");
            sb.append("<td>").append(o.isShipped()).append("</td>");
            sb.append("<td> \n <input type=\"radio\" checked=\"checked\" name=\"order_id\" value=\"" + o.getOrder_id() + "\"><br>\n\n</td>");
        }
        sb.append("</table>\n");
        return sb.toString();

    }

}
