package student_roberts_kupcs.lesson_5.homework.level_4;

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наименьшее число в массиве и выведети его на консоль.

import java.util.Random;

class ArrayLength28 {
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
            System.out.print(array[i] + " ");
        }

//- найдите наименьшее число в массиве и выведети его на консоль.
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber)
                minNumber = array[i];

        }
        System.out.print("\nнаименьшее число " + minNumber);
    }
}
