package student_anvars_intezars.home_tasks.lesson_9.level_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
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

@CodeReview(approved = true)
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

@CodeReview(approved = false)
//покемон метод исправлен
class FraudDetector {

    boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader)
                ||
           (compareAmount(amount)
                ||
           (compareCity(trader))
                ||
           (compareCountry(trader)
                ||
           (compareCountryAndAmount(trader,amount))))) {
            return true;
        } else {
            return false;
        }
    }

   boolean compareTraderName (Trader trader) {
       String traderName = trader.getFullName();
       if (traderName.equals("Pokemon")) {
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