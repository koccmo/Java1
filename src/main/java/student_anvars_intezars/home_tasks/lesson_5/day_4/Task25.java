package student_anvars_intezars.home_tasks.lesson_5.day_4;

import java.util.Random;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number to define the length of array:");
        int number = sc.nextInt();

        Random random = new Random();
        int[] array = new int[number];

        System.out.println();
        System.out.println("Please enter number to define range of random numbers");
        int range = sc.nextInt();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(range);
            array[i] = randomNumber;
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
