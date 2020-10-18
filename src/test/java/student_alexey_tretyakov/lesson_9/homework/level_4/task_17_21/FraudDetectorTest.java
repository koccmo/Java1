package student_alexey_tretyakov.lesson_9.homework.level_4.task_17_21;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraudGoodTransaction() {
        Trader trader = new Trader("Boy", "Riga", "USSR");
        Trader.Transaction transaction = new Trader.Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse( fraudDetector.isFraud(transaction) );
    }

    @Test
    public void fraudTraderNameTrue() {
        Trader trader = new Trader("Toy", "Riga", "USSR");
        Trader.Transaction transaction = new Trader.Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue( fraudDetector.isFraud(transaction) );
    }


    @Test
    public void fraudAmountTrue() {
        Trader trader = new Trader("Boy", "Riga", "USSR");
        Trader.Transaction transaction = new Trader.Transaction(trader, 5000000);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue( fraudDetector.isFraud(transaction) );
    }

    @Test
    public void fraudCityTrue() {
        Trader trader = new Trader("Toy", "Сидней", "USSR");
        Trader.Transaction transaction = new Trader.Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue( fraudDetector.isFraud(transaction) );
    }

    @Test
    public void fraudCountry() {
        Trader trader = new Trader("Toy", "Riga", "Ямайка");
        Trader.Transaction transaction = new Trader.Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue( fraudDetector.isFraud(transaction) );
    }

    @Test
    public void fraudCountryAndAmountFalse() {
        Trader trader = new Trader("Boy", "Riga", "Германия");
        Trader.Transaction transaction = new Trader.Transaction(trader, 999);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse( fraudDetector.isFraud(transaction) );
    }
    @Test
    public void fraudCountryAndAmountTrue() {
        Trader trader = new Trader("Boy", "Riga", "Германия");
        Trader.Transaction transaction = new Trader.Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue( fraudDetector.isFraud(transaction) );
    }
}