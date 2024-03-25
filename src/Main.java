import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("Hello world!");



        Connection con = databaseConnection.getDBConnection();
        if(con!= null){
            System.out.println("MADE IT!!");
        }

        //the interface of custDAO creates a new cust dao
        custDAOI test = new custDAO();
        customer testc =  test.get(111);

        //ObjectMapper om = new ObjectMapper();
        //String jsonString = "{"name":"John Doe","email":"jdoe@sfsu.edu"}"; YOUR_OBJECT obj = om.readValue(jsonString, YOUR_OBJECT.class);













    }
}