import java.util.Date;
import java.util.HashMap;

public class transactionsDTO {
    //used to mark if customer has withdrawed via a negative value and deposited money via a postivie value;
    public HashMap<Date, Double> transactions;
    int custID;

    public transactionsDTO(int id) {
        this.custID=id;
    }

    public transactionsDTO(double m) {
        Date d = new Date();
        this.transactions = new HashMap<>();
        transactions.put(d, m);
    }

    public transactionsDTO(double m, Date d) {
        this.transactions = new HashMap<>();
        transactions.put(d, m);
    }

    public void deposit(double m, account acc) {
        System.out.println(m);
        if (m <= 0) {
            System.out.println("not withwdraw");
        } else {
            Date d = new Date();
            this.transactions.put(d, m);
            acc.ballance += m;
        }
    }

    public void withdraw(double m, account acc) {
        if (m >= 0) {
            System.out.println("not withwdraw");
        } else {
            Date d = new Date();
            this.transactions.put(d, m);
            acc.ballance -= m;
        }
    }

    public void listAllTransactions() {
        System.out.println(transactions);

    }

    public void setCustID(int custID) {
        this.custID = custID;
    }
    public int getCustID(){return this.custID;}
}
