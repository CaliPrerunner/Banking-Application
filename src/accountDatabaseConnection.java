import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class accountDatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/CS413";
    private static String usr = "root";
    private static String password = "password";
    //sql command to insert given values into the columns and the ? are represenative of the data we wil put in with the prepared statment
    private static final String INSERT_SQL = "INSERT INTO account (custID,balance,date_created) VALUES(?,?,?)";

    //this is the SQL command that specifiying what data  is selecting and from which table it is coming from by the FROM command. WHERE points to the key that identifies the row in the SQL database
    private static final String SELECT_SQL_BYID = "SELECT * FROM account WHERE custID = ?";
    private static final String UPDATE_SQL = "UPDATE account SET custID = ?, balance = ?, date_created = ? WHERE custID = ?";
    private static final String DELETE_SQL = "DELETE FROM account WHERE custID = ?";
    private static final String LISTALL_SQL = "SELECT * FROM account";
    private accountDatabaseConnection(){

    }
    public static Connection getDBConnection() throws SQLException {
        Connection connection = null;
        try{ connection = DriverManager.getConnection(url,usr,password);

        }catch(SQLException e){
            System.out.println("MySQL JDBC Driver not found.");
            //e.printStackTrace();

        }

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
    public static String getListallSql(){
        return LISTALL_SQL;
    }

}
