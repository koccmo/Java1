package student_valerija_ionova.lesson_x.part_3;

public class ExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount, ExpenseCategory expenseCategory) {
        int sum = 0;

        for (Transaction transaction : bankAccount.getTransactions()){
            if (transaction.getExpenseCategory() == expenseCategory){
                sum += transaction.getAmount();
            }
        }
        return sum;
    }
}
