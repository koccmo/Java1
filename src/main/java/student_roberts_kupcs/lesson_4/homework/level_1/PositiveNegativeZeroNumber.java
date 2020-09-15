package student_roberts_kupcs.lesson_4.homework.level_1;

import java.util.Scanner;

class PositiveNegativeZeroNumber {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + " is positive ");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative ");
        }
        else {
            System.out.println("Number " + number + " is zero ");

        }
    }
}
