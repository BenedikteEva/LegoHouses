package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BenedikteEva This DBConnector should connect to my remote server and a
 * database called legohouses
 *
 */
public class DBConnector {

 
    private final static String URL = "jdbc:mysql://46.101.179.58:3306/legohouses";
    private final static String USER = "xxxxx";
    private final static String PASSWORD = "xxxxx";
    private static Connection conn;

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName( "com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conn;
    }

}
