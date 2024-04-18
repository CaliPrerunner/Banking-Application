import java.time.LocalDate;
import java.util.Date;
import java.util.TreeMap;

/*


3) crete employee object

 */
public class savingsAccount implements accountInterface {

    double balance;
    LocalDate dateCreated;
     int customerID;
     //maybe add account ID for transactions to be associated with account
     TreeMap<Date, Double> transactionList = new TreeMap<>();

     public savingsAccount(){

     }

     public savingsAccount(double ball, LocalDate dateCrea, int custID){
         this.balance = ball;
         this.customerID =custID;
         this.dateCreated = dateCrea;
         this.transactionList = new TreeMap<>();
     }

    public savingsAccount(int cID, LocalDate dateCreated){
         this.dateCreated = dateCreated;
        this.balance = 0;
        this.customerID = cID;
        this.transactionList = new TreeMap<>();
    }
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public double getBalance() {
        return balance;
    }
    public int getCustomerID() {
        return customerID;
    }
    public TreeMap<Date,Double> getTransactionList(){return this.transactionList;}

    public void setBalance(double ballance) {
        this.balance = ballance;
    }
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setCustoerID(int id){
        this.customerID = id;
    }

    public void deposit(double amount, Date date){
        if (amount > 0){
            this.balance += amount;
            transactionList.put(date, amount);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }
    public void deposit(double amount){
         Date date =  new Date();
        if (amount > 0){
            this.balance += amount;
            transactionList.put(date, amount);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double amount, Date date){
        if (amount > 0){
            if (amount <= this.balance){
                this.balance -= amount;
                transactionList.put(date, -amount);
            }
            else{
                System.out.println("Not enough funds to complete the transaction");
            }
        }
        else{
            System.out.println("Withdrawal amount must be positive");
        }
    }
    public void withdraw(double amount){
        Date date =  new Date();
        if (amount > 0){
            if (amount <= this.balance){
                this.balance -= amount;
                transactionList.put(date, -amount);
            }
            else{
                System.out.println("Not enough funds to complete the transaction");
            }
        }
        else{
            System.out.println("Withdrawal amount must be positive");
        }
    }
    public void printAccountDetails() {
        System.out.println("Account ID: " + customerID);
        System.out.println("Balance: " + balance);
        System.out.println("Date Opened: " + dateCreated);
    }

    public int compareTo(savingsAccount a ){

    }

    @Override
    public int compareTo(savingsAccount o) {
        return this.compareTo(o);
    }
}