package student_jaroslav_brutan.lesson_4.day_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = sc.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)){
            System.out.println("All numbers are equal");
        } else if ((firstNumber == secondNumber) || (firstNumber == thirdNumber) || (secondNumber == thirdNumber)){
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
