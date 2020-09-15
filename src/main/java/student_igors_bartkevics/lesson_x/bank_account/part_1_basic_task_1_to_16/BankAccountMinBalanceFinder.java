/*
Task_15:

Решаем задачу: какая наименьшая сумма денег была у пользователя
на счету за всё время (наименьший текущий баланс)?

Этот вопрос стал особо актуальным после введения кредитного лимита.
Если пользователь пользуется кредитным лимитом, то наименьшая сумма
денег у него на счету будет отрицательной.

Для выполнения этого расчёта создайте новый классе BankAccountMinBalanceFinder.

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение минимального заначения баланса.
    }

}
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение минимального заначения баланса.
        Transaction[] transactions = bankAccount.getTransactions();
        int currentBalance = 0;
        int minBalance = 0;
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.isDeposit()) {
                currentBalance += transaction.getAmount();
            }
            if (transaction.isWithdrawal()){
                currentBalance -= transaction.getAmount();
            }
            if (currentBalance < minBalance) {
                minBalance = currentBalance;
            }

        }
        return minBalance;
    }

}
