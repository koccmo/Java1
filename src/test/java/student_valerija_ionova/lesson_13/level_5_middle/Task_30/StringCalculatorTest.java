package student_valerija_ionova.lesson_13.level_5_middle.Task_30;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void testSumSplitNewLineAndComa(){
        int result = calculator.add("1\n23,4");
        assertEquals(28, result);
    }

}