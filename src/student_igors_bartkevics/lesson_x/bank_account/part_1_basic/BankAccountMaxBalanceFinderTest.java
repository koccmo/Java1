/*
Решаем задачу: какая наибольшая сумма денег была у пользователя
на счету за всё время (наибольший текущий баланс)?

Для выполнения этого расчёта создайте новый классе BankAccountMaxBalanceFinder.

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        int maxBalance = 0;
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
            if (currentBalance > maxBalance) {
                maxBalance = currentBalance;
            }
        }
        return maxBalance;
    }
}

Создайте класс BankAccountMaxBalanceFinderTest и протестируйте метод find().
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class BankAccountMaxBalanceFinderTest {

    public static void main(String[] args) {

        BankAccountMaxBalanceFinderTest test = new BankAccountMaxBalanceFinderTest();
        test.maxBalanceFinder();
    }

    public void maxBalanceFinder() {
        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction(3000, TransactionType.DEPOSIT);
        transactions[1] = new Transaction(1200, TransactionType.WITHDRAWAL);
        transactions[2] = new Transaction(4000, TransactionType.DEPOSIT);
        transactions[3] = new Transaction(3500, TransactionType.WITHDRAWAL);

        BankAccountMaxBalanceFinder maxBalancerFinder = new BankAccountMaxBalanceFinder();
        BankAccount bankAccount = new BankAccount("Name Surname", transactions, 10000);

        boolean condition  = (maxBalancerFinder.find(bankAccount) == 5800);
        checkResult(condition, "Max balance finder");
     }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
