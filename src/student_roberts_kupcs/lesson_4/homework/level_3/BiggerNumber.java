package student_roberts_kupcs.lesson_4.homework.level_3;

import java.util.Scanner;

class BiggerNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1 числo : ");
        int firstNumber = sc.nextInt();

        System.out.println("Введите 2 числo : ");
        int seconNumber = sc.nextInt();

        System.out.println("Введите 3 числo : ");
        int thirdNumber = sc.nextInt();

        if (firstNumber >= seconNumber && firstNumber >= thirdNumber) {
            int bigger = firstNumber;
            System.out.println("наибольшее : " + bigger);
        } else if (seconNumber >= thirdNumber && seconNumber >= firstNumber) {
            int bigger = seconNumber;
            System.out.println("наибольшее : " + bigger);
        } else {
            int bigger = thirdNumber;
            System.out.println("наибольшее : " + bigger);
        }
    }
}
