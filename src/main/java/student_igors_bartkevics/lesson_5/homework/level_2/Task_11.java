/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
package student_igors_bartkevics.lesson_5.homework.level_2;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("array[" + i + "] = " + array[i] + "   ");
        }
    }

}
