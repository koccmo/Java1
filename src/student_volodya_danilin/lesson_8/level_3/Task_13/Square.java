package student_volodya_danilin.lesson_8.level_3.Task_13;

public class Square extends ShapeCalculations {

    int side;

    Square() {
        shape = "Square";
        side = 3;
    }

    Square(int side) {
        shape = "Square";
        this.side = side;
    }

    @Override
    void calculatePerimeter() {
        perimeter = side * 4;
    }

    @Override
    void calculateArea() {
        area = side * side;
    }
}
