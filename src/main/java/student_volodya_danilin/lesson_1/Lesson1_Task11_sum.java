package student_volodya_danilin.lesson_1;

import java.util.Scanner;
public class Lesson1_Task11_sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int number2 = input.nextInt();

        int number3 = number1 + number2;
        String answer = Integer.toString(number3);

        System.out.println("The sum is : " + number3);
    }
}
