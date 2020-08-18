package student_eduards_jasvins.lesson_9.day_5;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isPokemon();
        fraudDetectorTest.isBigAmount();
        fraudDetectorTest.isJamaica();
        fraudDetectorTest.isSydney();
        fraudDetectorTest.isGermany();

    }

   void isPokemon() {
        FraudDetector fraudDetector = new FraudDetector (
                new FraudRule1("IsPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"), new FraudRule5("Germany"));

        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        if (fraudDetector.isFraud(transaction)) {
           System.out.println("Test = OK");
        } else {
           System.out.println("Test = FAIL.");
        }

   }

    void isBigAmount() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("IsPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"), new FraudRule5("Germany"));

        Trader trader = new Trader("Aaron", "Texas");
        Transaction transaction = new Transaction(trader, 1000001);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    void isSydney() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("IsPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"), new FraudRule5("Germany"));

        Trader trader = new Trader("Ivan", "Sydney");
        Transaction transaction = new Transaction(trader, 500);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void isJamaica() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("IsPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"), new FraudRule5("Germany"));

        Trader trader = new Trader("Harald", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void isGermany() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("IsPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"), new FraudRule5("Germany"));

        Trader trader = new Trader("Michael", "Germany");
        Transaction transaction = new Transaction(trader, 1250);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL.");
        }
    }
}
