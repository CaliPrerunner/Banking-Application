public class transferCommand implements TransactionInterface{
    private final bankAccount destinationAccount;
    private final bankAccount sourceAccount;
    private final double amount;

    transferCommand(bankAccount destA, bankAccount sourceA, double amm){
        this.amount = amm;
        this.destinationAccount = destA;
        this.sourceAccount = sourceA;
    }

    @Override
    public void execute() {
        sourceAccount.transfer(destinationAccount, amount);
    }


}
