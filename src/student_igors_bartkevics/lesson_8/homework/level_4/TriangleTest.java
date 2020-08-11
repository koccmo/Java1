package student_igors_bartkevics.lesson_8.homework.level_4;

class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 10.0, 10.0, 10.0);

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(triangle.calculateArea() == 43.3, "Calculate area");
    }

    void calculatePerimeterTest() {
        checkResult(triangle.calculatePerimeter() == 30.0, "Calculate perimeter");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}


