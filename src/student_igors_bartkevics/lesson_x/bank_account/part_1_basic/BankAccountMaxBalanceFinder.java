/*
Task_9:

Решаем задачу: какая наибольшая сумма денег была у пользователя
на счету за всё время (наибольший текущий баланс)?

Для выполнения этого расчёта создайте новый классе BankAccountMaxBalanceFinder.

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение максимального заначения баланса.
    }
}
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic;

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение максимального заначения баланса.
        Transaction[] transactions = bankAccount.getTransactions();
        int currentBalance = 0;
        int maxBalance = 0;
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.isDeposit()) {
                currentBalance += transaction.getAmount();
            }
            if (transaction.isWithdrawal()){
                currentBalance -= transaction.getAmount();
            }
            if (currentBalance > maxBalance) {
                maxBalance = currentBalance;
            }

        }
        return maxBalance;
    }
}