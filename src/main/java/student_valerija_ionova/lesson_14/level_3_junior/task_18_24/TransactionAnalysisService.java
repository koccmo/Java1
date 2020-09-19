package student_valerija_ionova.lesson_14.level_3_junior.task_18_24;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    List<Transaction> getTransactionsInDefinedYear (List <Transaction> allTransactions, int year){
        return allTransactions.stream()
                              .filter(transaction -> transaction.getYear() == year)
                              .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionAscendingByValue (List <Transaction> allTransactions){
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List <Transaction> sortTransactionDescendingByValue (List <Transaction> allTransactions){
        return allTransactions.stream()
                              .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                              .collect(Collectors.toList());
    }

    List <Transaction> sortTransactionsIn2011AscendingByValue(List <Transaction> allTransactions){
        return allTransactions.stream()
                              .filter(transaction -> transaction.getYear() == 2011)
                              .sorted(Comparator.comparingInt(Transaction::getValue))
                              .collect(Collectors.toList());
    }


}
