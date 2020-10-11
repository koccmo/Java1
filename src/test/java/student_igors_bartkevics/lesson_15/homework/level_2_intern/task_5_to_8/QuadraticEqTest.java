package student_igors_bartkevics.lesson_15.homework.level_2_intern.task_5_to_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq equation = new QuadraticEq();

    @Test
    public void discriminantGreaterThanZeroTest() {
        String result = equation.calc(1, -70, 600);
        String expectedResult = "x1 = 10.0, x2 = 60.0";
        assertEquals(expectedResult, result);
    }

    @Test
    public void discriminantEqualsZeroTest() {
        String result = equation.calc(1, -6, 9);
        String expectedResult = "x = 3.0";
        assertEquals(expectedResult, result);
    }

    @Test
    public void discriminantLessThanZeroTest() {
        String result = equation.calc(1, 6, 14);
        String expectedResult = "Equation has no roots";
        assertEquals(expectedResult, result);
    }



}