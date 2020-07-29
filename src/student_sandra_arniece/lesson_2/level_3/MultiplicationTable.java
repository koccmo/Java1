package student_sandra_arniece.lesson_2.level_3; //Task 9

import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer and press Enter:");

        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

}
