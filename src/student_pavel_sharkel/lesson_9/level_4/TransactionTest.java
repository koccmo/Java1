package student_pavel_sharkel.lesson_9.level_4;

public class TransactionTest {

    public static void main(String[] args) {

        TransactionTest transactionTest = new TransactionTest();
        transactionTest.isPokemonTest();
        transactionTest.notPokemonTest();
        transactionTest.valueTrueTest();
        transactionTest.valueFalseTest();
        transactionTest.cityTrueTest();
        transactionTest.cityFalseTest();

    }

    public void notPokemonTest() {
        Trader trader = new Trader("Albert", "Ludza");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Not Pokemon test is OK");
        } else {
            System.out.println("Not Pokemon test is FAILED");
        }
    }

    public void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Talsi");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Is Pokemon test is FAILED");
        } else {
            System.out.println("Is Pokemon test is OK");
        }
    }

    public void valueTrueTest() {
        Trader trader = new Trader("TestName", "Jekabpils");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isValueOk(trader)) {
            System.out.println("Value true test is OK");
        } else {
            System.out.println("Value true test is FAILED");
        }
    }

    public void valueFalseTest() {
        Trader trader = new Trader("TestName", "Jekabpils");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isValueOk(trader)) {
            System.out.println("Value false test is OK");
        } else {
            System.out.println("Value false test is FAILED");
        }
    }

    public void cityTrueTest() {
        Trader trader = new Trader("Janis", "Orge");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCityOk(trader)) {
            System.out.println("City true test is OK");
        } else {
            System.out.println("City true test is FAILED");
        }
    }

    public void cityFalseTest() {
        Trader trader = new Trader("Robert", "Sydney");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCityOk(trader)) {
            System.out.println("City false test is FAILED");
        } else {
            System.out.println("City false test is OK");
        }
    }
}
