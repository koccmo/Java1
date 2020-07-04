package student_roberts_kupcs.lesson_4.homework.level_3;

import java.util.Scanner;

class IncreasingDecreasingNeitherNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1 числo : ");
        int firstNumber = sc.nextInt();

        System.out.println("Введите 2 числo : ");
        int seconNumber = sc.nextInt();

        System.out.println("Введите 3 числo : ");
        int thirdNumber = sc.nextInt();

        if ((firstNumber < seconNumber) && (seconNumber < thirdNumber) ) {
            System.out.println("increasing");
        } else if ((firstNumber > seconNumber) && (seconNumber > thirdNumber)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
