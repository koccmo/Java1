package student_aleksandra_maksimovic.lesson_8.level_4_5;

import student_aleksandra_maksimovic.testing.Tester;
import student_aleksandra_maksimovic.utils.DoubleUtils;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.areaCircleTest();
        test.perimeterCircleTest();
    }


    Tester tester = new Tester();

    public void areaCircleTest() {
        Circle circle = new Circle(5);
        double result = circle.calculateArea();
        //tester.check(Math.abs(result - 78.5) < 1e-6, "Circle area test #1");
        tester.check(DoubleUtils.equals(result, 78.5),"Circle area test #1");
    }
    public void perimeterCircleTest() {
        Circle circle = new Circle(8);
        double result = circle.calculatePerimeter();
        tester.check(DoubleUtils.equals(result, 50.24), "Circle perimeter test #1");
    }
}
