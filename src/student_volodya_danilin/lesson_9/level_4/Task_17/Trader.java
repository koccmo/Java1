package student_volodya_danilin.lesson_9.level_4.Task_17;

class Trader {

    private String fullName;
    private String city;
    private String country;
    private int moneyAmount;

    Trader(String fullName) {
        this.fullName = fullName;
        this.city = "Default city";
        this.country = "Default country";
    }

    Trader(String fullName, String city) {
        this(fullName);
        this.city = city;
    }

    Trader(String fullName, String city, String country) {
        this(fullName, city);
        this.country = country;
    }

    void deposit(Transaction t, FraudDetector fd) {
        if (!fd.isFraud(t)) {
            this.moneyAmount += t.getAmount();
        }
    }

    String getFullName() {
        return this.fullName;
    }

    String getCity() {
        return this.city;
    }

    String getCountry() {
        return this.country;
    }
}