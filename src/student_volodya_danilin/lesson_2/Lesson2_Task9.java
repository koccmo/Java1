package student_volodya_danilin.lesson_2;

import java.util.Scanner;

public class Lesson2_Task9 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = input.nextInt();

        for (int i = 0; i <= 10; i++)
            System.out.println(number + " x " + i + " = " + (number * i));
    }
}
