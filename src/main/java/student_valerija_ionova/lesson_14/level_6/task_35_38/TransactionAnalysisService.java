package student_valerija_ionova.lesson_14.level_6.task_35_38;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TransactionAnalysisService {

    Optional <Integer> getMaxValue (List <Transaction> allTransactions){
        return allTransactions.stream()
                              .map(transaction -> transaction.getValue())
                              .sorted((o1, o2) -> o2 - o1)
                              .findFirst();

    }

    Optional <Integer> getMinValue (List <Transaction> allTransactions){
        return allTransactions.stream()
                .map(transaction -> transaction.getValue())
                .sorted(Comparator.comparingInt(o -> o))
                .findFirst();

    }

    String getNamesOfTradersInAlphabetOrder (List <Transaction> allTransactions){
        return allTransactions.stream()
                              .map(transaction -> transaction.getTrader())
                              .map(trader -> trader.getName())
                              .distinct()
                              .sorted((o1, o2) -> o1.compareTo(o2))
                              .collect(Collectors.joining(","));
    }


    String getTitlesOfUniqueCities (List <Transaction> allTransactions){
        return allTransactions.stream()
                              .map(transaction -> transaction.getTrader())
                              .map(trader -> trader.getCity())
                              .distinct()
                              .sorted((o1, o2) -> o1.compareTo(o2))
                              .collect(Collectors.joining(","));
    }


}
