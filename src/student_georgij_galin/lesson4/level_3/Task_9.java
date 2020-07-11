package student_georgij_galin.lesson4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number:");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the third number:");
        int thirdNumber = scanner.nextInt();
        if (firstNumber < secondNumber & thirdNumber > secondNumber) {
            System.out.println("Number increasing");
        } else if (firstNumber > secondNumber & thirdNumber < secondNumber) {
            System.out.println("Number decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}