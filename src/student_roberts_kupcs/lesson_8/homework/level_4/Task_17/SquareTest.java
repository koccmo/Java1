package student_roberts_kupcs.lesson_8.homework.level_4.Task_17;


class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.calculateAreaTest();
        squareTest.calculatePerimeterTest();

    }

    public void calculateAreaTest() {
        Square square = new Square("Square", 3);
        if (square.calculateArea() == 9.0) {
            System.out.println("Calculate Area Test OK");
        } else {
            System.out.println("Calculate Area Test FAIL");
        }
    }

    public void calculatePerimeterTest() {
        Square square = new Square("Square", 3);
        if (square.calculatePerimeter() == 12.0) {
            System.out.println("Calculate perimeter Test OK");
        } else {
            System.out.println("Calculate Perimeter Test FAIL");
        }
    }
}
