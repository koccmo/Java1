package student_eduards_jasvins.lesson_4.day_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number = ");
        int numberTwo = scanner.nextInt();
        System.out.println("Etner third number = ");
        int numberThree = scanner.nextInt();
        if (numberOne < numberTwo & numberThree > numberTwo){
            System.out.println("Numbers is increasing");
        }else if (numberOne > numberTwo & numberThree < numberTwo){
            System.out.println("Numbers is decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
