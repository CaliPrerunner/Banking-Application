import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {

/*
        bankAccount secondCheckingAccount = new checkingAccount(250);
        LocalDate test =  LocalDate.of(2022,11,8);
        bankAccount firstCheckingAccount = new savingsAccount(250,test);

        customer bob = new customer(111,"bob");
        //bob.setAccList(firstCheckingAccount);
        //bob.setAccList(secondCheckingAccount);
        customer ted = new customer(222,"ted");
        //ted.setAccList(firstCheckingAccount);
        //ted.setAccList(secondCheckingAccount);
        LocalDate d = LocalDate.of(2022, 11,1);
        ted.setDateCreated(d);

        //this is how the PQLL should be implemented
        PQLL teextC = new PQLL<>();

        teextC.enqueue(secondCheckingAccount);
        int x=0;
        System.out.println("Should be: "+firstCheckingAccount.compareTo(secondCheckingAccount));
        teextC.enqueue(firstCheckingAccount);

        System.out.println("employees: "+ted.compareTo(bob));

        System.out.println(secondCheckingAccount.compareTo(firstCheckingAccount));


 */

        //Creating a customer using the builder pattern
        customer firstCustomer = new customer.bankCustomerBuilder().firstName("Marco")
                .lastName("Robles")
                .customerID(111)
                .userName("marco_is_cool")
                .password("Super-Secure-Password")
                .gender("male")
                .phone("415-111-1111")
                .dateCreated(LocalDate.now())
                .SSN("123456789")
                .birthday("April 20th 2024")
                .addy("San Francisco")
                .email("mrobles7@mail.sfsu.edu")
                .build();

        //printing all the arributes of the 'first customer'
        firstCustomer.printCustomerDetails();

        bankAccount b1 = new savingsAccount(1500);
        bankAccount b2 = new savingsAccount(550);
        TransactionInterface t = new withdrawCommand(b1, 2000);
        t.execute();

int x=0;

/*
        Connection con = custDatabaseConnection.getDBConnection();
        if(con!= null){
            System.out.println("MADE IT!!");
        }
        window win = new window();
        win.startGUI();

        the interface of custDAO creates a new cust dao
        custDAOI testDAO = new custDAO();
        customer testc =  testDAO.get(111);
        testc.printCustomerDetails();

        accountDAOI accDAO = new accountDAO();
        account testa = accDAO.get(111);
        testa.printAccountDetails();

 */


    }
}