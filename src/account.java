import java.util.Date;

public class account implements accountInterface{

    double ballance;
    Date dateCreated;
     int customerID;
    priorityQueueLL transactionList;

     public account(){

     }

     public account(double ball, Date dateCrea, int custID){
         this.ballance = ball;
         this.customerID =custID;
         this.dateCreated = new Date();
     }


    public account(int cID){
        this.ballance = 0;
        this.dateCreated = new Date();
        this.customerID = cID;
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
