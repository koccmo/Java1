package student_roberts_kupcs.lesson_4.homework.level_2;

import java.util.Scanner;

class TwoNumbersEqualsOrDifferent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1 числo : ");
        int firstNumber = sc.nextInt();

        System.out.println("Введите 2 числo : ");
        int seconNumber = sc.nextInt();

        if (firstNumber == seconNumber) {
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Numbers are different");
        }

    }
}
