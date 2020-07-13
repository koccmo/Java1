package student_roberts_kupcs.lesson_5.homework.level_4;

//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.

import java.util.Scanner;

class ArrayLength25 {
    public static void main(String[] args) {
        System.out.println("длину массива: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        int array[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);

        }

    }
}
