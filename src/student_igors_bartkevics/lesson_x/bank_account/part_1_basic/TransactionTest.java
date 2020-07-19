/*
Продолжаем создание класса Transaction, который будет представлять из себя
транзакцию которая совершается с банковским счётом.

class Transaction {

    private int amount;
    private TransactionType transactionType;

    public Transaction(int amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean isDeposit() {
        return TransactionType.DEPOSIT == this.transactionType;
    }

    public boolean isWithdrawal() {
        return TransactionType.WITHDRAWAL == this.transactionType;
    }

}

Создайте класс TransactionTest и протестируйте методы isDeposit() и isWithdrawal().
Для каждого метода напишите два тест кейса, один на позитивный результат,
другой на негативный.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class TransactionTest {

    public static void main(String[] args) {
        TransactionTest test = new TransactionTest();
        test.isDepositTest();
        test.isWithdrawalTest();
    }

    public void isDepositTest() {
        Transaction deposit = new Transaction(3000, TransactionType.DEPOSIT);
        Transaction withdrawal = new Transaction(2000, TransactionType.WITHDRAWAL);
        checkResult(deposit.isDeposit(), "Is deposit");
        checkResult(!withdrawal.isDeposit(), "Is deposit");
    }

    public void isWithdrawalTest() {
        Transaction deposit = new Transaction(3000, TransactionType.DEPOSIT);
        Transaction withdrawal = new Transaction(2000, TransactionType.WITHDRAWAL);
        checkResult(!deposit.isWithdrawal(), "Is withdrawal");
        checkResult(withdrawal.isWithdrawal(), "Is withdrawal");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
