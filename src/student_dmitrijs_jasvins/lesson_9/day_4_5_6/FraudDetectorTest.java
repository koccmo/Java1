package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.fraudRule1();
        fraudDetectorTest.fraudRule2();
        fraudDetectorTest.fraudRule3();
        fraudDetectorTest.fraudRule4();
        fraudDetectorTest.fraudRule5();
    }

    public void fraudRule1() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule1("isPokemon"),
                new FraudRule2("amountLimit"),
                new FraudRule3("forbiddenCitySidney"),
                new FraudRule4("forbiddenCityJamaica"),
                new FraudRule5("forbiddenCityGermanAndToBigAmount"));
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("isPokemon")) {
            System.out.println("Is pokemon test = OK");
        } else {
            System.out.println("Is pokemon test = FAIL");
        }
    }

    public void fraudRule2() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule1("isPokemon"),
                new FraudRule2("amountLimit"),
                new FraudRule3("forbiddenCitySidney"),
                new FraudRule4("forbiddenCityJamaica"),
                new FraudRule5("forbiddenCityGermanAndToBigAmount"));
        Trader trader = new Trader("Dmitry", "Riga");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("amountLimit")) {
            System.out.println("Amount limit test = OK");
        } else {
            System.out.println("Amount limit test = FAIL");
        }
    }

    public void fraudRule3() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule1("isPokemon"),
                new FraudRule2("amountLimit"),
                new FraudRule3("forbiddenCitySidney"),
                new FraudRule4("forbiddenCityJamaica"),
                new FraudRule5("forbiddenCityGermanAndToBigAmount"));

        Trader trader = new Trader("Dmitry", "Sidney");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("forbiddenCitySidney")) {
            System.out.println("Forbidden city 'Sidney' = OK");
        } else {
            System.out.println("Forbidden city 'Sidney' = FAIL");
        }
    }
    public void fraudRule4() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule1("isPokemon"),
                new FraudRule2("amountLimit"),
                new FraudRule3("forbiddenCitySidney"),
                new FraudRule4("forbiddenCityJamaica"),
                new FraudRule5("forbiddenCityGermanAndToBigAmount"));

        Trader trader = new Trader("Dmitry", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("forbiddenCityJamaica")) {
            System.out.println("Forbidden city 'Jamaica' = OK");
        } else {
            System.out.println("Forbidden city 'Jamaica' = FAIL");
        }
    }
    public void fraudRule5() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule1("isPokemon"),
                new FraudRule2("amountLimit"),
                new FraudRule3("forbiddenCitySidney"),
                new FraudRule4("forbiddenCityJamaica"),
                new FraudRule5("forbiddenCityGermanAndToBigAmount"));

        Trader trader = new Trader("Dmitry", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud() && fraudDetectionResult.getRuleName().equals("forbiddenCityGermanAndToBigAmount")) {
            System.out.println("City 'Germany', amount more than 1000 test = OK");
        } else {
            System.out.println("City 'Germany', amount more than 1000 test = FAIL");
        }
    }
}