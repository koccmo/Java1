package student_eduards_jasvins.lesson_9.day_4;

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
        FraudDetector fraudDetector = new FraudDetector();
        Trader pokemon = new Trader("Pokemon", "Washington");
        Transaction transaction = new Transaction(pokemon, 100);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("It's Pokemon!");
        } else {
            System.out.println("It's not a Pokemon");
        }
    }

    void isBigAmount() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader aaron = new Trader("Aaron", "Texas");
        Transaction transaction = new Transaction(aaron, 1000001);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("It's over 1000000");
        } else {
            System.out.println("Oh... It's fine.");
        }
    }

    void isSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader ivan = new Trader("Ivan", "Sydney");
        Transaction transaction = new Transaction(ivan, 500);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Decline!");
        } else {
            System.out.println("Accept");
        }
    }

    void isJamaica() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader harald = new Trader("Harald", "Jamaica");
        Transaction transaction = new Transaction(harald, 100);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Decline!");
        } else {
            System.out.println("Accept!");
        }
    }

    void isGermany() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader michael = new Trader("Michael", "Germany");
        Transaction transaction = new Transaction(michael, 1250);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Decline!");
        } else {
            System.out.println("Accept!");
        }
    }
}
