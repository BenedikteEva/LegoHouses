/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import BusinessLayer.User;
import BusinessLayer.BenedikteEvasNewException;
import BusinessLayer.OdetailsEntity;
import BusinessLayer.OrderEntity;
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
public class UserMapper {

    public static void createUser(User user) throws BenedikteEvasNewException {

        try {
            Connection con = DBConnector.connection();
            String SQL;
            SQL = "INSERT INTO userlist (username, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
           

            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setAdminStatus("customer");//something went wrong så had to cheat
            user.setUser_id(id);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws BenedikteEvasNewException {
        try {
            Connection con = DBConnector.connection();
            String SQL = "SELECT username, user_id, adminstatus FROM userlist WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String username = rs.getString("username");
                String adminstatus = rs.getString("adminstatus");
                int id = rs.getInt("user_id");

                User user = new User(username, email, password, adminstatus);
                user.setUser_id(id);
                return user;
            } else {
                throw new BenedikteEvasNewException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }
    }
    
      public static List<User> getAllUsers() throws BenedikteEvasNewException {
        try {
            User u;
            List<User> getAllUsers= new ArrayList();
            Connection con = DBConnector.connection();
            String sql = "SELECT user_id, username, email FROM userlist order by email";

            ResultSet rs = con.prepareStatement(sql).executeQuery();
           
           

            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                String username = rs.getString("username");
                String email = rs.getString("email");
            
                    u= new User(user_id,  email, username);
                    getAllUsers.add(u);
             

            }
            return getAllUsers;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new BenedikteEvasNewException(ex.getMessage());
        }
    }
 public static void main(String[] args) throws BenedikteEvasNewException {
        User user = new User();
       UserMapper um = new UserMapper();

        System.out.println(um.getAllUsers());
    }

}


