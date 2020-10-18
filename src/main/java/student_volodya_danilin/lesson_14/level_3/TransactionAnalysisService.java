package student_volodya_danilin.lesson_14.level_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

    //Task_20
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
    }

    //Task_21
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    //Task_22
    public List<Transaction> sortAscendingByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    //Task_23
    public List<Transaction> sortDescendingByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    //Task_24
    public List<Transaction> findByYearAndSortAscendingByValue(List<Transaction> transactions, int yearToSearch) {
        return transactions.stream()
                .filter(t -> t.getYear() == yearToSearch)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
