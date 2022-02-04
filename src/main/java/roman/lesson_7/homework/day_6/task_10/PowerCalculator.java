package roman.lesson_7.homework.day_6.task_10;



public class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator demo = new PowerCalculator();
        System.out.println(demo.numberExponentiation(0, -2));
    }
    public double numberExponentiation(double baseNumber, int degree) {
        if(degreeIsNegative(degree)) {
            baseNumber = 1/baseNumber;
            degree = Math.abs(degree);
        } else if(degreeIsZero(degree)) {
            baseNumber = 1;
            degree = 1;
        }
        return exponentiationForPositiveDegree(baseNumber, degree);
        }

    public double exponentiationForPositiveDegree(double baseNumber, int degree) {
        while(degree > 1) {
            baseNumber *=baseNumber;
            degree--;
        }
        return baseNumber;
    }

    public boolean degreeIsNegative(int degree) {return degree < 0;}
    public boolean degreeIsZero(int degree) {return degree == 0;}


}
