package student_vladislav_zagrebin.lesson_2.homeWork.day_3;

import java.util.Scanner;

public class Task_9_MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Please enter integer number to multiply:");

        Scanner scanner = new Scanner(System.in);
        int intNumber = scanner.nextInt();

        System.out.println("Please find results below:");
        System.out.println(intNumber + " x 1 = " + intNumber);
        System.out.println(intNumber + " x 2 = " + intNumber * 2);
        System.out.println(intNumber + " x 3 = " + intNumber * 3);
        System.out.println(intNumber + " x 4 = " + intNumber * 4);
        System.out.println(intNumber + " x 5 = " + intNumber * 5);
        System.out.println(intNumber + " x 6 = " + intNumber * 6);
        System.out.println(intNumber + " x 7 = " + intNumber * 7);
        System.out.println(intNumber + " x 8 = " + intNumber * 8);
        System.out.println(intNumber + " x 9 = " + intNumber * 9);
        System.out.println(intNumber + " x 10 = " + intNumber * 10);


    }
}
