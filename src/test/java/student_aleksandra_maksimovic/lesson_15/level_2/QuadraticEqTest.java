package student_aleksandra_maksimovic.lesson_15.level_2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq quadraticEq;

    @Before
    public void init() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    public void test_descMoreThenZero_1() {
        List<Double> result = quadraticEq.calc(1, 2, -3);

        assertEquals(result.size(), 2);
        assertTrue(result.contains(1.0));
        assertTrue(result.contains(-3.0));
    }

    @Test
    public void test_descEqualsZero_1() {
        List<Double> result = quadraticEq.calc(1, 6, 9);

        assertEquals(result.size(), 1);
        assertTrue(result.contains(-3.0));
    }

    @Test
    public void test_descLessThenZero_1() {
        List<Double> result = quadraticEq.calc(1, 2, 17);

        assertEquals(result.size(), 0);
    }

}