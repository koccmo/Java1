package student_dmitrijs_jasvins.lesson_9.day_4;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isPokemon();
        fraudDetectorTest.amountIsToBig();
        fraudDetectorTest.forbiddenCitySidney();
        fraudDetectorTest.forbiddenCityJamaica();
        fraudDetectorTest.forbiddenCityGermany();
    }

    public void isPokemon() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Is pokemon test = OK");
        } else {
            System.out.println("Is pokemon test = FAIL");
        }
    }

    public void amountIsToBig() {
        Trader trader = new Trader("Dmitry", "Riga");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Amount limit test = OK");
        } else {
            System.out.println("Amount limit test = FAIL");
        }
    }

    public void forbiddenCitySidney() {
        Trader trader = new Trader("Dmitry", "Sidney");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Forbidden city 'Sidney' = OK");
        } else {
            System.out.println("Forbidden city 'Sidney' = FAIL");
        }
    }

    public void forbiddenCityJamaica() {
        Trader trader = new Trader("Dmitry", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Forbidden city 'Jamaica' = OK");
        } else {
            System.out.println("Forbidden city 'Jamaica' = FAIL");
        }
    }

    public void forbiddenCityGermany() {
        Trader trader = new Trader("Dmitry", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("City 'Germany', amount more than 1000 test = OK");
        } else {
            System.out.println("City 'Germany', amount more than 1000 test = FAIL");
        }
    }
}