package student_valerija_ionova.lesson_8.level_4.task_15_19;

public class RectangleTest {
    public static void main(String [] args){

        RectangleTest test = new RectangleTest();

        test.testRectangleArea();
        test.testRectanglePerimeter();
    }

    public void testRectangleArea(){
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);

        if (rectangle.calculateArea() == 20){
            System.out.println("testRectangleArea OK");
        }else{
            System.out.println("testRectangleArea FAIL");
        }
    }

    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);

        if (rectangle.calculatePerimeter() == 18){
            System.out.println("testRectangleArea OK");
        }else{
            System.out.println("testRectangleArea FAIL");
        }
    }
}
