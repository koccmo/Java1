package student_alexey_tretyakov.lesson_8.homework.level_4;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    Rectangle rectangle = new Rectangle("rectangle",5, 4);

    @Test
    public void calculateArea() {
        Assert.assertEquals(20,rectangle.calculateArea(),0);
    }

    @Test
    public void calculatePerimeter() {
        Assert.assertEquals(18,rectangle.calculatePerimeter(),0);
    }
}