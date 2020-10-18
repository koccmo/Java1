package student_eduards_jasvins.lesson_15.day_2;

import org.junit.Test;
import student_eduards_jasvins.lesson_15.day_2.task_5_8.QuadraticEq;


import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq eq = new QuadraticEq();

    @Test
    public void discriminantGreaterThanZero() {
        String result = eq.calc(1, -90, 700);
        String expectedResult = "x1 = 36.93774225170145, x2 = 53.06225774829855";
        assertEquals(expectedResult, result);
    }

    @Test
    public void discriminantEqualsZero() {
        String result = eq.calc(1, -6, 9);
        String expectedResult = "x = 3.0";
        assertEquals(expectedResult, result);
    }

    @Test
    public void discriminantLessThanZero() {
        String result = eq.calc(1, 6, 14);
        String expectedResult = "Equation has no roots";
        assertEquals(expectedResult, result);
    }
}