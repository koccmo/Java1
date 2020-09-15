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
package student_igors_bartkevics.lesson_x.bank_account.part_3_inheritance_refactoring_task_29_to_41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {

        List<Transaction> allTransactions = selectAllBankAccountTransactions(bankAccount);
        List<Transaction> withdrawalTransactions = selectWithdrawalTransactions(allTransactions);
        List<Transaction> transactionsWithExpenseCategoryEntertainment =
                selectTransactionsByExpenseCategory(withdrawalTransactions, getExpenseCategory());
        return sumOfAmountsOfTransactions(transactionsWithExpenseCategoryEntertainment);
    }

    protected List<Transaction> selectAllBankAccountTransactions(BankAccount bankAccount) {
        Transaction[] transactions = bankAccount.getTransactions();
        return new ArrayList<>(Arrays.asList(transactions));
    }

    protected List<Transaction> selectWithdrawalTransactions(List<Transaction> allTransactions) {
        List<Transaction> withdrawalTransactions = new ArrayList<>();
        for (Transaction transaction : allTransactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }
        return withdrawalTransactions;
    }

    protected List<Transaction> selectTransactionsByExpenseCategory(List<Transaction> transactions,
                                                                  ExpenseCategory expenseCategory) {
        List<Transaction> selectedTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getExpenseCategory() == expenseCategory) {
                selectedTransactions.add(transaction);
            }
        }
        return selectedTransactions;
    }

    protected int sumOfAmountsOfTransactions(List<Transaction> transactions) {
        int totalExpensesAmount = 0;
        for (Transaction transaction : transactions) {
            totalExpensesAmount += transaction.getAmount();
        }
        return totalExpensesAmount;
    }

    protected abstract ExpenseCategory getExpenseCategory();

}
