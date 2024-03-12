import java.util.Date;
import java.util.HashMap;

public interface transactionsInterface {
    public HashMap<Date, Double> transactions = null;
    int custID = 0;
    public void deposit(double m, account acc);
    public void withdraw(double m, account acc);
    public void listAllTransactions();
    public void setCustID(int custID);
    public void getCustID();


}
