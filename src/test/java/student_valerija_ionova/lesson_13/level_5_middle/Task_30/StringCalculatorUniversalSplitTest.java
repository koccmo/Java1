package student_valerija_ionova.lesson_13.level_5_middle.Task_30;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorUniversalSplitTest {

    StringCalculatorUniversalSplit calculator = new StringCalculatorUniversalSplit();

    @Test
    public void testSumSplitNotOnlyComma(){
        int result = calculator.add("22,34\n2");
        assertEquals(58, result);
    }

    @Test
    public void testSumSplitNotOnlyComma2(){
        int result = calculator.add("22,34\n2\n10");
        assertEquals(68, result);
    }

}