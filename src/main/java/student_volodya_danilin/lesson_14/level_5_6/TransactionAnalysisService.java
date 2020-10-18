package student_volodya_danilin.lesson_14.level_5_6;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    //Task_34
    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    //Task_35
    public Optional<Integer> findMaxTransactionValue(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getValue)
                .max(Integer::compare);
    }

    //Task_36
    public Optional<Integer> findMinTransactionValue(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getValue)
                .min(Integer::compare);
    }

    //Task_37
    public String findAndSortTraderNames(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    //Task_38
    public String findAndSortTraderCities(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
