import java.util.Date;

public class bankAccountTransaction {
    // kick off the command pattern of deposit and withdraw

    private transferCommand command;
    private int transactionID;
    private Date timeStamp;
    private String transactionType;
    private double amount;
    private String description;
    private int destinationAccID;
    private int sourceAccID;
    private boolean status;
    private int usrAcc;

    public bankAccountTransaction(int transactionID, Date timeStamp, String transactionType, double amount, String description, int destinationAccID, int sourceAccID, boolean status, int useracc) {
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.destinationAccID = destinationAccID;
        this.sourceAccID = sourceAccID;
        this.status = status;
        this.usrAcc = useracc;
    }

    public void execute() {
        this.command.execute();
    }

    public class bankAccTranBuilder {
        private transferCommand command;
        private int transactionID;
        private Date timeStamp;
        private String transactionType;
        private double amount;
        private String description;
        private int destinationAccID;
        private int sourceAccID;
        private boolean status;
        private int usrAcc;

        public bankAccTranBuilder command(transferCommand command){
            this.command = command;
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

    }
}