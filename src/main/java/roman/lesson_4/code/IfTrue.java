package roman.lesson_4.code;

import java.util.Scanner;

public class IfTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = sc.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.println("First number bigger or = Second number");
        } else {
            System.out.println("Biger!");
        }
    }
}
