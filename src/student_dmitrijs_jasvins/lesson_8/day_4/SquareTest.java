package student_dmitrijs_jasvins.lesson_8.day_4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.squareArea();
        squareTest.squarePerimeter();
    }
    public void squareArea(){
        Square square = new Square(5,"Area");
        if (square.calculateArea() == 20) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void squarePerimeter () {
        Square square = new Square(5,"Perimeter");
        if (square.calculatePerimeter() == 25){
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
