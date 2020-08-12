package student_eduards_jasvins.lesson_8.day_4_5;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.calculPerimeter();
        circleTest.calculArea();
    }

    private void calculPerimeter() {
       Shape circle = new Circle("Circle", 1);
        if (circle.calculatePerimeter() == 6.28 ) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void calculArea() {
        Shape circle = new Circle("Circle", 2);
        if (circle.calculateArea() == 12.56 ) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }


}
