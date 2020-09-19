package student_valerija_ionova.lesson_14.level_6;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;


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



}
