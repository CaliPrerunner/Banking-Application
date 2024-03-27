import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class empDatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/CS413";
    private static String usr = "root";
    private static String password = "password";
    //sql command to insert given values into the columns and the ? are represenative of the data we wil put in with the prepared statment
    private static final String INSERT_SQL = "INSERT INTO employees (employeeID,first_name,last_name,bday,email,department,user,password,phone,gender,salary ) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

    //this is the SQL command that specifiying what data  is selecting and from which table it is coming from by the FROM command. WHERE points to the key that identifies the row in the SQL database
    private static final String SELECT_SQL_BYID = "SELECT * FROM employees WHERE employeeID = ?";
    private static final String UPDATE_SQL = "UPDATE employees SET employeeID = ?, first_name = ?, last_name = ?, bday = ?, email = ?, department = ? , user =?, password=?, phone =?, gender =?, salary =? WHERE employeeID = ?";
    private static final String DELETE_SQL = "DELETE FROM employees WHERE employeeID = ?";
    private static final String LISTALL_SQL = "SELECT * FROM employees";
    private empDatabaseConnection(){

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
