package student_valerija_ionova.lesson_15.level_2_intern.task_5;

class QuadraticEq {

    public void calc (double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            calculateRootsIfDiscriminantPositive (a, b, discriminant);
        }
        else if (discriminant == 0) {
            calculateRootsIfDeterminantIsNull(a, b);
        }
        else {
            calculateRootsIfDiscriminantNegative();
        }
    }

    void calculateRootsIfDiscriminantPositive (double a, double b, double discriminant){
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    void calculateRootsIfDeterminantIsNull(double a, double b){
        double x;
        x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    void calculateRootsIfDiscriminantNegative(){
        System.out.println("Equation has no roots");
    }

}