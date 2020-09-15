package student_valerija_ionova.lesson_x.bank_account.part_2_basic.task_19_26;


//Создайте класс FoodExpensesCalculatorTest и напишите автоматические юнит тесты для метода calculateExpensesAmount().

class FoodExpenseCalculatorTest {

    public static void main(String[] args) {
        FoodExpenseCalculatorTest foodExpenseCalculatorTest = new FoodExpenseCalculatorTest();
        foodExpenseCalculatorTest.testFoodExpensesCalculator();
        foodExpenseCalculatorTest.testFoodExpensesCalculatorNoFood();
    }

    public void testFoodExpensesCalculator() {

    FoodExpensesCalculator foodExpenseCalculator = new FoodExpensesCalculator();
    Transaction[] transactions = new Transaction[5];
    transactions[0] = new Transaction(15);
    transactions[1] = new Transaction(20, ExpenseCategory.FOOD);
    transactions[2] = new Transaction(50, ExpenseCategory.ENTERTAINMENT);
    transactions[3] = new Transaction(90);
    transactions[4] = new Transaction(10, ExpenseCategory.FOOD);

    BankAccount bankAccount = new BankAccount(transactions);

    if (foodExpenseCalculator.calculateExpensesAmount(bankAccount) == 30){
        System.out.println("testFoodExpensesCalculator OK");
    }else{
        System.out.println("testFoodExpensesCalculator FAIL");
    }

}

    public void testFoodExpensesCalculatorNoFood() {

        FoodExpensesCalculator foodExpenseCalculator = new FoodExpensesCalculator();
        Transaction[] transactions = new Transaction[5];
        transactions[0] = new Transaction(15);
        transactions[1] = new Transaction(20, ExpenseCategory.COMMUNAL_PAYMENTS);
        transactions[2] = new Transaction(50, ExpenseCategory.ENTERTAINMENT);
        transactions[3] = new Transaction(90);
        transactions[4] = new Transaction(10, ExpenseCategory.GAMBLING);

        BankAccount bankAccount = new BankAccount(transactions);

        if (foodExpenseCalculator.calculateExpensesAmount(bankAccount) == 0){
            System.out.println("testFoodExpensesCalculator OK");
        }else{
            System.out.println("testFoodExpensesCalculator FAIL");
        }

    }

}
