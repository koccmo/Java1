package student_anvars_intezars.home_tasks.lesson_9.level_5;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city,String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    String getFullName() {
        return fullName;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }
}

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    int getAmount () {
        return amount;
    }
}

class FraudDetector {

    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }
}


    /*boolean isFraud(Trader trader, int amount) {
        boolean result = false;
        for (int i = 0; i < fraudRules.length; i++) {
            if (isFraud(trader, amount)) {
                return true;
            } else {
                return false;
            }
        }*/



