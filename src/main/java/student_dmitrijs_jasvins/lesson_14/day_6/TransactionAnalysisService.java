package student_dmitrijs_jasvins.lesson_14.day_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TransactionAnalysisService {
    private List<Transaction> descendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    private List<Transaction> ascendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public Optional<Integer> theBiggestValueV1(List<Transaction> transactions){
        List<Transaction> descendingListByValue = descendingSortByValue(transactions);
        return Optional.of(descendingListByValue.get(0).getValue());
    }

    public OptionalInt theBiggestValueV2(List<Transaction> transactions){
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max();
    }

    public Optional<Integer> theSmallestValueV1(List<Transaction> transactions){
        List<Transaction> ascendingListByValue = ascendingSortByValue(transactions);
        return Optional.of(ascendingListByValue.get(0).getValue());
    }

    public OptionalInt theSmallestValueV2(List<Transaction> transactions){
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min();
    }

    public String tradersNameAlphabet(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String tradersCitiesAlphabet(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }
}
