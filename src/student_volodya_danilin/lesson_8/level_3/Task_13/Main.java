package student_volodya_danilin.lesson_8.level_3.Task_13;

public class Main {

    public static void main(String[] Args) {

        Circle testCircle1 = new Circle();
        testCircle1.calculatePerimeter();
        testCircle1.calculateArea();
        testCircle1.showResult();

        System.out.println();

        Circle testCircle2 = new Circle(10);
        testCircle2.calculatePerimeter();
        testCircle2.calculateArea();
        testCircle2.showResult();

        System.out.println();

        Square testSquare1 = new Square();
        testSquare1.calculatePerimeter();
        testSquare1.calculateArea();
        testSquare1.showResult();

        System.out.println();

        Square testSquare2 = new Square(10);
        testSquare2.calculatePerimeter();
        testSquare2.calculateArea();
        testSquare2.showResult();
    }
}
