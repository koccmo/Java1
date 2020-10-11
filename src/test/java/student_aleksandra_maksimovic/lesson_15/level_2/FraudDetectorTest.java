package student_aleksandra_maksimovic.lesson_15.level_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector detector;

    @Before
    public void init() {
        detector = new FraudDetector();
    }

    @Test
    public void isPokemonTraderBlockedTest() {
        assertTrue(detector.isFraud(new Trader("Pokemon", "")));
    }

    @Test
    public void isTradersFromSidneyBlockedTest() {
        assertTrue(detector.isFraud(new Trader("Mario", "Sidney")));
        assertTrue(detector.isFraud(new Trader("Dzhigurda", "Sidney")));
        assertTrue(detector.isFraud(new Trader("Ilon Mask", "Sidney")));
    }

}