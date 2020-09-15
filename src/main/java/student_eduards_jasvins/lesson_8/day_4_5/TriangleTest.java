package student_eduards_jasvins.lesson_8.day_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleArea();
        triangleTest.trianglePerimeter();

    }

    private void triangleArea() {
        Shape triangle = new Triangle("Triangle", 2, 5, 0,0);
        if (triangle.calculateArea() == 5) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void trianglePerimeter() {
        Shape triangle = new Triangle("Triangle", 2, 0, 3, 5);
        if (triangle.calculatePerimeter() == 10) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

}
