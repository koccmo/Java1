package student_georgij_galin.lesson4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Number are equals");
        } else {
            System.out.println("Number are different");
        }
    }
}