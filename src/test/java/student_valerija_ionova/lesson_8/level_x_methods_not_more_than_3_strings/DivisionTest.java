package student_valerija_ionova.lesson_8.level_x_methods_not_more_than_3_strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    Argument a1 = new Argument(10);
    Argument a2 = new Argument(20);
    Argument a3 = new Argument(30);
    Argument a4 = new Argument(40);
    Argument a5 = new Argument(3);
    Argument a6 = new Argument(0);

    @Test
    public void testAdditionArguments (){
        Addition addition = new Addition(a1, a2);
        assertTrue(30 == addition.calculate());
    }

    @Test
    public void testAdditionMathOperations (){
        MathOperation m1 = new Addition(a1, a2);
        MathOperation m2 = new Addition(a3, a4);
        Addition addition = new Addition(m1, m2);
        assertTrue(100 == addition.calculate());
    }

    @Test
    public void testSubtractionArguments (){
        Subtraction s = new Subtraction(a1, a2);
        assertTrue(-10 == s.calculate());
    }

    @Test
    public void testSubtractionMathOperations (){
        MathOperation m1 = new Addition(a1, a2);
        MathOperation m2 = new Addition(a3, a4);
        Subtraction s = new Subtraction(m1, m2);
        assertTrue(- 40 == s.calculate());
    }

    @Test
    public void testMultiplicationArguments (){
        Multiplication multiplication = new Multiplication(a1, a2);
        assertTrue(200 == multiplication.calculate());
    }

    @Test
    public void testMultiplicationMathOperations (){
        MathOperation m1 = new Addition(a1, a2);
        MathOperation m2 = new Addition(a3, a4);
        Multiplication multiplication = new Multiplication(m1, m2);
        assertTrue(2100 == multiplication.calculate());
    }

    @Test
    public void testDivisionArguments (){
        Division division = new Division(a1, a2);
        assertTrue(0.5 == division.calculate());
    }


    @Test
    public void testDivisionMathOperations (){
        MathOperation m1 = new Addition(a1, a2);
        Division division = new Division(m1, a5);
        assertTrue(10 == division.calculate());
    }

}