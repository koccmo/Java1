package student_dmitrijs_jasvins.lesson_15.day_2;

import org.junit.Test;
import student_dmitrijs_jasvins.lesoon_15.day_2.FraudDetector;
import student_dmitrijs_jasvins.lesoon_15.day_2.Trader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudDetectorTest {
    FraudDetector detector = new FraudDetector();
    Trader trader = new Trader("Vadim", "Riga");
    Trader traderPokemon = new Trader("Pokemon", "Riga");
    Trader traderFromSidney = new Trader("Vadim", "Sidney");
    Trader traderPokemonFromSidney = new Trader("Pokemon", "Sidney");


    @Test
    public void isFraud_v1() {
        boolean actual = detector.isFraud(trader);
        assertFalse(actual);
    }

    @Test
    public void isFraud_v2() {
        boolean actual = detector.isFraud(traderPokemon);
        assertTrue(actual);
    }

    @Test
    public void isFraud_v3() {
        boolean actual = detector.isFraud(traderFromSidney);
        assertTrue(actual);
    }

    @Test
    public void isFraud_v4() {
        boolean actual = detector.isFraud(traderPokemonFromSidney);
        assertTrue(actual);
    }
}
