package student_jaroslav_brutan.lesson_4.day_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberOne = sc.nextInt();
        System.out.println("Enter second number");
        int numberTwo = sc.nextInt();
        System.out.println("Enter third number");
        int numberThree = sc.nextInt();

        if ((numberOne < numberTwo) && (numberTwo < numberThree)){
            System.out.println("Numbers are in increasing order");
        } else if ((numberOne > numberTwo) && (numberTwo > numberThree)){
            System.out.println("Numbers are in decreasing order");
        } else {
            System.out.println("Numbers are neither decreasing or increasing order");
        }
    }
}
