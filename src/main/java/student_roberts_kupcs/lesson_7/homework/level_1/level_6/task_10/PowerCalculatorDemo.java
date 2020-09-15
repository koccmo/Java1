package student_roberts_kupcs.lesson_7.homework.level_1.level_6.task_10;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class PowerCalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int firstnumber = sc.nextInt();

        System.out.println("Enter exponent : ");
        int numPower = sc.nextInt();

        PowerCalculator powerCalculator = new PowerCalculator();

        int powerResult = powerCalculator.numberPower(firstnumber, numPower);
        System.out.println("Number power = " + powerResult);


    }
}
