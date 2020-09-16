package student_valerija_ionova.lesson_13.level_5_middle.Task_26;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator  = new StringCalculator();

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

}