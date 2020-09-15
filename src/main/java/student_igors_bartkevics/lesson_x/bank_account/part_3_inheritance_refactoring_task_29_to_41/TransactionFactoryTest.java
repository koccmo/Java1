/*
Task_22

Вводим новую функциональность: анализ расходов.

После изменений класс Transaction должен выглядеть следущим образом:

class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    public Transaction(int amount) {
        this.transactionType = TransactionType.DEPOSIT;
        this.amount = amount;
        this.expenseCategory = null;
    }

    public Transaction(int amount, ExpenseCategory expenseCategory) {
        this.transactionType = TransactionType.WITHDRAWAL;
        this.amount = amount;
        this.expenseCategory = expenseCategory;
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

    public ExpenseCategory getExpenseCategory() {
        return this.expenseCategory;
    }

}

Протестируйте код в классе TransactionFactory.

Для этого создайте класс TransactionFactoryTest и протестируйте методы создания транзакций.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_3_inheritance_refactoring_task_29_to_41;


class TransactionFactoryTest {

    public static void main(String[] args) {
        TransactionFactoryTest test = new TransactionFactoryTest();
        test.createDepositTransactionTest();
        test.createWithdrawalTransactionTest();
    }

    public void createDepositTransactionTest() {
        Transaction transaction = new Transaction(200);
        boolean condition = (transaction.isDeposit() && (transaction.getAmount() == 200) &&
                (transaction.getExpenseCategory() == null));
        checkResult(condition, "Deposit transaction creation");
    }

    public void createWithdrawalTransactionTest() {
        Transaction transaction = new Transaction(300, ExpenseCategory.LOANS);
        boolean condition = (transaction.isWithdrawal() && (transaction.getAmount() == 300) &&
                (transaction.getExpenseCategory() == ExpenseCategory.LOANS));
        checkResult(condition, "Withdrawal transaction creation");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
