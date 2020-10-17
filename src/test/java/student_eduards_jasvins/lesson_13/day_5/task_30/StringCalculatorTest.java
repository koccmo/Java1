package student_eduards_jasvins.lesson_13.day_5.task_30;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add() {
        int result = stringCalculator.add("1\n23,4");
        assertEquals(28, result);

    }
}