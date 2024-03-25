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
        custDAOI testDAO = new custDAO();
        customer testc =  testDAO.get(111);
        testc.printCustomerDetails();

        accountDAOI accDAO = new accountDAO();
        account testa = accDAO.get(111);
        testa.printAccountDetails();

        customer l = new customer(444,"Drury-Robles");
        customer ll = new customer(222,"luke", "duruy-robles","000-00-000","lukeD", "pass", "415-232-2323","1999-05-12","male", LocalDate.now(),"the Marina");
        //testDAO.update(ll);

        PQLL<customer> ct = new PQLL<>();
        PQLL<account> ac = new PQLL<>();

        ct = testDAO.getAll();

        account pp = new account(1200,LocalDate.now(),222);

        int z = accDAO.update(pp);


        System.out.println("z:" + z);


System.out.println("done");




        //ObjectMapper om = new ObjectMapper();
        //String jsonString = "{"name":"John Doe","email":"jdoe@sfsu.edu"}"; YOUR_OBJECT obj = om.readValue(jsonString, YOUR_OBJECT.class);













    }
}