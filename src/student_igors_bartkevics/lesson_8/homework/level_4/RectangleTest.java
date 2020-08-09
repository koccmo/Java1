package student_igors_bartkevics.lesson_8.homework.level_4;

class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 2.0, 5.0);

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(rectangle.calculateArea() == 10, "Calculate area");
    }

    void calculatePerimeterTest() {
        checkResult(rectangle.calculatePerimeter() == 14.0, "Calculate perimeter");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}

