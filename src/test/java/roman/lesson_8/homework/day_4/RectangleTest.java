package roman.lesson_8.homework.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 3, 2);

    @Test
    public void rectangleAreaTest() {
        assertEquals(6, rectangle.calculateArea(), 0.0);
    }

    @Test
    public void rectanglePerimeterTest() {
        assertEquals(12, rectangle.calculatePerimeter(), 0.0);
    }

}