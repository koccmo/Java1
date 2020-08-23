package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
