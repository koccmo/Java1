package student_igors_bartkevics.lesson_8.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SquareTest {

    Square square = new Square("Square", 5.0);

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(square.calculateArea() == 25.0, "Calculate area");
    }

    void calculatePerimeterTest() {
        checkResult(square.calculatePerimeter() == 20.0, "Calculate perimeter");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
