package student_jekaterina_loseva.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        int[] number = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first integer number:");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter second integer number:");
        int number2 = scanner.nextInt();
        System.out.println("Please, enter third integer number:");
        int number3 = scanner.nextInt();

        number[0] = number1;
        number[1] = number2;
        number[2] = number3;

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
    }

}
