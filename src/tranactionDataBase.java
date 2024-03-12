import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class tranactionDataBase {

        private static String url = "jdbc:root@localhost:3306";
        private static String usr = "root";
        private static String password = "password";
        private static final String INSERT_SQL = "INSERT INTO custID, transactions VALUES (?, ?)";
        private static final String SELECT_SQL_BYID = "SELECT custID, transactions WHERE id = ?";
        private static final String UPDATE_SQL = "UPDATE custID, transactions WHERE id = ?";
        private static final String DELETE_SQL = "DELETE FROM transaction WHERE id = ?";

        private tranactionDataBase(){

        }
        public static Connection getDBConnection() throws SQLException {
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