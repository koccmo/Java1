package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.circleTestArea();
        test.circleTestPerimeter();
    }


    void circleTestArea(){

        Circle circle = new Circle("Circle", 3);
        if (circle.calculateArea() == 28.26){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void circleTestPerimeter(){

        Circle circle = new Circle("Circle", 3);
        if (circle.calculatePerimeter() == 18.84){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
