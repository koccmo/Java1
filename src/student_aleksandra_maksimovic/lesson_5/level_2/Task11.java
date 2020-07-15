package student_aleksandra_maksimovic.lesson_5.level_2;

import java.util.Scanner;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
public class Task11 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Scanner inputNumber = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++ ) {
            System.out.println("Enter your number Nr-" + (i + 1)  );
             arr[i] = inputNumber.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] : " + arr[i]);
        }


    }

}
