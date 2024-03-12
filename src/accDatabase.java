import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class accDatabase {

    private static String url = "jdbc:root@localhost:3306";
    private static String usr = "root";
    private static String password = "password";
    private static final String INSERT_SQL = "INSERT INTO account customerID, dateCreated, ballance, transactionList VALUES (?, ?)";
    private static final String SELECT_SQL_BYID = "SELECT  customerID, dateCreated, ballance, transactionList WHERE id = ?";
    private static final String UPDATE_SQL = "UPDATE customerID, dateCreated, ballance, transactionList WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM account WHERE id = ?";

    private accDatabase(){

    }
    public static Connection getDBConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection(url,usr,password);
        return connection;
    }
    public static String getInsert() {

        return INSERT_SQL;
    }

    public static String getUpdate() {

        return UPDATE_SQL;
    }

    public static String getSelect() {

        return SELECT_SQL_BYID;
    }

    public static String getDelete() {

        return DELETE_SQL;
    }

    public static String getURL() {

        return url;
    }

    public static String getUsername() {

        return usr;
    }

    public static String getPWD() {

        return password;
    }




}
