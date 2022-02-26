package roman.lesson_8.homework.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 10);

    @Test
    public void triangleAreaTest() {
        assertEquals(43.3, triangle.calculateArea(), 0.0);
    }

    @Test
    public void trianglePerimeterTest() {
        assertEquals(30, triangle.calculatePerimeter(), 0.0);
    }

}