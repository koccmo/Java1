package student_volodya_danilin.lesson_8.level_4.Task_16;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle extends Shape {

    private double radius;
    private double Pi = 3.1415;

    @Override
    public double calculateArea() {
        double result;
        result = radius * radius * Pi;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        double result;
        result = radius * Pi;
        return result;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    // implement here calculateArea()

    // implement here calculatePerimeter()

}