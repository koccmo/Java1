package student_valerija_ionova.lesson_x.bank_account.part_3_4;

import java.util.HashMap;
import java.util.Map;

public class ExpenseCategoryAmountCalculator {

    public Map<ExpenseCategory, Integer> calculate(BankAccount bankAccount){

        ExpensesCalculator calculator = new ExpensesCalculator();
        Map<ExpenseCategory, Integer> result = new HashMap <ExpenseCategory, Integer>();

        for (ExpenseCategory expenseCategory : ExpenseCategory.values()){
            int sum = calculator.calculateExpensesAmount(bankAccount, expenseCategory);
            result.put(expenseCategory, sum);
        }
        return result;
    }

}
