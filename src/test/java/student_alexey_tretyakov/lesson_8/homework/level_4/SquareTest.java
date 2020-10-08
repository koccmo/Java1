package student_alexey_tretyakov.lesson_8.homework.level_4;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    Square square = new Square("square",5);

    @Test
    public void calculateArea() {
        Assert.assertEquals(25, square.calculateArea(),0);
    }

    @Test
    public void calculatePerimeter() {
        Assert.assertEquals(20,square.calculatePerimeter(),0);
    }
}