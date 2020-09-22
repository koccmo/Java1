package student_valerija_ionova.lesson_15.level_2_intern.task_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void testNamePokemon(){
        Trader trader = new Trader("Pokemon", "Riga");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    public void testNameNotPokemon(){
        Trader trader = new Trader("Pokemon4ik", "Riga");
        assertTrue(!fraudDetector.isFraud(trader));
    }

    @Test
    public void testCityFraudTrue(){
        Trader trader = new Trader ("Bob", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    public void testCityFraudFalse(){
        Trader trader = new Trader ("Bob", "Riga");
        assertTrue(!fraudDetector.isFraud(trader));
    }

    @Test
    public void testCityFraudAndNameFraud(){
        Trader trader = new Trader ("Pokemon", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }

}