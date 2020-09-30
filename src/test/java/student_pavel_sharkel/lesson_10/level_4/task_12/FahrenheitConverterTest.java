package student_pavel_sharkel.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void fahrenheitTrueTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(23);
        assertEquals(result,73.4, 0.0);
    }

}