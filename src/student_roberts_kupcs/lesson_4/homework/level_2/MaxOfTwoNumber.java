package student_roberts_kupcs.lesson_4.homework.level_2;

import java.util.Scanner;

class MaxOfTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите 1 числo : ");
        int firstNumber = sc.nextInt();

        System.out.print("Введите 2 числo : ");
        int seconNumber = sc.nextInt();

        if (firstNumber > seconNumber) {

            System.out.println("наибольшее : " + firstNumber);
        } else {

            System.out.println("наибольшее : " + seconNumber);
        }

    }
}
