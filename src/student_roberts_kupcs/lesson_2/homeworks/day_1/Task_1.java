package student_roberts_kupcs.lesson_2.homeworks.day_1;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in) ;
        System.out.println("Enter first number: ");
        int firstNumber = myInput.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = myInput.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("result = " + result);

        result = firstNumber - secondNumber;
        System.out.println("result = " + result);

        result = firstNumber * secondNumber;
        System.out.println("result = " + result);

        result = firstNumber / secondNumber;
        System.out.println("result = " + result);
    }

}
