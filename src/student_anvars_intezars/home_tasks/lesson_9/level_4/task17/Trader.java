package student_anvars_intezars.home_tasks.lesson_9.level_4.task17;

class Trader {

    private String fullName;
    private String city;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    String getFullName() {
        return fullName;
    }
}

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTraderFromTransaction() {
        return trader;
    }
}

class FraudDetector {


    boolean isFraud(Trader trader) {
        if (compareTraderName(trader)) {
            return true;
        } else {
            return false;
        }
    }


    boolean compareTraderName (Trader trader) {
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
        }
        return true;
    }

}

