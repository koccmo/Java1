package student_igors_bartkevics.lesson_2.homeworks;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1-st number:");
        float firstNumber = scanner.nextFloat();

        System.out.println("Enter the 2-nd number:");
        float secondNumber = scanner.nextFloat();

        System.out.println("Enter the 3-rd number:");
        float thirdNumber = scanner.nextFloat();

        // The first method
        float average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of entered numbers is " + average);

        //The second method using METHOD

        System.out.println("The average of entered numbers is " + methodAverage(firstNumber, secondNumber, thirdNumber));
    }
    public static float methodAverage(float x, float y, float z){
        return (x + y + z) / 3;
    }
}
