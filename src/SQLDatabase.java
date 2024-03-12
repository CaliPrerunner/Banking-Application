import java.sql.*;

public class SQLDatabase {

    private static String url = "jdbc:root@localhost:3306";
    private static String usr = "root";
    private static String password = "password";

    private SQLDatabase(){

    }
    public static Connection getDBConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection(url,usr,password);
        return connection;
    }




}
