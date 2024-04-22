import java.time.LocalDate;
import java.util.Date;
import java.util.TreeMap;

/*


3) crete employee object

 */
public class bankAccount<T> implements accountInterface<T> {

    double balance;
    LocalDate dateCreated;
    String type;
    int customerID;
    int accNumber;
     //maybe add account ID for transactions to be associated with account
     TreeMap<Date, Double> transactionList = new TreeMap<>();

     public bankAccount(){
         this.dateCreated = LocalDate.now();
     }

     public bankAccount(double ball, int custID){
         this.balance = ball;
         this.customerID =custID;
         this.dateCreated = LocalDate.now();
         this.transactionList = new TreeMap<>();
     }
    public bankAccount(double ball, int custID,String type, int accN){
        this.balance = ball;
        this.customerID =custID;
        this.dateCreated = LocalDate.now();
        this.type = type;
        this.accNumber = accN;
        this.transactionList = new TreeMap<>();
    }
    //TESTER CLONSTRUCTOR DELETE WHEN DONE TESTING COMPARE TO METHODS
    public bankAccount(double ball, int custID,String type, int accN,LocalDate d){
        this.balance = ball;
        this.customerID =custID;
        this.dateCreated = d;
        this.type = type;
        this.accNumber = accN;
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
    public String getAccType(){return type;}
    public int getAccNumber(){return accNumber;}
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
    public void setType(String t){this.type =t;}
    public void setAccNumber(int n){this.accNumber=n;}


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

    public int compareTo(T ba) {
         return this.compareTo((bankAccount) ba);
    }
    public int compareTo(bankAccount ba) {
         return this.compareTo(ba);
    }

}