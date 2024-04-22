public class withdrawCommand implements TransactionInterface{
        private final double ammount;
        private final bankAccount account;
        public withdrawCommand(bankAccount acc, double ammount){
            this.ammount = ammount;
            this.account = acc;
        }
        @Override
        public void execute() {
            account.withdraw(ammount);
        }

}
