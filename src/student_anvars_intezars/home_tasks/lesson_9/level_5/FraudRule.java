package student_anvars_intezars.home_tasks.lesson_9.level_5;

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

    boolean compareTraderName(Trader trader) {
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

    boolean compareAmount(int amount) {
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

    boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }
}

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareCountry(trader)) {
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
}

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareCountryAndAmount(trader, amount)) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareCountryAndAmount(Trader trader, int amount) {
        String countryName = trader.getCountry();
        if (countryName.equals("Germany") && (amount > 1000)) {
            return true;
        } else {
            return false;
        }
    }
}


