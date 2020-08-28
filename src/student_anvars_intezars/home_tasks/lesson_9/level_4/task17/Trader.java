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

    String getCity() {
        return city;
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

    int getAmount () {
        return amount;
    }
}

class FraudDetector {


    boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader) || (compareAmount(amount) || (compareCity(trader)))) {
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

    boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
        return false;
    }

    }

    boolean compareAmount(int amount) {
        int traderAmount = amount;
        if (traderAmount > 1000000) {
            return true;
        } else {
            return false;
        }
    }

}

