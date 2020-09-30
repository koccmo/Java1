package student_pavel_sharkel.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void kelvinTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double result = kelvinConverter.convert(12);
        assertEquals(result, 285.15, 0.0);
    }

}