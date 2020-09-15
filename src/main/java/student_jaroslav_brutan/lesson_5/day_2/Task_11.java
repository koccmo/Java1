package student_jaroslav_brutan.lesson_5.day_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number!");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number!");
        int secondNumber = sc.nextInt();
        System.out.println("Enter second number!");
        int thirdNumber = sc.nextInt();
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
