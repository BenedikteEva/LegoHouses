/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.OrderData;
import BusinessLayer.OrderEntity;
import BusinessLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BenedikteEva
 */
public class OrderMapper {

    public static OrderEntity getOrderByEmail() {
        return null;

    }

    public static void placeOdetails(OdetailsEntity od) throws BenedikteEvasNewException {

        try {

            Connection con = DBConnector.connection();
            String SQL;
            SQL = "INSERT INTO odetails( length, width, height, forbandt) VALUES ( ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, od.getLength());
            ps.setInt(2, od.getWidth());
            ps.setInt(3, od.getHeight());
            ps.setInt(4, od.getBondtype());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            od.setOrder_id(id);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }

    }

    public static void placeOrder(User user) throws BenedikteEvasNewException {

        try {

            Connection con = DBConnector.connection();
            String SQL;
            SQL = "INSERT INTO orderlist(user_id) values(?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, user.getUser_id());
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }

    }

    public static List<OrderEntity> getAllOrderIdByUserId(int user_id) throws BenedikteEvasNewException {
        try {
            OrderEntity id;
            List<OrderEntity> allOrderId = new ArrayList();
            Connection con = DBConnector.connection();
            String sql = "SELECT order_id, sendtstatus FROM orderlist where user_id=" + user_id;

            ResultSet rs = con.prepareStatement(sql).executeQuery();
            int lastId = -1;

            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                String shipped = rs.getString("sendtstatus");
                if (order_id != lastId) {
                    id = new OrderEntity(order_id, user_id, shipped);
                    allOrderId.add(id);
                }

            }
            return allOrderId;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }
    }

    public static void updateShippedStatus(int order_id )throws BenedikteEvasNewException {
        try {
          
            Connection con = DBConnector.connection();
            String sql = "UPDATE orderlist SET sendtstatus='afsendt' where order_id=" + order_id;
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }

    }

    public static OrderData getAllOdetailsbyOrderId(int user_id, int order_Id) throws BenedikteEvasNewException {
        try {
            Connection con = DBConnector.connection();
            User u = new User();
            OdetailsEntity od = new OdetailsEntity();
            OrderEntity ord = new OrderEntity();
            OrderData odda = null;
            String Sql;
            Sql = "SELECT orderlist.user_id, username, orderlist.order_id, length, width, height, "
                    + "forbandt, sendtstatus FROM userlist, orderlist, odetails "
                    + "where userlist.user_id=orderlist.user_id and "
                    + "odetails.order_id=orderlist.order_id and orderlist.order_id=" + order_Id + " and orderlist.user_id=" + user_id;
            ResultSet rs = con.prepareStatement(Sql).executeQuery();
            int lastId = -1;

            while (rs.next()) {
                String username = rs.getString("username");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int forbandt = rs.getInt("forbandt");
                String shipped = rs.getString("sendtstatus");
                odda = new OrderData(user_id, username, order_Id, height, width, length, forbandt, shipped);

            }
            return odda;

        } catch (ClassNotFoundException | SQLException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }

    }

   

}
