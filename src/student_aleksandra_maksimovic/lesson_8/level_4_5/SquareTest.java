package student_aleksandra_maksimovic.lesson_8.level_4_5;

import student_aleksandra_maksimovic.testing.Tester;
import student_aleksandra_maksimovic.utils.DoubleUtils;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SquareTest {
    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.calculateSquareAreaTest();
        test.calculateSquareAreaTest2();
        test.calculateSquarePerimeterTest();
        test.calculateSquarePerimeterTest2();
    }

    Tester tester = new Tester();

    public void calculateSquareAreaTest() {
        Square square = new Square(9);
        double result = square.calculateArea();
        tester.check(DoubleUtils.equals(result,81 ),"Square area test #1");
    }

    public void calculateSquareAreaTest2() {
        Square square = new Square(17.8);
        double result = square.calculateArea();
        tester.check(DoubleUtils.equals(result, 316.84), "Square ggg area test #2");
    }

    public void calculateSquarePerimeterTest() {
        Square square = new Square(0);
        double result = square.calculatePerimeter();
        tester.check(DoubleUtils.equals(result, 0), "Square perimeter test #1");
    }

    public void calculateSquarePerimeterTest2() {
        Square square = new Square(3.8);
        double result = square.calculatePerimeter();
        tester.check(DoubleUtils.equals(result, 15.2), "Square perimeter test #2");
    }
}

