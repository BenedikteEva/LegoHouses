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
public class RendUserListUtil {

    public static String UserList(List<User> adminUser) {

        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n"
                + "<tr><th>Email</th><th>Brugernr</th><th>Brugernavn</th><th>Se ordrer</th></tr>\n");

        for (User u : adminUser) {

            sb.append("<tr><form name=\"custordersadmin\" action=\"FrontController\" method=\"POST\">");
            sb.append("<tr> <input type=\"hidden\" name=\"command\" value=\"custordersadmin\">");
            sb.append("<td>").append(u.getEmail()).append("</td>");
            sb.append("<td>").append(u.getUser_id()).append("</td>");
            sb.append("<td>").append(u.getUsername()).append("</td>");
            sb.append("<td> \n <input type=\"radio\" checked=\"checked\" name=\"user_idc\" value=\"" + u.getUser_id()+ "\"><br>\n\n</td>");
        }
        sb.append("</table>\n");
        return sb.toString();

    }

}
