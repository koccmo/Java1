package student_eduards_jasvins.lesson_8.day_4_5;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.squarePerim();
        squareTest.squareArea();
    }

    private void squarePerim() {
        Shape square = new Square("Square", 2);
        if (square.calculatePerimeter() == 8) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void squareArea() {
        Shape square = new Square("Square", 4);
        if (square.calculateArea() == 16) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }
}
