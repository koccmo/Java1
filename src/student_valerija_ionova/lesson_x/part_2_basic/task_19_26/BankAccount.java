package student_valerija_ionova.lesson_x.part_2_basic.task_19_26;

class BankAccount {

    private Transaction[] transactions;
    private boolean ifCreditAccount;
    private int creditLimit;

    public BankAccount (Transaction[] transactions){
        this.transactions = transactions;
    }

    public Transaction[] getTransactions(){
        return transactions;
    }

    public boolean getIfCreditAccount(){
        return ifCreditAccount;
    }

    public void setIfCreditAccount(boolean ifCreditAccount){
        this.ifCreditAccount = ifCreditAccount;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
}

class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
        int currentBalance = 0;
        Transaction[] transactions = bankAccount.getTransactions();
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.isDeposit()) {
                currentBalance = currentBalance + transaction.getAmount();
            }
            if (transaction.isWithdrawal()) {
                currentBalance = currentBalance - transaction.getAmount();
            }
        }
        return currentBalance;
    }

}
