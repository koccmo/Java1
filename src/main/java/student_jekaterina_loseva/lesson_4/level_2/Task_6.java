package student_jekaterina_loseva.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first integer number:");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter second integer number:");
        int number2 = scanner.nextInt();


        if (number1 < number2) {
            System.out.println("the fewest is: " + number1);
        } else if (number2 < number1){
            System.out.println("the fewest is: " + number2);
        } else {
            System.out.println("Numbers are equals");
        }

    }

}
