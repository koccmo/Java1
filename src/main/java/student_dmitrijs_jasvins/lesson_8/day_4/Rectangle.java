package student_dmitrijs_jasvins.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Rectangle extends Shape {

    private double length;
    private double weight;

    public Rectangle(String title, double length, double weight) {
        super(title);
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double calculateArea() {
        return length * weight;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + weight);
    }
}
