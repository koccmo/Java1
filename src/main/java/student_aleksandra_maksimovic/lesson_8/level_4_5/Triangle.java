package student_aleksandra_maksimovic.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle (double side1, double side2, double side3) {
        super("triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * ((halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3)));
    }

    @Override
    double calculatePerimeter() {
        return (side1 + side2 + side3);
    }
}
