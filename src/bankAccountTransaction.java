import java.util.Date;

public class bankAccountTransaction {
    // kick off the command pattern of deposit and withdraw

    private TransactionInterface command;
    private int transactionID;
    private Date timeStamp;
    private String transactionType;
    private double amount;
    private String description;
    private int destinationAccID;
    private int sourceAccID;
    private boolean status;
    private int usrAcc;

    public bankAccountTransaction(int transactionID, Date timeStamp, String transactionType,
                                  double amount, String description, int destinationAccID,
                                  int sourceAccID, boolean status, int useracc,TransactionInterface tt) {
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.destinationAccID = destinationAccID;
        this.sourceAccID = sourceAccID;
        this.status = status;
        this.usrAcc = useracc;
        this.command = tt;
    }
    public void setCommand(TransactionInterface t){this.command = t;}
    public void execute() {
        this.command.execute();
    }
    public void print(){
        String output = "Transaction Time Samp: "+timeStamp+ " "
                + "Type: "+transactionType+ " "
                + "\nTransaction ID: "+transactionID+ " "
                + "\nAmount: "+amount+ " "
                + "\nDestination Account ID: "+destinationAccID+ " "
                + "Source Account ID: "+sourceAccID+ " "
                + "\nUser Account ID: "+usrAcc+ " "
                + "\nDescription: "+transactionType+ " "
                + "\nStatus: "+status;
        System.out.println(output);
    }

    public static bankAccTranBuilder bankAccTranBuilder(){return new bankAccTranBuilder();}

    //

    public static class bankAccTranBuilder {
        private TransactionInterface command;
        private int transactionID;
        private Date timeStamp;
        private String transactionType;
        private double amount;
        private String description;
        //should i store the source/destination acc via bankacc or ID
        // EX: private bankAccount destinationAccID; instead of the bottom\/
        private int destinationAccID;
        private int sourceAccID;
        private boolean status;
        private int usrAcc;

        public bankAccTranBuilder command(TransactionInterface c){
            this.command = c;
            return this;
        }

        public bankAccTranBuilder transactionID(int transactionID) {
            this.transactionID = transactionID;
            return this;
        }
        public bankAccTranBuilder timeStamp(Date timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public bankAccTranBuilder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public bankAccTranBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }
        public bankAccTranBuilder description(String description) {
            this.description = description;
            return this;
        }
        public bankAccTranBuilder destinationAccID(int destinationAccID) {
            this.destinationAccID = destinationAccID;
            return this;
        }
        public bankAccTranBuilder sourceAccID(int sourceAccID) {
            this.sourceAccID = sourceAccID;
            return this;
        }
        public bankAccTranBuilder status(boolean status) {
            this.status = status;
            return this;
        }
        public bankAccTranBuilder usrAcc(int usrAcc) {
            this.usrAcc = usrAcc;
            return this;
        }

        public bankAccountTransaction build(){
            return new bankAccountTransaction( transactionID, timeStamp, transactionType, amount, description, destinationAccID,sourceAccID,status,usrAcc , command);        }

    }
}