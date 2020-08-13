package student_volodya_danilin.lesson_8.level_4.Task_18;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;

public class Rectangle extends Shape {

    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        int result;
        result = sideA * sideB;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        int result;
        result = (sideA + sideB) * 2;
        return result;
    }
}
