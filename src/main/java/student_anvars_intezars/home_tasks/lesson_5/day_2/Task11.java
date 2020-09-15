package student_anvars_intezars.home_tasks.lesson_5.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Please enter first integer:");
        numbers[0] = sc.nextInt();

        System.out.println();
        System.out.println("Please enter second integer:");
        numbers[1] = sc.nextInt();

        System.out.println();
        System.out.println("Please enter third integer");
        numbers[2] = sc.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
