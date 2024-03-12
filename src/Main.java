import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");


        Connection con = SQLDatabase.getDBConnection();
        if(con!= null){
            System.out.println("MADE IT!!");
        }




  customer david = new customer("David", "Smith", "343243", "2343 Chanelour Drive", "San Fran", "CA", "90275", "user12", "poof", "3109229103", "October12th", 'm');



    david.createBankAccount(12.4);
        david.createBankAccount(12.4);
        //david.addTransaction(12);
       System.out.println(david.getAccList());
        System.out.println("poop "+david.getAccList().getCount());



     System.out.println("david account ballance: "+david.getCustBall());
        System.out.println("david account total: "+david.getTotalCustBall());

        david.getAddy();
        String g = customer.returnAddy(david);
       System.out.println(customer.returnAddy(david));


        custPQLL list = new custPQLL();

        System.out.println(list.isEmpty());

        //still have not created method to assign priorities, still working on it

       list.enqueue("1", 1);
        list.enqueue("3", 2);
        list.enqueue("2", 1);
        list.listALL();
       list.enqueue("4", 3);
        list.enqueue("5", 3);
        list.enqueue("2s",1);

        list.listALL();
        list.removeObj("2");
        list.deque();
        list.listALL();
        System.out.println(" pop: "+ list.pop());
        System.out.println(list.isEmpty());
        System.out.println("getting node 3: " + list.getNode(5).getData());

       // list.addObj("customerobj",list.compare(david.dateCreated, david.ballance,priorityQueue list,);




    }
}