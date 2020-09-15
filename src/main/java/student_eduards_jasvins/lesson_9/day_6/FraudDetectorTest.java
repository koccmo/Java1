package student_eduards_jasvins.lesson_9.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
                new FraudRule1("isPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"),
                new FraudRule5("isGermany"));

        Trader trader = new  Trader("Pokemon", "Rio");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("isPokemon")) {
           System.out.println("Test = OK");
        } else {
           System.out.println("Test = FAIL.");
        }

   }

    void isBigAmount() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("isPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"),
                new FraudRule5("isGermany"));

        Trader trader = new  Trader("Maron", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("IsBigAmount")) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void isSydney() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("isPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"),
                new FraudRule5("isGermany"));

        Trader trader = new  Trader("Joel", "Sydney");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("isSydney")) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void isJamaica() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("isPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"),
                new FraudRule5("isGermany"));

        Trader trader = new  Trader("Carl", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("isJamaica")) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }

    void isGermany() {
        FraudDetector fraudDetector = new FraudDetector(
                new FraudRule1("isPokemon"),
                new FraudRule2("isBigAmount"),
                new FraudRule3("isJamaica"),
                new FraudRule4("isSydney"),
                new FraudRule5("isGermany"));

        Trader trader = new  Trader("Herman", "Germany");
        Transaction transaction = new Transaction(trader, 1251);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("isGermany")) {
            System.out.println("Test = OK.");
        } else {
            System.out.println("Test = FAIL.");
        }
    }
}
