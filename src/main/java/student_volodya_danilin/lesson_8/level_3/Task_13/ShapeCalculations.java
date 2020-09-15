package student_volodya_danilin.lesson_8.level_3.Task_13;

import java.text.DecimalFormat;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class ShapeCalculations {

    String shape;
    double perimeter;
    double area;
    double Pi = 3.1415;

    DecimalFormat df = new DecimalFormat("#.##");

    abstract void calculatePerimeter();

    abstract void calculateArea();

    void showResult() {
        System.out.println("Shape : " + this.shape);
        System.out.println("Perimeter : " + df.format(this.perimeter));
        System.out.println("Area : " + df.format(this.area));
    }


}
