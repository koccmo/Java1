package student_dmitrijs_jasvins.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleArea();
        rectangleTest.rectanglePerimeter();
    }

    public void rectangleArea() {
        Rectangle rectangle = new Rectangle("Area", 5, 6);
        if (rectangle.calculateArea() == 30) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Perimeter", 5, 6);
        if (rectangle.calculatePerimeter() == 22) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
