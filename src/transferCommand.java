public class transferCommand implements TransactionInterface{
    private final bankAccount destinationAccount;
    private final bankAccount sourceAccount;
    private final double ammount;

    transferCommand(bankAccount destA, bankAccount sourceA, double amm){
        this.ammount = amm;
        this.destinationAccount = destA;
        this.sourceAccount = sourceA;
    }

    @Override
    public void execute() {
        sourceAccount.transfer(destinationAccount, ammount);
    }
}
