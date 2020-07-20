/*
Task_13:

Решаем задачу: можно ли разрешить выполнить новую транзакцию?

Вам поручили реализовать алгоритм, который будет принимать решение
можно ли одобрить новую транзакцию или нет. На данный момент правила
просты - транзакцию можно одобрить только если на балансе у пользователя
есть достаточно средств. В минус уходить нельзя :).

Для выполнения этого расчёта создайте новый классе BankAccountTransactionApprover.

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        int currentBalance = currentBalanceCalculator.calculate(bankAccount);
        return newTransaction.isDeposit()
                || (newTransaction.isWithdrawal() && currentBalance >= newTransaction.getAmount());
    }
}

Создайте класс BankAccountTransactionApproverTest и протестируйте метод approve().
Создайте отдельные тесты для каждого возможного сценария.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class BankAccountTransactionApproverTest {

    public static void main(String[] args) {
        BankAccountTransactionApproverTest test = new BankAccountTransactionApproverTest();
        test.transactionApproverTest();
    }

    public void transactionApproverTest() {
        String testName = "Transaction approver";

        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction(3000, TransactionType.DEPOSIT);
        transactions[1] = new Transaction(1200, TransactionType.WITHDRAWAL);
        transactions[2] = new Transaction(4000, TransactionType.DEPOSIT);
        transactions[3] = new Transaction(3500, TransactionType.WITHDRAWAL);

        BankAccount bankAccount = new BankAccount("Name Surname", transactions);
        BankAccountTransactionApprover transactionApprover = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());

        //deposit transaction amount < current amount
        Transaction testTransaction1 = new Transaction(20, TransactionType.DEPOSIT);
        boolean condition1 = (transactionApprover.approve(bankAccount, testTransaction1));
        checkResult(condition1, testName);

        //deposit transaction amount > current amount
        Transaction testTransaction2 = new Transaction(20000, TransactionType.DEPOSIT);
        boolean condition2 = (transactionApprover.approve(bankAccount, testTransaction2));
        checkResult(condition2, testName);

        //withdrawal transaction amount < current amount
        Transaction testTransaction3 = new Transaction(20, TransactionType.WITHDRAWAL);
        boolean condition3 = (transactionApprover.approve(bankAccount, testTransaction3));
        checkResult(condition3, testName);

        //withdrawal transaction amount = current amount
        Transaction testTransaction4 = new Transaction(2300, TransactionType.WITHDRAWAL);
        boolean condition4 = (transactionApprover.approve(bankAccount, testTransaction4));
        checkResult(condition4, testName);

        //withdrawal transaction amount > current amount
        Transaction testTransaction5 = new Transaction(2301, TransactionType.WITHDRAWAL);
        boolean condition5 = !(transactionApprover.approve(bankAccount, testTransaction5));
        checkResult(condition5, testName);
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
