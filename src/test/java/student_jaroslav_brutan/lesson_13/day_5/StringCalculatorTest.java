package student_jaroslav_brutan.lesson_13.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void emptyStringSum(){
        int result = stringCalculator.add("");
        assertEquals(0,result);
    }

    @Test
    public void sumOfOneNumber(){
        int result = stringCalculator.add("1");
        assertEquals(1,result);
    }

    @Test
    public void sumOfTwoNumbersWithComma(){
        int result = stringCalculator.add("2,7");
        assertEquals(9,result);
    }

    @Test
    public void unlimitedSumOfNumbersWithComma(){
        int result = stringCalculator.add("1,3,5,7");
        assertEquals(16,result);
    }
}