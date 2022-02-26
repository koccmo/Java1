package roman.lesson_8.homework.day_4;

public class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.trianglePerimeterTest();
        test.triangleAreaTest();

    }

    Triangle triangle = new Triangle("Triangle",10);

    public void trianglePerimeterTest() {
        checkResult(triangle.calculatePerimeter() == 30, "Triangle perimeter");
    }

    public void triangleAreaTest() {
        checkResult(triangle.calculateArea() == 43.3, "Triangle area");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test OK!");
        } else {
            System.out.println(nameOfTest + " test FAIL!");
        }
    }
}
