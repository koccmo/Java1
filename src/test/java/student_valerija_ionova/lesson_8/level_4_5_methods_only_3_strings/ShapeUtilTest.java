package student_valerija_ionova.lesson_8.level_4_5_methods_only_3_strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void testAreaForCircle (){
        Circle circle = new Circle("Circle", 2);
        assertTrue(12.56 == shapeUtil.calculateArea(circle));
    }

    @Test
    public void testAreaForSquare (){
        Square square = new Square("Square", 3);
        assertTrue(9.00 == shapeUtil.calculateArea(square));
    }

    @Test
    public void testAreaForRectangle (){
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        assertTrue(12.00 == shapeUtil.calculateArea(rectangle));
    }

    @Test
    public void testAreaForTriangle (){
        Triangle triangle = new Triangle("Triangle", 1, 4, 5);
        assertTrue(51.96152422706632 == shapeUtil.calculateArea(triangle));
    }

    @Test
    public void testPerimeterForCircle (){
        Circle circle = new Circle("Circle", 4);
        assertTrue(25.12 == shapeUtil.calculatePerimeter(circle));
    }

    @Test
    public void testPerimeterForSquare (){
        Square square = new Square("Square", 3);
        assertTrue(12.00 == shapeUtil.calculatePerimeter(square));
    }

    @Test
    public void testPerimeterForRectangle (){
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        assertTrue(14.00 - shapeUtil.calculatePerimeter(rectangle) == 0);
    }

    @Test
    public void testPerimeterForTriangle (){
        Triangle triangle = new Triangle("Triangle", 1, 4, 5);
        assertTrue(10.0 - shapeUtil.calculatePerimeter(triangle) == 0);
    }

}