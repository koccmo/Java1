package student_valerija_ionova.lesson_13.level_5_middle.task_31_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorUniversalTest {

    StringCalculatorUniversal calculator = new StringCalculatorUniversal();

    @Test
    public void sumOfEmptyString(){
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void sumOf1Number(){
        int result = calculator.add("2");
        assertEquals(2, result);
    }

    @Test
    public void sumOf2Number(){
        int result = calculator.add("2,65");
        assertEquals(67, result);
    }

    @Test
    public void testSumSplitNewLineAndComa(){
        int result = calculator.add("1\n23,4");
        assertEquals(28, result);
    }

    @Test
    public void testSumSplitDifferentSeparators(){
        int result = calculator.add("//[;][&]\\n1;2&3");
        assertEquals(6, result);
    }

    @Test
    public void testSumSplitSeparatorsGiven(){
        int result = calculator.add("//[;]\\n1;2");
        assertEquals(3, result);
    }

}