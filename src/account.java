import java.util.Date;
import java.util.HashMap;

public class account implements accountInterface{

    double ballance;
    Date dateCreated;
     int customerID;
     //maybe add account ID for transactions to be associated with account
    transactions transactionList;

     public account(){

     }

     public account(double ball, Date dateCrea, int custID){
         this.ballance = ball;
         this.customerID =custID;
         this.dateCreated = new Date();
         this.transactionList = new transactions(custID);
     }
    public account(double ball, int custID){
        this.ballance = ball;
        this.customerID =custID;
        this.dateCreated = new Date();
        this.transactionList = new transactions(custID);
    }

    public account(int cID){
        this.ballance = 0;
        this.dateCreated = new Date();
        this.customerID = cID;
        this.transactionList = new transactions(cID);
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getBallance() {
        return ballance;
    }
    public int getCustomerID() {
        return customerID;
    }
    public transactions getTransactionList(){return this.transactionList;}

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setCustoerID(int id){
        this.customerID = id;
    }



    }