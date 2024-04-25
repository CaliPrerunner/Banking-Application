public class depositCommand implements TransactionInterface{
    private final double amount;
    private final bankAccount sourceAccount;

    public depositCommand(bankAccount acc, double ammount){
        this.amount = ammount;
        this.sourceAccount = acc;
    }
    @Override
    public void execute() {
        sourceAccount.deposit(amount);
    }

}
