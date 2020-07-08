package student_georgij_galin.lesson5.level_2;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number Nr" + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println("Number = " + number);
        }
    }
}
