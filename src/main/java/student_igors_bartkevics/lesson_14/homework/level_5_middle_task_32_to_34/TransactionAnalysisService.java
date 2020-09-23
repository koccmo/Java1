package student_igors_bartkevics.lesson_14.homework.level_5_middle_task_32_to_34;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findAllTransactionsOf2011Year(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValue(List<Transaction> allTransactions) {

        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueInReverse(List<Transaction> allTransactions) {

        return allTransactions.stream()
                .sorted(((o1, o2) -> - Integer.compare(o1.getValue(), o2.getValue())))
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsOf2011YearAndSortThemByValue(List<Transaction> allTransactions) {

        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findYearsOfTransactions(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findUniqueYearsOfTransactions(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueNamesOfTraders(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueCitiesOfTraders(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueNamesOfTradersFromCambridge(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public List<String> findUniqueNamesOfTradersByCity(List<Transaction> allTransactions, String city) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean inMilanWorksAnyTrader(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean isAnyTraderOfTransactionsBasedInCity(List<Transaction> allTransactions, String city) {
        return allTransactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

}
