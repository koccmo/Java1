package student_jaroslav_brutan.lesson_4.day_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("First number is bigger!");
        } else {
            System.out.println("Second number is bigger!");
        }
    }
}
