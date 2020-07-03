package student_jekaterina_loseva.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        System.out.println("Please, enter an integer number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number%2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

}
