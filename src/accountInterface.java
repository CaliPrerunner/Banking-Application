
import java.util.Date;
public interface accountInterface {

    double ballance =0;
    Date dateCreated = new Date();
     int customerID =0;
    //list of transactions
    public Date getDateCreated();
    public double getBallance();
    public int getCustomerID();
    public transactions getTransactionList();
    public void setBallance(double ballance);
    public void setDateCreated(Date dateCreated);
    public void setCustoerID(int id);
}
