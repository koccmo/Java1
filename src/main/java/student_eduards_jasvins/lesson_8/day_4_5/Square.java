package student_eduards_jasvins.lesson_8.day_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {

    private double a;


    public Square(String title, double a) {
        super(title);
        this.a = a;

    }

    @Override
    double calculateArea() {
        return a * 2 * 2;
    }

    @Override
    double calculatePerimeter() {
        return 4 * a;
    }
}
