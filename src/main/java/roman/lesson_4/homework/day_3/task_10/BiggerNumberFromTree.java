package roman.lesson_4.homework.day_3.task_10;

import java.util.Scanner;

public class BiggerNumberFromTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number :");
        int thirdNumber = sc.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Bigger number is - " + firstNumber);
        }
        if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Bigger number is - " + secondNumber);
        }
        if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println("Bigger number is - " + thirdNumber);
        }
    }
}
