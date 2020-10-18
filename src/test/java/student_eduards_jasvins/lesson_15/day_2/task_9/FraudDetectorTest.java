package student_eduards_jasvins.lesson_15.day_2.task_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector detector = new FraudDetector();

    @Test
    public void isPokemon() {
        Trader trader = new Trader("Pokemon", "Moscow");
        assertTrue(detector.isFraud(trader));
    }

    @Test
    public void isNotPokemon() {
        Trader trader = new Trader("Anton", "Moscow");
        assertTrue(!detector.isFraud(trader));
    }

    @Test
    public void isCityFraud() {
        Trader trader = new Trader("Anton", "Sidney");
        assertTrue(detector.isCityFraud(trader));
    }

    @Test
    public void isNotCityFraud() {
        Trader trader = new Trader("Michael", "Riga");
        assertTrue(!detector.isCityFraud(trader));
    }

    @Test
    public void isCityFraudAndName() {
        Trader trader = new Trader("Pokemon", "Sidney");
        assertTrue(detector.isCityFraud(trader));
    }
}