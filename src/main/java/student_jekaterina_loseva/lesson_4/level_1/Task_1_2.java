package student_jekaterina_loseva.lesson_4.level_1;

import java.util.Scanner;

public class Task_1_2 {

    public static void main(String[] args) {
        System.out.println("Please, enter an integer number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

}
