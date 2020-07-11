package student_georgij_galin.lesson5.level_4;

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length :");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Fill array's :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);

        }
    }
}

