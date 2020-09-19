package student_valerija_ionova.lesson_14.level_3_junior.task_18;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    List<Transaction> getTransactionsInDefinedYear (List <Transaction> allTransactions, int year){
        return allTransactions.stream()
                              .filter(transaction -> transaction.getYear() == year)
                              .collect(Collectors.toList());
    }


}
