public class withdrawCommand implements TransactionInterface{
        private final double amount;
        private final bankAccount sourceAccount;
        public withdrawCommand(bankAccount acc, double amount){
            this.amount = amount;
            this.sourceAccount = acc;
        }
        @Override
        public void execute() {
            sourceAccount.withdraw(amount);
        }

}
