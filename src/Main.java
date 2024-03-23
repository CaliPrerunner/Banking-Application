import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("Hello world!");

/*

        Connection con = custDatabase.getDBConnection();
        if(con!= null){
            System.out.println("MADE IT!!");
        }

        //ObjectMapper om = new ObjectMapper();
        //String jsonString = "{"name":"John Doe","email":"jdoe@sfsu.edu"}"; YOUR_OBJECT obj = om.readValue(jsonString, YOUR_OBJECT.class);
 */

  customer david = new customer("David", "Smith", "343243", "2343 Chanelour Drive", "San Fran", "CA", "90275", "user12", "poof", "3109229103", "October12th", 'm');



        david.createBankAccount(12.0);
        LocalDate d2 = LocalDate.of(2025, 11,8);
        david.createBankAccount(d2, 22.0);
       // david.addTransaction(12);
        System.out.println("david's account list count:  "+david.getAccList().getCount());
        System.out.println("david account's : "+david.getCustAccList());
        System.out.println("david account total: "+david.getTotalCustBall());

        System.out.println("-------------------------------TEST");

david.deposit(300.0,1);
        System.out.println("david's account list count:  "+david.getAccList().getCount());
        System.out.println("david account's : "+david.getCustAccList());
        System.out.println("david account total: "+david.getTotalCustBall());
david.withdraw(50.0,1);
        System.out.println("david's account list count:  "+david.getAccList().getCount());
        System.out.println("david account's : "+david.getCustAccList());
        System.out.println("david account total: "+david.getTotalCustBall());




       // LocalDate d3 = LocalDate.of(2024, 11,8);

        //2001, 2024 march, 2024 nov
        //we want: d3 to be priority of 3












        //still have not created method to assign priorities, still working on it



       // list.addObj("customerobj",list.compare(david.dateCreated, david.ballance,priorityQueue list,);






    }
}