package student_volodya_danilin.lesson_8.level_3.Task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends ShapeCalculations {

    int radius;

    Circle() {
        shape = "Circle";
        radius = 5;
    }

    Circle(int radius) {
        shape = "Circle";
        this.radius = radius;
    }

    @Override
    void calculatePerimeter() {
        perimeter = radius * Pi;
    }

    @Override
    void calculateArea() {
        area = radius * radius * Pi;
    }

}
