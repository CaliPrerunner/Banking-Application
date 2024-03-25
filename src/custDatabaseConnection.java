import java.sql.*;

public class custDatabaseConnection {

    private static String url = "jdbc:mysql://localhost:3306/CS413";
    private static String usr = "root";
    private static String password = "password";
    //sql commands to insert given values into the columns and the ? are represenative of the data we wil put in with the prepared statment
    private static final String INSERT_SQL = "INSERT INTO customers (customerID,first_name,last_name,ssn,userName,passworrd,phone,bday,gender,dateCreated,address) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
           // FIRSURE OUT HOW TO IMPUT THE VALUES: ----------+"VALUES ("fname, );
    private static final String SELECT_SQL_BYID = "SELECT * FROM customers WHERE customerID = ?";
    //sql update command
    private static final String UPDATE_SQL = "UPDATE customers SET customerID = ?, first_name = ?, last_name = ?, ssn = ?, userName = ?, passworrd = ?, phone = ?,bday = ?, gender = ?, dateCreated = ?, address=? WHERE customerID =?";

    private static final String DELETE_SQL = "DELETE FROM customers WHERE customerID = ?";
    private static final String LISTALL_SQL = "SELECT * FROM customers";

    private custDatabaseConnection(){

    }
    public static Connection getDBConnection() throws SQLException{
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
