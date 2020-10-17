package student_jaroslav_brutan.lesson_13.day_5.task_30;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void sumOfNumbersWithN(){
        int result = stringCalculator.add("2\n4,5");
        assertEquals(11,result);
    }

}