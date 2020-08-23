package student_alexey_tretyakov.lesson_7.level_6;

import java.text.DecimalFormat;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "import java.text.DecimalFormat - не используемый импорт, удалить")
class PowerCalculator {
     // считает любые степень (+ или -) и основание ( всегда положительное ).
    // дробная степень числа округляется до ближайшего целого .
    //
    private double base ;
    private int power;

    @CodeReviewComment(teacher = "Зачем этот конструктор?")
    public PowerCalculator(){}

    public PowerCalculator(double base, int power) {
        this.base = base;
        this.power = power;
    }

    public double getBase() {
        return base;
    }

    public double getPower() {
        return power;
    }

    private boolean isNegativePower() {
        return power >= 0;
    }

    private double calculateBasePower (int power){
        double result = base;
        if ( power >= 1 ) {
            for (int i = 1; i < power; i++) {
                result = result * base;
            }
            return result;
        } else {
            return 1;
        }
    }
    private double roundDouble(double inValue){
        inValue = 1000000 * inValue;
        inValue = Math.round( inValue);
        inValue = inValue / 1000000;
        return inValue;
    }
    protected double calculatePower () {

        if ( base <=0 ) {
            System.out.println( "Основание  должно быть больше 0 !!!");
            System.exit(0);
        }
        double outValue ;
        if ( isNegativePower ()) {
            outValue = roundDouble( calculateBasePower( power));
            return  outValue;
        } else {
            power = Math.abs(power);
            outValue = roundDouble( 1 / calculateBasePower( power));
            return  outValue;
        }
    }

    public static void main(String[] args) {

       PowerCalculator powerCalculator = new PowerCalculator(16,2);
        System.out.println("Base = " + powerCalculator.getBase());
        System.out.println("Power = " + powerCalculator.getPower());
        double result ;
        System.out.println(0.2*0.2*0.2*0.2);
        result = powerCalculator.calculatePower();
        System.out.println( "My power = " + result );
        result = Math.pow(powerCalculator.getBase(), powerCalculator.getPower());
        System.out.println( "Math power = " + result );
    }

}
