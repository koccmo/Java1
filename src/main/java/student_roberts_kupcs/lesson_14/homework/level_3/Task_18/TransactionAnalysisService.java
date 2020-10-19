package student_roberts_kupcs.lesson_14.homework.level_3.Task_18;

import java.util.List;

import static java.util.stream.Collectors.toList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }
}
