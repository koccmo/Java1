package student_dmitrijs_jasvins.lesson_15.day_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticEqTest {
    QuadraticEq calculator = new QuadraticEq();

    @Test
    public void calc_v1() {
        String actual = calculator.calc(1,4,3);
        assertEquals("x1 = -3.0, x2 = -1.0", actual);
    }

    @Test
    public void calc_v2() {
        String actual = calculator.calc(1,3,4);
        assertEquals("Equation has no roots", actual);
    }

    @Test
    public void calc_v3() {
        String actual = calculator.calc(16,-8,1);
        assertEquals("x = 0.25", actual);
    }
}
