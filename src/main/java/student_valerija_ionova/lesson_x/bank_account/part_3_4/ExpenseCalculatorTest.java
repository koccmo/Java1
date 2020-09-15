package student_valerija_ionova.lesson_x.bank_account.part_3_4;

public class ExpenseCalculatorTest {

    public static void main(String[] args) {
        ExpenseCalculatorTest expenseCalculatorTest = new ExpenseCalculatorTest();
        expenseCalculatorTest.testFoodExpensesCalculator();
        expenseCalculatorTest.testFoodExpensesCalculatorNoFood();
        expenseCalculatorTest.testEntertainmentExpensesCalculator();
        expenseCalculatorTest.testCommunalPaymentsExpensesCalculatorNoFood();
        expenseCalculatorTest.testOthersExpensesCalculatorNoFood();
        expenseCalculatorTest.testGamblingExpensesCalculatorNoFood();

    }

    public void testFoodExpensesCalculator() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();
        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert", 20, ExpenseCategory.FOOD);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction4 = new Transaction("Robert",90);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.FOOD);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.FOOD) == 30){
            System.out.println("testFoodExpensesCalculator OK");
        }else{
            System.out.println("testFoodExpensesCalculator FAIL");
        }

    }

    public void testEntertainmentExpensesCalculator() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();

        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert", 20, ExpenseCategory.FOOD);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction4 = new Transaction("Robert",90);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.FOOD);

        BankAccount bankAccount = new BankAccount("Robert", 0,transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.ENTERTAINMENT) == 50){
            System.out.println("testEntertainmentExpensesCalculator OK");
        }else{
            System.out.println("testEntertainmentExpensesCalculator FAIL");
        }
    }



    public void testFoodExpensesCalculatorNoFood() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();
        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert",20, ExpenseCategory.COMMUNAL_PAYMENTS);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction4 = new Transaction("Robert",90);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.GAMBLING);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.FOOD) == 0){
            System.out.println("testFoodExpensesCalculator OK");
        }else{
            System.out.println("testFoodExpensesCalculator FAIL");
        }
    }

    public void testCommunalPaymentsExpensesCalculatorNoFood() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();
        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert",20, ExpenseCategory.COMMUNAL_PAYMENTS);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction4 = new Transaction("Robert",90);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.GAMBLING);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.COMMUNAL_PAYMENTS) == 20){
            System.out.println("testCommunalPaymentsExpensesCalculatorNoFood OK");
        }else{
            System.out.println("testCommunalPaymentsExpensesCalculatorNoFood FAIL");
        }
    }

    public void testOthersExpensesCalculatorNoFood() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();

        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert",20, ExpenseCategory.COMMUNAL_PAYMENTS);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction4 = new Transaction("Robert",90, ExpenseCategory.OTHERS);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.GAMBLING);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.OTHERS) == 90){
            System.out.println("testOthersExpensesCalculatorNoFood OK");
        }else{
            System.out.println("testOthersExpensesCalculatorNoFood FAIL");
        }
    }

    public void testGamblingExpensesCalculatorNoFood() {

        ExpensesCalculator foodExpenseCalculator = new ExpensesCalculator();

        Transaction transaction1 = new Transaction("Robert",15);
        Transaction transaction2 = new Transaction("Robert",20, ExpenseCategory.GAMBLING);
        Transaction transaction3 = new Transaction("Robert",50, ExpenseCategory.GAMBLING);
        Transaction transaction4 = new Transaction("Robert",90, ExpenseCategory.GAMBLING);
        Transaction transaction5 = new Transaction("Robert",10, ExpenseCategory.GAMBLING);

        BankAccount bankAccount = new BankAccount("Robert", 0, transaction1, transaction2, transaction3, transaction4, transaction5);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount, ExpenseCategory.GAMBLING) == 170){
            System.out.println("testGamblingExpensesCalculatorNoFood OK");
        }else{
            System.out.println("testGamblingExpensesCalculatorNoFood FAIL");
        }
    }


}
