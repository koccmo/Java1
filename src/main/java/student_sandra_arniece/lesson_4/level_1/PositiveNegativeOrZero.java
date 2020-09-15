package student_sandra_arniece.lesson_4.level_1; //Task 2

import java.util.Scanner;

class PositiveNegativeOrZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int numberInput = sc.nextInt();
        if (numberInput > 0) {
            System.out.println("The number is positive.");
        } else if (numberInput < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

}
