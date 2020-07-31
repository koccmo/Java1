package student_valerija_ionova.lesson_x.part_3;

import java.util.HashMap;
import java.util.Map;

class ExpenseCategoryAmountCalculatorTest {

    public static void main (String [] args){

        ExpenseCategoryAmountCalculatorTest expenseCategoryAmountCalculatorTest = new ExpenseCategoryAmountCalculatorTest();

        expenseCategoryAmountCalculatorTest.testResults();

    }

    void printResult(String name, boolean testResult){
            if (testResult){
                System.out.println(name+" OK");
            }else{
                System.out.println(name+" FAIL");
            }

        }

    void testResults() {

        BankAccount bankAccount = new BankAccount("Mops", 0, new Transaction("Mops", 20, ExpenseCategory.OTHERS));
        bankAccount.addTransaction(new Transaction("Mops", 50, ExpenseCategory.FOOD));
        bankAccount.addTransaction(new Transaction("Mops", 50, ExpenseCategory.FOOD));
        bankAccount.addTransaction(new Transaction("Mops", 40, ExpenseCategory.GAMBLING));
        bankAccount.addTransaction(new Transaction("Mops", 210, ExpenseCategory.COMMUNAL_PAYMENTS));
        bankAccount.addTransaction(new Transaction("Mops", 250, ExpenseCategory.FOOD));
        bankAccount.addTransaction(new Transaction("Mops", 20, ExpenseCategory.ENTERTAINMENT));
        bankAccount.addTransaction(new Transaction("Mops", 350, ExpenseCategory.ENTERTAINMENT));
        bankAccount.addTransaction(new Transaction("Mops", 60, ExpenseCategory.LOANS));
        bankAccount.addTransaction(new Transaction("Mops", 2, ExpenseCategory.OTHERS));
        bankAccount.addTransaction(new Transaction("Mops", 50, ExpenseCategory.FOOD));

        ExpenseCategoryAmountCalculator expenseCategoryAmountCalculator = new ExpenseCategoryAmountCalculator();

        Map<ExpenseCategory, Integer> result;

        result = expenseCategoryAmountCalculator.calculate(bankAccount);

        for (Map.Entry m : result.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        //????????????? Kak sravnitj map???
    }
}
