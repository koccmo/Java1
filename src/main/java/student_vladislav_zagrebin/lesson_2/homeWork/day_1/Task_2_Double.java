package student_vladislav_zagrebin.lesson_2.homeWork.day_1;

import java.util.Scanner;

public class Task_2_Double {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first Double number:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please enter second Double number:");
        double secondDoubleNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double multi = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / (double) secondDoubleNumber;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + multi);
        System.out.println("Division = " + div);

    }


}
