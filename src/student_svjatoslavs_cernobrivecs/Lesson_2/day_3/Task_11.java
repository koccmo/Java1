package student_svjatoslavs_cernobrivecs.Lesson_2.day_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = x.nextInt();
        System.out.println("Second number:");
        int secondNumber = x.nextInt();
        System.out.println("Third number:");
        int thirdNumber = x.nextInt();

        double result = (firstNumber + secondNumber + thirdNumber) / (double) 3;

        System.out.println("Result: " + result);

    }
}
