package student_jaroslav_brutan.lesson_2.day_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String [] args) {
        Scanner someInt = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = someInt.nextInt();

        System.out.println("Enter second number");
        int secondNumber = someInt.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        double divisonResult = firstNumber /(double)secondNumber;

        System.out.println("sumResult = " + sumResult);
        System.out.println("subtractResult = " + subtractResult);
        System.out.println("multiplicity = " + multiplyResult);
        System.out.println("division = " + divisonResult);


    }

}
