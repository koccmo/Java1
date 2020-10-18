package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector(new FraudRule1("FraudRule1"),
            new FraudRule2("FraudRule2"), new FraudRule3("FraudRule3"),
            new FraudRule4("FraudRule4"),new FraudRule5("FraudRule5"));

    @Test
    public void testFraudRule1True(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule1");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRulesFalse(){
        Trader trader = new Trader("Pokemonik", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule2True(){
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule2");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule3True(){
        Trader trader = new Trader("John", "Sydney", "Latvia");
        Transaction transaction = new Transaction(trader, 100001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule3");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule4True(){
        Trader trader = new Trader("John", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 100001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule4");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule5True(){
        Trader trader = new Trader("John", "Riga", "German");
        Transaction transaction = new Transaction(trader, 100001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule5");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule5FalseCountry(){
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule5FalseAmount(){
        Trader trader = new Trader("John", "Riga", "German");
        Transaction transaction = new Transaction(trader, 101);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule1Rule2(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule1");
        expectedFraudDetectionResult.addRuleName("FraudRule2");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule3Rule4(){
        Trader trader = new Trader("Pokemonik", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 101);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule3");
        expectedFraudDetectionResult.addRuleName("FraudRule4");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule1Rule5(){
        Trader trader = new Trader("Pokemon", "Riga", "German");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule1");
        expectedFraudDetectionResult.addRuleName("FraudRule5");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    public void testFraudRule1Rule2Rule3Rule4(){
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1099999901);
        FraudDetectionResult expectedFraudDetectionResult = new FraudDetectionResult();
        expectedFraudDetectionResult.setTransactionFraud(true);
        expectedFraudDetectionResult.addRuleName("FraudRule1");
        expectedFraudDetectionResult.addRuleName("FraudRule2");
        expectedFraudDetectionResult.addRuleName("FraudRule3");
        expectedFraudDetectionResult.addRuleName("FraudRule4");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }


}