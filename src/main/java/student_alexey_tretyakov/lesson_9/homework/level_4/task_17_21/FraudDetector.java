package student_alexey_tretyakov.lesson_9.homework.level_4.task_17_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FraudDetector {

        boolean isFraud(Trader.Transaction t) {
            boolean rule1 = false;
            if (fraudTraderName(t)) { rule1 = true;}
            boolean rule2 = false;
            if (fraudAmount(t, 1000000)) { rule2 = true; }
            boolean rule3 = false;
            if (fraudCity(t)) { rule3 = true; }
            boolean rule4 = false;
            if (fraudCountry(t)) { rule4 = true; }
            boolean rule5 = false;
            if (fraudCountryAndAmount(t, 1000)) { rule5 = true; }
            return (rule1 | rule2 | rule3 | rule4 | rule5);

        }

        boolean fraudTraderName(Trader.Transaction t) {
            List<String> fraudList = new ArrayList<>(Arrays.asList("Pokemon", "Toy"));
            return fraudList.contains(t.trader.fullName);
        }

        boolean fraudAmount(Trader.Transaction t, int fraudBorder) {
            return t.amount >= fraudBorder;
        }

        boolean fraudCity(Trader.Transaction t) {
            List<String> fraudList = new ArrayList<>(Arrays.asList("Сидней", "Oslo"));
            return fraudList.contains(t.trader.city);
        }

        boolean fraudCountry(Trader.Transaction t) {
            List<String> fraudList = new ArrayList<>(Arrays.asList("Ямайка", "USA"));
            return fraudList.contains(t.trader.country);
        }

        boolean fraudCountryAndAmount(Trader.Transaction t, int fraudBorder) {
            List<String> fraudList = new ArrayList<>(Arrays.asList("Германия","Украина","USA"));
            if (fraudList.contains(t.trader.country)) {
                return fraudAmount(t, fraudBorder);
            } else {
                return false;
            }
        }



}
