package student_roberts_kupcs.lesson_4.homework.level_2;

import java.util.Scanner;

class MinOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1 числo");
        int firstNumber = sc.nextInt();

        System.out.println("Введите 2 числo");
        int secondNumber = sc.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("наименьшее : " + firstNumber);
        } else {
            System.out.println("наименьшее : " + secondNumber);
        }
    }
}
