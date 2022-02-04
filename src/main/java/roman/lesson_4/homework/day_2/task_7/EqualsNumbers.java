package roman.lesson_4.homework.day_2.task_7;

import java.util.Scanner;

public class EqualsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter number");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers is equals!");
        } else {
            System.out.println("Numbers is different");
        }
    }
}
