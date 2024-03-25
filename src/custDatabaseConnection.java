import java.sql.*;

public class databaseConnection {

    private static String url = "jdbc:mysql://localhost:3306/CS413";
    private static String usr = "root";
    private static String password = "password";
    private static final String INSERT_SQL = "INSERT INTO customers (first_name,last_name,ssn,userName,passworrd,phone,bday,gender,dateCreated,address";
           // FIRSURE OUT HOW TO IMPUT THE VALUES: ----------+"VALUES ("fname, );
    private static final String SELECT_SQL_BYID = "SELECT * FROM customers WHERE id = ?";
    private static final String UPDATE_SQL = "UPDATE customer SET username = ?, email = ?, phone = ? WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM customer WHERE id = ?";

    private databaseConnection(){

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




}
