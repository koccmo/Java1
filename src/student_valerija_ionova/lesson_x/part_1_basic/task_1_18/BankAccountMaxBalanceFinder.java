package student_valerija_ionova.lesson_x.part_1_basic.task_1_18;

/*Решаем задачу: какая наибольшая сумма денег была у пользователя
на счету за всё время (наибольший текущий баланс)?

Для выполнения этого расчёта создайте новый классе BankAccountMaxBalanceFinder.

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение максимального занчения баланса.
    }

}*/

public class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        Transaction [] transactions = bankAccount.getTransactions();
        int maxBalance;
        if (transactions[0].isDeposit()) {
            maxBalance = transactions[0].getAmount();
        }else{
            maxBalance = - transactions[0].getAmount();
        }
        int currentBalance = maxBalance;
        for (int i = 1; i<transactions.length; i++){
            if (transactions[i].isDeposit()) {
                currentBalance += transactions[i].getAmount();
            }else{
                currentBalance -= transactions[i].getAmount();
            }
            if (currentBalance > maxBalance){
                maxBalance = currentBalance;
            }
        }


        return maxBalance;
    }

}
