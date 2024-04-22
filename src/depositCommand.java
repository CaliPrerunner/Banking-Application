public class depositCommand implements TransactionInterface{
    private final double ammount;
    private final bankAccount account;

    public depositCommand(bankAccount acc, double ammount){
        this.ammount = ammount;
        this.account = acc;
    }
    @Override
    public void execute() {
        account.deposit(ammount);
    }
}
