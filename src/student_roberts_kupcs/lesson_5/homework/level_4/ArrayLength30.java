package student_roberts_kupcs.lesson_5.homework.level_4;

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите все нечётные числа в массиве и выведети их на консоль.

import java.util.Random;

class ArrayLength30 {
    public static void main(String[] args) {
        //- создайте массив произвольной длины
        int array[] = new int[4];

        //- заполните массив случайными числами
        Random number = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(20);
        }
        //- распечатайте на консоль все элементы массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

//- найдите все нечётные числа в массиве и выведети их на консоль.

        System.out.print("\nнечётные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.print(array[i] + ", ");
            }
        }
    }
}
