package student_eduards_jasvins.lesson_4.day_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number = ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter third number = ");
        int numberThree = scanner.nextInt();
        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println("All numbers are equal");
        } else if ((numberOne == numberTwo) || (numberOne == numberThree) || (numberThree == numberTwo)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
