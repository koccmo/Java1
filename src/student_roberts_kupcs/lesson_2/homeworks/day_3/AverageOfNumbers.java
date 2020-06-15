package student_roberts_kupcs.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number");
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        double numberThree = scanner.nextDouble();
        double averageOfThreeNumber = 3;
        System.out.print("Average of the numbers : " + ((numberOne + numberTwo + numberThree)/averageOfThreeNumber));

    }
}
