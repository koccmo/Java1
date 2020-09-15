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
package student_igors_bartkevics.lesson_x.bank_account.part_4_task_42_to_47;

import java.util.HashMap;
import java.util.Map;

class ExpensesCategoryAmountCalculatorTest {

    public static void main(String[] args) {
        ExpensesCategoryAmountCalculatorTest test = new ExpensesCategoryAmountCalculatorTest();
        test.calculateExpensesByCategoryTest();
    }

    public void calculateExpensesByCategoryTest() {

        Transaction transaction1 = new Transaction(3000);
        Transaction transaction2 = new Transaction(1200, ExpenseCategory.FOOD);
        Transaction transaction3 = new Transaction(5000);
        Transaction transaction4 = new Transaction(3500, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction5 = new Transaction(1200, ExpenseCategory.LOANS);
        Transaction transaction6 = new Transaction(1200, ExpenseCategory.FOOD);
        Transaction transaction7 = new Transaction(4000);
        Transaction transaction8 = new Transaction(800, ExpenseCategory.GAMBLING);
        Transaction transaction9 = new Transaction(100, ExpenseCategory.COMMUNAL_PAYMENTS);
        Transaction transaction10 = new Transaction(150, ExpenseCategory.LOANS);
        Transaction transaction11 = new Transaction(30, ExpenseCategory.OTHERS);
        Transaction transaction12 = new Transaction(55, ExpenseCategory.OTHERS);

        BankAccount bankAccount = new BankAccount("Name Surname", 200 , transaction1,
                transaction2, transaction3, transaction4,transaction5, transaction6, transaction7,
                transaction8, transaction9, transaction10,transaction11, transaction12);

        ExpenseCategoryAmountCalculator calculator = new ExpenseCategoryAmountCalculator();

        Map<ExpenseCategory, Integer> expectedMap = new HashMap<>();
        expectedMap.put(ExpenseCategory.COMMUNAL_PAYMENTS, 100);
        expectedMap.put(ExpenseCategory.ENTERTAINMENT, 3500);
        expectedMap.put(ExpenseCategory.FOOD, 2400);
        expectedMap.put(ExpenseCategory.GAMBLING, 800);
        expectedMap.put(ExpenseCategory.LOANS, 1350);
        expectedMap.put(ExpenseCategory.OTHERS, 85);
        boolean condition = expectedMap.equals(calculator.calculate(bankAccount));

        checkResult(condition, "Calculate expenses by category");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
