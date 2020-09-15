package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();
        test.triangleTestArea();
        test.triangleTestPerimeter();
    }

    void triangleTestArea(){

        Triangle triangle = new Triangle("Triangle", 4, 8,6);
        if (triangle.calculateArea() == 11.619){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void triangleTestPerimeter(){

        Triangle triangle = new Triangle("Triangle", 4,8,6);
        if (triangle.calculatePerimeter() == 18){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
