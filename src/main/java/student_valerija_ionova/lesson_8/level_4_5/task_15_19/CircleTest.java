package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleTest {

    public static void main (String [] args){

        CircleTest circleTest = new CircleTest();

        circleTest.testCircleArea();
        circleTest.testCirclePerimeter();
    }

    public void testCircleArea(){
        Circle circle = new Circle("Circle", 2);
        if (circle.calculateArea() == 12.56){
            System.out.println("testCircleArea OK");
        }else{
            System.out.println("testCircleArea FAIL");
        }
    }

    public void testCirclePerimeter(){
        Circle circle = new Circle("Circle", 2);
        if (circle.calculatePerimeter() == 12.56){
            System.out.println("testCirclePerimeter OK");
        }else{
            System.out.println("testCirclePerimeter FAIL");
        }
    }
}
