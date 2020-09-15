package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length of array: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please, enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("You are entered number into array: " + numbers[i]);
        }
    }

}
