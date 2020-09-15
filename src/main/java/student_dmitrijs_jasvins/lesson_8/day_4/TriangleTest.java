package student_dmitrijs_jasvins.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleArea();
        triangleTest.trianglePerimeter();
    }

    public void triangleArea() {
        Triangle triangle = new Triangle("Area", 5, 6, 8);
        if (triangle.calculateArea() == 15) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void trianglePerimeter() {
        Triangle triangle = new Triangle("Perimeter", 6, 6, 8);
        if (triangle.calculatePerimeter() == 20) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}

