/*
Вводим новую функциональность: анализ расходов.

После реализации адгоритма расчёта потраченной на еду суммы денег у вас
должен был получиться примерно следующий код:

class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        // 1. Берём все транзакции банковского аккаунта;
        Transaction[] transactions = bankAccount.getTransactions();

        // 2. Отбираем только WITHDRAWAL транзакции, так как они являются расходами;
        List<Transaction> withdrawalTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }

        // 3. Из WITHDRAWAL транзакций отбираем транзакции у которых в категории расходов указано FOOD;
        List<Transaction> withdrawalFoodTransactions = new ArrayList<>();
        for (Transaction transaction : withdrawalTransactions) {
            if (transaction.getExpenseCategory() == ExpenseCategory.FOOD) {
                withdrawalFoodTransactions.add(transaction);
            }
        }

        // 4. Проходим по всем отобранным транзакциям и суммируем потраченные деньги.
        int foodExpensesAmount = 0;
        for (Transaction transaction : withdrawalFoodTransactions) {
            foodExpensesAmount = foodExpensesAmount + transaction.getAmount();
        }

        return foodExpensesAmount;
    }

}

Так как перед выполнением отбора (фильтрации) массива со всеми транзакциями
банковского аккаунта мы не знаем сколько из них окажется WITHDRAWAL транзакциями,
поэтому для сохранения отобранных транзакций была выбрана структура данных список.
Список можно создать не указывая его длины, а потом положить в него сколько угодно
объектов. Для процесса отбора (фильтрации) это очень удобно.

Для обхода массива и списков при решении данной задачи удобно воспользоваться
циклом foreach, так как нас не интересует порядок в котором мы проходим по списку или
массиву. В данном случае нас интересует просто применение для каждого элемента
списка или массива определённой операции.

Пришло время протестировать наш алгоритм.
Создайте класс FoodExpensesCalculatorTest и напишите автоматические юнит тесты
для метода calculateExpensesAmount().
 */
package student_igors_bartkevics.lesson_x.bank_account.part_3_inheritance_refactoring;

class FoodExpensesCalculatorTest {

    public static void main(String[] args) {
        FoodExpensesCalculatorTest test = new FoodExpensesCalculatorTest();
        test.calculateFoodExpenseAmountTest();
    }

    public void calculateFoodExpenseAmountTest() {

        ExpensesCalculator expensesCalculator = new FoodExpensesCalculator();

        Transaction[] transactions = new Transaction[7];
        transactions[0] = new Transaction(3000);
        transactions[1] = new Transaction(1200, ExpenseCategory.FOOD);
        transactions[2] = new Transaction(5000);
        transactions[3] = new Transaction(3500, ExpenseCategory.ENTERTAINMENT);
        transactions[4] = new Transaction(1200, ExpenseCategory.LOANS);
        transactions[5] = new Transaction(1200, ExpenseCategory.FOOD);
        transactions[6] = new Transaction(4000);

        BankAccount bankAccount = new BankAccount("Name Surname", transactions, 200);

        boolean condition1 = (expensesCalculator.calculateExpensesAmount(bankAccount) == 2400);
        boolean condition2 = !(expensesCalculator.calculateExpensesAmount(bankAccount) == 2401);
        boolean condition3 = !(expensesCalculator.calculateExpensesAmount(bankAccount) == 2399);

        checkResult(condition1, "Calculate food expense amount");
        checkResult(condition2, "Calculate food expense amount");
        checkResult(condition3, "Calculate food expense amount");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
