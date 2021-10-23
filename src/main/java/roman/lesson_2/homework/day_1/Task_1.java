package roman.lesson_2.homework.day_1;

import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args){

        Scanner userInput = new Scanner( System.in );
        System.out.println("Put in first number: ");
        int firstNumber = userInput.nextInt();
        System.out.println("Put in second number: ");
        int secondNumber = userInput.nextInt();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println("Smile " + (firstNumber + secondNumber) + " pottdgjhjh");
        System.out.println("Summa result: " + (firstNumber) + " + " + (secondNumber) +  " = " + (firstNumber + secondNumber));
        System.out.println("Minus result: " + (firstNumber) + " - " + (secondNumber) +  " = " + (firstNumber - secondNumber));
        System.out.println("Double result: " + (firstNumber) + " x " + (secondNumber) +  " = " + (firstNumber * secondNumber));
        System.out.println("Devide result: " + (firstNumber) + " : " + (secondNumber) +  " = " + (firstNumber / secondNumber));


    }
}
