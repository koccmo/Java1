package student_dmitrijs_jasvins.lesson_14.day_5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public boolean isAnyTraderFromMilanV1 (List<Transaction> transactions){
        Set<String> tradersFromMilan = transactions.stream()
                .map(Transaction::getTrader)
                .filter(tr -> tr.getCity().equals("Milan"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
        return tradersFromMilan.size() > 0;
    }

    public boolean isAnyTraderFromMilanV2(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean isAnyTraderFromInterestedCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }
}
