package student_eduards_jasvins.lesson_13.day_5_task_26_29;

import org.junit.Test;
import student_eduards_jasvins.lesson_13.day_5.task_26_29.StringCalculator;


import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void addZero() {
        int result = calculator.add("0");
        assertEquals(0, result);
    }

    @Test
    public void addTwo() {
        int result = calculator.add("2");
        assertEquals(2, result);
    }

    @Test
    public void SumTwo() {
        int result = calculator.add("7,41");
        assertEquals(48, result);
    }

}