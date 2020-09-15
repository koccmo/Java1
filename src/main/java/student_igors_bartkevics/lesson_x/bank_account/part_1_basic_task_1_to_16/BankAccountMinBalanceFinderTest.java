/*
Решаем задачу: какая наименьшая сумма денег была у пользователя
на счету за всё время (наименьший текущий баланс)?

Этот вопрос стал особо актуальным после введения кредитного лимита.
Если пользователь пользуется кредитным лимитом, то наименьшая сумма
денег у него на счету будет отрицательной.

Для выполнения этого расчёта создайте новый классе BankAccountMinBalanceFinder.

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        int minBalance = 0;
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
            if (currentBalance < minBalance) {
                minBalance = currentBalance;
            }
        }
        return minBalance;
    }

}

Создайте класс BankAccountMinBalanceFinderTest и протестируйте метод find().
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

class BankAccountMinBalanceFinderTest {

    public static void main(String[] args) {

        BankAccountMinBalanceFinderTest test = new BankAccountMinBalanceFinderTest();
        test.minBalanceFinder();
    }

    public void minBalanceFinder() {
        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction(3000, TransactionType.DEPOSIT);
        transactions[1] = new Transaction(3200, TransactionType.WITHDRAWAL);
        transactions[2] = new Transaction(4000, TransactionType.DEPOSIT);
        transactions[3] = new Transaction(3500, TransactionType.WITHDRAWAL);

        BankAccountMinBalanceFinder minBalancerFinder = new BankAccountMinBalanceFinder();
        BankAccount bankAccount = new BankAccount("Name Surname", transactions, 10000);

        boolean condition  = (minBalancerFinder.find(bankAccount) == -200);
        checkResult(condition, "Min balance finder");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }


}
