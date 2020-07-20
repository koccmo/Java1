package student_jaroslav_brutan.lesson_5.day_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");

        // для чего используется переменная arrayLength?
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[scanner.nextInt()];

        Random randomNumbers = new Random();
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = randomNumbers.nextInt(20);
                   }
        for (int i = 0;i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
