package student_volodya_danilin.lesson_8.level_4.Task_17;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {

    private int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        int result;
        result = side * side;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        int result;
        result = side * 4;
        return result;
    }
}
