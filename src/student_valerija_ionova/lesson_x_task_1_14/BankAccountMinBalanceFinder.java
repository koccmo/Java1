package student_valerija_ionova.lesson_x_task_1_14;

/*Решаем задачу: какая наименьшая сумма денег была у пользователя
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

}*/

public class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        Transaction[] transactions = bankAccount.getTransactions();
        int minBalance;
        if (transactions[0].isDeposit()){
            minBalance = transactions[0].getAmount();
        }else{
            minBalance = - transactions[0].getAmount();
        }
        int currentBalance = 0;
        for (int i=0; i< transactions.length; i++){
            //System.out.println("Transaction type Deposit "+transactions[i].isDeposit());
            if (transactions[i].isDeposit()){
                currentBalance += transactions[i].getAmount();
                //System.out.println("currentBalance"+currentBalance);
                //System.out.println("minBalance"+minBalance);
                if (minBalance > currentBalance){
                    minBalance = currentBalance;
                }
            }
            else{
                currentBalance -= transactions[i].getAmount();
                if (minBalance > currentBalance){
                    minBalance = currentBalance;
                }
            }
        }
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный в предыдущих заданиях
        // и адаптируйте его под нахождение минимального заначения баланса.
        return minBalance;
    }

}
