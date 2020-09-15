package student_roberts_kupcs.lesson_8.homework.level_4.Task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        if (rectangle.calculateArea() == 6) {
            System.out.println("Rectangle calculateAreaTest OK");
        } else {
            System.out.println("Rectangle calculateAreTest FAIL");
        }
    }

    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        if (rectangle.calculatePerimeter() == 10) {
            System.out.println("Rectangle calculatePerimeterTest OK");
        } else {
            System.out.println("Rectangle calculatePerimeterTest FAIL");
        }
    }
}
