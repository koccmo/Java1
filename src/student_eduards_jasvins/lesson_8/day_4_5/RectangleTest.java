package student_eduards_jasvins.lesson_8.day_4_5;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.reactanglePerimeter();
        rectangleTest.rectangleArea();
    }

    private void rectangleArea() {
        Shape rectangle = new Rectangle("Rectangle", 2, 4);
        if (rectangle.calculateArea() == 8) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void reactanglePerimeter() {
        Shape rectangle = new Rectangle("Rectangle", 3, 7);
        if (rectangle.calculatePerimeter() == 20) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
