package student_valerija_ionova.lesson_13.level_5_middle.task_31_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorUniversalTest {

    StringCalculatorUniversal calculator = new StringCalculatorUniversal();

    @Test
    public void sumOfEmptyString(){
        int result = calculator.addNumber("");
        assertEquals(0, result);
    }

    @Test
    public void sumOf1Number(){
        int result = calculator.addNumber("2");
        assertEquals(2, result);
    }

    @Test
    public void sumOf2Number(){
        int result = calculator.addNumber("2,65");
        assertEquals(67, result);
    }

    @Test
    public void testSumSplitNewLineAndComa(){
        int result = calculator.addNumber("1\n23,4");
        assertEquals(28, result);
    }

    @Test
    public void testSumSplitDifferentSeparators(){
        int result = calculator.addNumber("//[;][&]\\n1;2&3");
        assertEquals(6, result);
    }

    @Test
    public void testSumSplitSeparatorsGiven(){
        int result = calculator.addNumber("//[;]\\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void sumDigitsOfEmptyString(){
        int result = calculator.addDigit("");
        assertEquals(0, result);
    }

    @Test
    public void sumDigitsOf1Number(){
        int result = calculator.addDigit("2");
        assertEquals(2, result);
    }

    @Test
    public void sumDigitsOf2Number(){
        int result = calculator.addDigit("2,65");
        assertEquals(13, result);
    }

    @Test
    public void testSumDigitsSplitNewLineAndComa(){
        int result = calculator.addDigit("1\n23,4");
        assertEquals(10, result);
    }

    @Test
    public void testSumDigitsSplitDifferentSeparators(){
        int result = calculator.addDigit("//[;][&]\\n1;2&3");
        assertEquals(6, result);
    }

    @Test
    public void testSumDigitsSplitSeparatorsGiven(){
        int result = calculator.addDigit("//[;]\\n1;2");
        assertEquals(3, result);
    }

}