package student_jekaterina_loseva.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        System.out.println("Please, enter 2 integer numbers:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        if (number1 > number2) {
            System.out.println("number 1 > number 2");
        } else if (number1 < number2){
            System.out.println("number 1 < number 2");
        } else {
            System.out.println("number 1 = number 2");
        }

    }
}
