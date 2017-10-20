package BusinessLayer;

import Data.OrderMapper;

import Data.UserMapper;
import Presentation.Odetails;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper (2 first method) BenedikteEva the rest
 */
public class LogicFacade {

    public static User login(String username, String email, String password) throws BenedikteEvasNewException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String username, String email, String password) throws BenedikteEvasNewException {
        User user = new User(username, email, password);
        UserMapper.createUser(user);
        return user;
    }

    public static List<User> getAllUsers() throws BenedikteEvasNewException {
        return UserMapper.getAllUsers();
    }

    public static OdetailsEntity updateOdetails(int order_id, int length, int width, int height, int forbandt) throws BenedikteEvasNewException {
        OdetailsEntity od = new OdetailsEntity(order_id, length, width, height, forbandt);
        OrderMapper.placeOdetails(od);
        return od;
    }

    public static OrderEntity placeOrder(int order_id, int user_id) throws BenedikteEvasNewException {
        OrderEntity order = new OrderEntity(order_id, user_id);
        User user = new User(user_id);
        OrderMapper.placeOrder(user);
        return order;
    }

    public static List<OrderEntity> getAllOrderIdByUserId(int user_id) throws BenedikteEvasNewException {
        return OrderMapper.getAllOrderIdByUserId(user_id);
    }

    
    public static OrderData getOdetialsByOrderID(int user_id, int order_id) throws BenedikteEvasNewException {
        return OrderMapper.getAllOdetailsbyOrderId(user_id, order_id);
    }

    
    public static void updateShippedStatus(int order_id) throws BenedikteEvasNewException {
        OrderMapper.updateShippedStatus(order_id);
    }
}
