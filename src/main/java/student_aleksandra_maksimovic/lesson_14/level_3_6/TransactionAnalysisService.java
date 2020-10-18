package student_aleksandra_maksimovic.lesson_14.level_3_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TransactionAnalysisService {
    public List<Transaction> findByYear(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortAsc(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortDesc(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findByYearSortAscByValue(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> getAllYears(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getAllTraderNames(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getAllTraderCities(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findAllTraderNamesByTraderCity(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean containsCity(List<Transaction> transactions, String city) {
        return transactions
                .stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    public Optional<Integer> getMaxValue(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getValue)
                .max(Integer::compare);
    }

    public Optional<Integer> getMinValue(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(Transaction::getValue)
                .min(Integer::compare);
    }

    public String getAllTraderNamesAsString(List<Transaction> transactions) {
        return getAllTraderNames(transactions)
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.joining(","));
    }

    public String getAllTraderCitiesAsString(List<Transaction> transactions) {
        return getAllTraderCities(transactions)
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.joining(","));
    }
}
