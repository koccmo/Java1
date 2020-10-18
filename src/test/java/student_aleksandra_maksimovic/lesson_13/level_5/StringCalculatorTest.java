package student_aleksandra_maksimovic.lesson_13.level_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void init() {
        calculator = new StringCalculator();
    }

    @Test
    public void test_0() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    public void test_1() {
        assertEquals(calculator.add("1"), 1);
    }

    @Test
    public void test_2() {
        assertEquals(calculator.add("1,2"), 3);
    }

    @Test
    public void test_3() {
        assertEquals(calculator.add("12,24"), 36);
    }

    @Test
    public void test_4() {
        assertEquals(calculator.add("12,24,1"), 37);
    }

    @Test
    public void test_5() {
        assertEquals(calculator.add("12,24,1,2"), 39);
    }

    @Test
    public void test_6() {
        assertEquals(calculator.add("1,2,3,4,5,6,7,8,9,0"), 45);
    }

    @Test
    public void test_7() {
        assertEquals(calculator.add("12\n24,1\n2"), 39);
    }

    @Test
    public void test_8() {
        assertEquals(calculator.add("//[;]\n12\n24,1\n2;10"), 49);
    }

    @Test
    public void test_9() {
        assertEquals(calculator.add("//[&][;]\n12\n24,1\n2;10&20"), 69);
    }

}