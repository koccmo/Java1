package roman.lesson_4.homework.day_3.task_9;

import java.util.Scanner;

public class IncreasingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = sc.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("The numbers are in increasing order");
        } else {if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The numbers are in decreasing order");
        } else {System.out.println("Neither increasing or decreasing order");}}
    }
}
