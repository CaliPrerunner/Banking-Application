
import java.time.LocalDate;
import java.util.Date;
import java.util.TreeMap;
public interface accountInterface<T> extends Comparable<T> {

    double ballance =0;
    LocalDate dateCreated = LocalDate.now();
     int customerID =0;


    public LocalDate getDateCreated();
    public double getBalance();
    public int getCustomerID();
    public TreeMap<Date,Double> getTransactionList();
    public void setBalance(double ballance);
    public void setDateCreated(LocalDate dateCreated);
    public void setCustoerID(int id);
}
