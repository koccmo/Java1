package student_jaroslav_brutan.lesson_14.day_3_to_6;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> getTransactionsInYear20011(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsByTheYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> transactionsByValue(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> transactionsDescendingByValue(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(((o1, o2) -> o2.getValue() - o1.getValue()))
                .collect(Collectors.toList());
    }

    public List<Transaction> transactionsIn2011AscendingByValue(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> allTransactionsByYear(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toList());
    }

    public Set<Integer> allUniqueTransactionsByYear(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toSet());
    }

    public Set<String> allTransactionsNames(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
    }

    public Set<String> traderUniqueCities(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public Set<String> tradersFromCambridge(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(cityToFind))
                .map(trader -> trader.getName())
                .collect(Collectors.toList());
    }

    public boolean isAnyTraderBasedInMilan(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean isAnyTraderBasedInCity(List<Transaction> allTransactions, String cityToCheck) {
        return allTransactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }
}