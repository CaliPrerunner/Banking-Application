import java.util.Date;

public class accDTO {
    double ballance;
    Date dateCreated;
    int customerID;
    //maybe add account ID for transactions to be associated with account
    transactions transactionList;

    public accDTO(){

    }

    public accDTO(double ball, Date dateCrea, int custID){
        this.ballance = ball;
        this.customerID =custID;
        this.dateCreated = new Date();
        this.transactionList = new transactions(custID);
    }
    public accDTO(double ball, int custID){
        this.ballance = ball;
        this.customerID =custID;
        this.dateCreated = new Date();
        this.transactionList = new transactions(custID);
    }

    public accDTO(int cID){
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
