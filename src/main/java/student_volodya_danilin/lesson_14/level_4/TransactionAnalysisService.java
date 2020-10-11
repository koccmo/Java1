package student_volodya_danilin.lesson_14.level_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    //Task_25
    List<Integer> findAllYearsWithTransactions(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getYear)
                .sorted()
                .collect(Collectors.toList());
    }

    //Task_26
    List<Integer> findAllUniqueYearsWithTransactions(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getYear)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    //Task_27
    List<Trader> findAllUniqueTraders(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getTrader)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_28
    List<String>  findUniqueTraderCities(List<Transaction> t) {
        return t.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }
/*
    //Task_29
    List<String> findTraderNamesFromCambridge(List<Transaction> t) {
        return t.stream()
                .filter(Trader::getCity.equals("Cambridge"))
    }

 */
}
