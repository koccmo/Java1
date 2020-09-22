package student_valerija_ionova.lesson_15.level_2_intern.task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    public void testDiscriminantNull(){
        assertEquals("x = -2.0", quadraticEq.calc(1, 4, 4));
    }

    @Test
    public void testDiscriminantNegative(){
        assertEquals("Equation has no roots", quadraticEq.calc(5, 1, 6));
    }

    @Test
    public void testDiscriminantPositive(){
        assertEquals("x1 = -5.0, x2 = 1.0", quadraticEq.calc(1, 4, -5));
    }
}