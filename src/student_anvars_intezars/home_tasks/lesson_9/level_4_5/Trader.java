package student_anvars_intezars.home_tasks.lesson_9.level_4_5;

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

    Trader getTraderFromTransaction() {
        return trader;
    }

    int getAmount () {
        return amount;
    }
}

class FraudDetector {


    boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader)
                ||
           (compareAmount(amount)
                ||
           (compareCity(trader)
                ||
           (compareCountry(trader)
                ||
           (compareCountryAndAmount(trader,amount)))))) {
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

    boolean compareCountry(Trader trader) {
        String countryName = trader.getCountry();
        if (countryName.equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareCountryAndAmount(Trader trader, int amount) {
        String countryName = trader.getCountry();
        if (countryName.equals("Germany") && (amount > 1000)) {
            return true;
        }
        return false;
    }
}

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Trader trader, int amount);

}

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean compareTraderName(Trader trader) {
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
        }
        return true;
    }
    }

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareAmount(amount)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean compareAmount(int amount) {
        int traderAmount = amount;
        if (traderAmount > 1000000) {
            return true;
        } else {
            return false;
        }
    }
}

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareCity(trader)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }
}


