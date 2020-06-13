package student_jekaterina_loseva.lesson_2.day_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("everage is: " + average);

    }

}
