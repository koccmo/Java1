package student_jaroslav_brutan.lesson_4.day_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberOne = sc.nextInt();
        System.out.println("Enter second number");
        int numberTwo = sc.nextInt();
        System.out.println("Enter third number");
        int numberThree = sc.nextInt();

        if ((numberOne > numberTwo) && (numberOne > numberThree)){
            System.out.println("Number one is the biggest!");
        } else if ((numberTwo > numberOne) && (numberTwo > numberThree)){
            System.out.println("Number two is the biggest!");
        } else {
            System.out.println("Number three is the biggest!");
        }
    }
}
