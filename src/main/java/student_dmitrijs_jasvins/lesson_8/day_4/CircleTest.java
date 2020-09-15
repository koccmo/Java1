package student_dmitrijs_jasvins.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.circlePerimeter();
        circleTest.circleArea();
    }
    public void circlePerimeter(){
        Circle circle = new Circle(1,"Perimeter");
        if(circle.calculatePerimeter() == 6.283185307179586){
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void circleArea(){
        Circle circle = new Circle(1,"Area");
        if(circle.calculateArea() == 3.141592653589793){
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
