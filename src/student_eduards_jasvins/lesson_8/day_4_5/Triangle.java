package student_eduards_jasvins.lesson_8.day_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape {

    private double a;
    private double h;
    private double b;
    private double c;

    Triangle(String title, double a, double h, double c, double b) {
        super(title);
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        return (a * h) / 2;
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}
