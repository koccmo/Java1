package student_jaroslav_brutan.lesson_2.day_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args){
        Scanner anyInt = new Scanner(System.in);
                System.out.println("Enter first double number");
        double firstNumber = anyInt.nextDouble();
        System.out.println("Enter second double number");
        double secondNumber = anyInt.nextDouble();

        double sumResult = firstNumber + secondNumber;
        double subtractResult = firstNumber + secondNumber;
        double multiplyResult = firstNumber * secondNumber;
        double divisionResult = firstNumber / secondNumber;

        System.out.println("sumResult = " + sumResult);
        System.out.println("subtractResult = " + subtractResult);
        System.out.println("multiplyResult = " + firstNumber * secondNumber);
        System.out.println("divisionResult = " + divisionResult);



    }
}
