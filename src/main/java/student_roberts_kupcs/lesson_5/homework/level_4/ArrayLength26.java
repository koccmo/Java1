package student_roberts_kupcs.lesson_5.homework.level_4;

//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.

import java.util.Random;
import java.util.Scanner;

class ArrayLength26 {
    public static void main(String[] args) {
        //- запросите у пользователя с консоли длину массива

        System.out.println("длину массива: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        //- создайте массив указанной пользователем длины
        int array[] = new int[arrayLength];

        //- заполните массив случайными числами
        Random number = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = number.nextInt(20);
        }

        //- распечатайте на консоль все элементы массива.
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + array[i]);

        }
    }
}
