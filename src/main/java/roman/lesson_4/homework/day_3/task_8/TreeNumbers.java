package roman.lesson_4.homework.day_3.task_8;

import java.util.Scanner;

public class TreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else { if (firstNumber != secondNumber && secondNumber != thirdNumber) {
        System.out.println("All numbers are different");
                } else {
            System.out.println("Neither all are equal or different");
        }
        }
    }
}
