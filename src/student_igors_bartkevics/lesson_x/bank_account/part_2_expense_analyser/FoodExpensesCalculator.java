/*
Task_23:
Вводим новую функциональность: анализ расходов.

Задача по расчёту потраченной суммы денег для каждой категории товаров.

Возьмём для примера категорию расходов FOOD.

Давайте составим (придумаем/распишем) на словах алгоритм решения этой задачи:
1. Берём все транзакции банковского аккаунта;
2. Отбираем только WITHDRAWAL транзакции, так как они являются расходами;
3. Из WITHDRAWAL транзакций отбираем транзакции у которых в категории расходов указано FOOD;
4. Проходим по всем отобранным транзакциям и суммируем потраченные деньги.

Описание алгоритма готово, теперь можно переходить непосредственно к реализации
этого алгоритма в виде программного кода. Это самостоятельный алгоритм, тоесть
алгоритм для реализации которого не нужны другие алгоритмы, всё что ему нужно
это объект BankAccount со списком транзакций. Поэтому можно начать с того,
что создать отдельный класс FoodExpensesCalculator:

class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        // реализуйте тут расписанный выше алгоритм
        // если для этого есть необходимость создавайте отдельные
        // private методы в этом классе
    }

}
 */
package student_igors_bartkevics.lesson_x.bank_account.part_2_expense_analyser;
import java.util.ArrayList;
public class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        // реализуйте тут расписанный выше алгоритм
        // если для этого есть необходимость создавайте отдельные
        // private методы в этом классе

        // 1. Берём все транзакции банковского аккаунта;
        // 2. Отбираем только WITHDRAWAL транзакции, так как они являются расходами;
        ArrayList<Transaction> withdrawalTransactions = selectWithdrawalTransactions(bankAccount);

        // 3. Из WITHDRAWAL транзакций отбираем транзакции у которых в категории расходов указано FOOD;
        ArrayList<Transaction> transactionsWithExpenseCategoryFood = selectTransactionsWithExpenseCategoryFood(withdrawalTransactions);

        // 4. Проходим по всем отобранным транзакциям и суммируем потраченные деньги.
        int foodExpensesAmount = 0;
        for (Transaction transaction : transactionsWithExpenseCategoryFood) {
            foodExpensesAmount += transaction.getAmount();
        }
        return foodExpensesAmount;
    }

    public ArrayList<Transaction> selectWithdrawalTransactions(BankAccount bankAccount) {
        ArrayList<Transaction> withdrawalTransactions = new ArrayList<>();
        Transaction[] transactions = bankAccount.getTransactions();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }
        return withdrawalTransactions;
    }

    public ArrayList<Transaction> selectTransactionsWithExpenseCategoryFood(ArrayList<Transaction> withdrawalTransactions) {
        ArrayList<Transaction> transactionsWithExpenseCategoryFood = new ArrayList<>();
        for (Transaction withdrawalTransaction : withdrawalTransactions) {
            if (withdrawalTransaction.getExpenseCategory() == ExpenseCategory.FOOD) {
                transactionsWithExpenseCategoryFood.add(withdrawalTransaction);
            }
        }
        return transactionsWithExpenseCategoryFood;
    }


}
