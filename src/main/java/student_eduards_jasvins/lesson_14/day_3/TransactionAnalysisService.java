package student_eduards_jasvins.lesson_14.day_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TransactionAnalysisService {

    public List <Transaction> findAllTransFor2011(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List <Transaction> findAllTransForYear(List <Transaction> allTransaction, int year) {
        return allTransaction.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List <Transaction> sortTransactionByValue(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List <Transaction> sortTransactionByValueInReverse(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .sorted(((o1, o2) -> - Integer.compare(o1.getValue(), o2.getValue())))
                .collect(Collectors.toList());
    }

    public List <Transaction> findAllTransFor2011YearAndSortThemByValue(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List <Integer> findYearsOfTransaction(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List <String> findUniqueNamesOfTraders(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List <String> findUniqueCitiesOfTraders(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toList());
    }

    public Set<String> findUniqueNamesFromCambridge(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public List <String> findUniqueNamesOfTradersByCity(List <Transaction> allTransaction, String city) {
        return allTransaction.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean inMilanWorksAnyTrader(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean inAnyTraderInTransactionsBasedInCity(List <Transaction> allTransaction, String city) {
        return allTransaction.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    public Optional <Integer> maxValueOfTransactions(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparingInt(Integer::intValue));
    }

    public Optional <Integer> minValueOfTransactions(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparingInt(Integer::intValue));
    }

    public String getStringOfAllTradersSortedAndSplitByComa(List <Transaction> allTransaction) {
        return allTransaction.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted(String::compareTo)
                .collect(Collectors.joining(","));
    }


}
