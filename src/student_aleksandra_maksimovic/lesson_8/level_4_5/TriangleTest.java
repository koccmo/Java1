package student_aleksandra_maksimovic.lesson_8.level_4_5;

import student_aleksandra_maksimovic.testing.Tester;
import student_aleksandra_maksimovic.utils.DoubleUtils;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateTriangleAreaTest();
        test.calculateTrianglePerimeterTest();
    }

    Tester tester = new Tester();

    public void calculateTriangleAreaTest() {
        Triangle triangle = new Triangle(4, 5, 8);
        double result = triangle.calculateArea();
        tester.check(DoubleUtils.equals(result, 8.181534), "Triangle area test #1");
    }

    public void calculateTrianglePerimeterTest() {
        Triangle triangle = new Triangle(4, 5, 8);
        double result = triangle.calculatePerimeter();
        tester.check(DoubleUtils.equals(result, 17), "Triangle perimeter test #1");
    }
}
