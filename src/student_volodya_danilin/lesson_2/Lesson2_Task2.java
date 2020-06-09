package student_volodya_danilin.lesson_2;

import java.util.Scanner;

public class Lesson2_Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        double number1 = input.nextDouble();

        System.out.println("Enter number2 : ");
        double number2 = input.nextDouble();

        System.out.println("a+b = " + (number1+number2));
        System.out.println("a-b = " + (number1-number2));
        System.out.println("a*b = " + (number1*number2));
        System.out.println("a/b = " + (number1/number2));
    }

}
