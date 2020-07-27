package student_valerija_ionova.lesson_x.part_1_basic.task_1_18;

/*Создаём класс BankAccount.
Этот класс будет представлять банковский аккаунт и хранить все
совершённые с ним транзакции.

class BankAccount {

    private Transaction[] transactions;

    // создайте конструктор класса, который принимает массив транзакций
    // и сохраняет его в свойство transactions.

    // создайте get() метод для свойства transactions

}

На данный момент банковский аккаунт будет хранить только совершённые с ним транзакции.
Других свойств создавать нельзя.*/

class BankAccount {

    private Transaction[] transactions;
    private boolean ifCreditAccount;
    private int creditLimit;

    public BankAccount (Transaction [] transactions){
        this.transactions = transactions;
    }

    public Transaction [] getTransactions(){
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
