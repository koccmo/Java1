package student_jaroslav_brutan.lesson_4.day_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number >= 0){
            System.out.println("The number is positive!");
        } else {
            System.out.println("The number is negative!");
        }
    }
}
