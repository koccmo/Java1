package student_igors_bartkevics.lesson_x.bank_account.part_4_task_42_to_47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ExpenseCategoryAmountCalculator {

    List<ExpensesCalculator> calculators;

    ExpenseCategoryAmountCalculator() {
        calculators = new ArrayList<>();
        calculators.add(new CommunalPaymentsExpensesCalculator());
        calculators.add(new EntertainmentExpensesCalculator());
        calculators.add(new FoodExpensesCalculator());
        calculators.add(new GamblingExpensesCalculator());
        calculators.add(new LoansExpensesCalculator());
        calculators.add(new OthersExpensesCalculator());
    }

    public Map<ExpenseCategory, Integer> calculate(BankAccount bankAccount) {
        Map<ExpenseCategory, Integer> expensesByCategory = new HashMap<>();

        for (ExpensesCalculator calculator : calculators) {
            ExpenseCategory expenseCategory = calculator.getExpenseCategory();
            int expenseAmount = calculator.calculateExpensesAmount(bankAccount);
            expensesByCategory.put(expenseCategory, expenseAmount);
        }
        return expensesByCategory;
    }

}
