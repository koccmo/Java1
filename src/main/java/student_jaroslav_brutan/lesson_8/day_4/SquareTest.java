package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SquareTest {

    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.squareTestArea();
        test.squareTestPerimeter();
    }

    void squareTestArea(){

        Square square = new Square("Square", 5);
        if (square.calculateArea() == 25){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void squareTestPerimeter(){

        Square square = new Square("Square", 5);
        if (square.calculatePerimeter() == 20){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
