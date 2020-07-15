package student_valerija_ionova.lesson_x.part_2_basic.task_19_26;

public class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {

        int sum = 0;
        Transaction [] transactions = bankAccount.getTransactions();

        for (int i=0; i < transactions.length; i++){
            if (transactions[i].isWithdrawal()){
                if (transactions[i].getExpenseCategory() == ExpenseCategory.FOOD){
                    sum += transactions[i].getAmount();
                }
            }
        }
        return sum;
    }
}
