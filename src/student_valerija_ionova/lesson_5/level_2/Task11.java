package student_valerija_ionova.lesson_5.level_2;

/*Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        Scanner myInput = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please input number Nr."+(i+1)+": ");
            numbers[i] = myInput.nextInt();
        }

        for (int number:numbers
             ) {
            System.out.print(number+" ");
        }
    }

}
