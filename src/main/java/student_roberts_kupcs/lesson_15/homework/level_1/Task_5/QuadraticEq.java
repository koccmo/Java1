package student_roberts_kupcs.lesson_15.homework.level_1.Task_5;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }
}
