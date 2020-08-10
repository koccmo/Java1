package student_jaroslav_brutan.lesson_8.day_4;

public class RectangleTest {

    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();
        test.rectangleTestArea();
        test.rectangleTestPerimeter();
    }

    void rectangleTestArea(){

        Rectangle rectangle = new Rectangle("Rectangle", 2,3);
        if (rectangle.calculateArea() == 6){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void rectangleTestPerimeter(){

        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        if (rectangle.calculateArea() == 12){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
