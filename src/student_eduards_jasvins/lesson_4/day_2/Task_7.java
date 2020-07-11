package student_eduards_jasvins.lesson_4.day_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number = ");
        int numberTwo = scanner.nextInt();
        if (numberOne == numberTwo){
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Number are different");
        }
    }
}
