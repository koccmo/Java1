package roman.lesson_4.homework.day_2.task_6;

import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter int number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Smaller number : " + firstNumber);
        } else {
            System.out.println("Smaller number : " + secondNumber);
        }
    }
}
