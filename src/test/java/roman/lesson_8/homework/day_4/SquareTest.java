package roman.lesson_8.homework.day_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {
    Square square = new Square("Square", 2);

    @Test
    public void squareAreaTest() {
        assertEquals(4, square.calculateArea(), 0.0);
    }

    @Test
    public void squarePerimeterTest() {
        assertEquals(8, square.calculatePerimeter(), 0.0);
    }
}