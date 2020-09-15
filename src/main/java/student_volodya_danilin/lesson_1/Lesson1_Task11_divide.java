package student_volodya_danilin.lesson_1;

import java.util.Scanner;

public class Lesson1_Task11_divide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double number1 = input.nextInt();

        System.out.println("Enter number 2: ");
        double number2 = input.nextInt();

        double number3 = number1 / number2;
        String answer = Double.toString(number3);

        System.out.println("Divide result : " + answer);
    }
}
