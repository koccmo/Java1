package student_roberts_kupcs.lesson_15.homework.level_2.Task_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {
    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    public void discriminantGreaterThanZero() {
        assertEquals(-3.0, -1.0, quadraticEq.calc(1, 4, 3));
    }

    @Test
    public void discriminantEqualsZero() {
        assertEquals(-2.0, -2.0, quadraticEq.calc(1, 4, 4));
    }

    @Test
    public void discriminantLessThanZero() {
        assertEquals(-8.0, -8.0, quadraticEq.calc(1, 2, 3));
    }

}