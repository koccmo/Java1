package student_svjatoslavs_cernobrivecs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();

        int[] numbers = new int[3];

        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;

        System.out.println(Arrays.toString(numbers));
    }
}
