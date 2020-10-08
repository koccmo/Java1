package student_alexey_tretyakov.lesson_8.homework.level_4;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle = new Triangle("triangle",2);
    @Test
    public void calculateArea() {
        Assert.assertEquals(1.73205,triangle.calculateArea(),0.000001);
    }

    @Test
    public void calculatePerimeter() {
        Assert.assertEquals(6,triangle.calculatePerimeter(),0);
    }
}