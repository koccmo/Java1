package student_aleksandra_maksimovic.lesson_8.level_4_5;

import student_aleksandra_maksimovic.testing.Tester;
import student_aleksandra_maksimovic.utils.DoubleUtils;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateRectangleArea();
        test.calculateRectangleArea2();
        test.calculateRectanglePerimeter();

    }

    Tester tester = new Tester();

    public void calculateRectangleArea() {
        Rectangle rectangle = new Rectangle(12, 8);
        double result = rectangle.calculateArea();
        tester.check(DoubleUtils.equals(result, 96), "Rectangle area test #1");
    }

    public void calculateRectangleArea2() {
        Rectangle rectangle = new Rectangle(0, 8);
        double result = rectangle.calculateArea();
        tester.check(DoubleUtils.equals(result, 0), "Rectangle area test #2");
    }

    public void calculateRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(13.5, 0.8);
        double result = rectangle.calculatePerimeter();
        tester.check(DoubleUtils.equals(result, 28.6), "Rectangle perimeter test #1");
    }

}
