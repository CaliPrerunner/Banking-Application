import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("Hello world!");



        Connection con = custDatabaseConnection.getDBConnection();
        if(con!= null){
            System.out.println("MADE IT!!");
        }

        //the interface of custDAO creates a new cust dao
        //custDAOI testDAO = new custDAO();
        //customer testc =  testDAO.get(111);
        //testc.printCustomerDetails();

        //accountDAOI accDAO = new accountDAO();
        //account testa = accDAO.get(111);
        //testa.printAccountDetails();

        window win = new window();
        win.startGUI();








    }
}