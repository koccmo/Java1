package student_roberts_kupcs.lesson_15.homework.level_2.Task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class QuadraticEq {

    public double calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            discriminantEqualsZero(a, b);
        } else {
            discriminantLessThanZero();
        }
        return discriminant;
    }

    public void discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    public void discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    public void discriminantLessThanZero() {
        System.out.println("Equation has no roots");
    }
}
