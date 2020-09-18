package student_igors_bartkevics.lesson_13.homework.level_5_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroInComplianceWithRule1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add(""), 0);
    }

    @Test
    public void shouldReturnFiveInComplianceWithRule2() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("5"), 5);
    }

    @Test
    public void shouldReturnElevenInComplianceWithRule3() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("2,9"), 11);
    }

    @Test
    public void shouldReturnTwentyThreeInComplianceWithRule4() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("2,9,34,5"), 23);
    }

}