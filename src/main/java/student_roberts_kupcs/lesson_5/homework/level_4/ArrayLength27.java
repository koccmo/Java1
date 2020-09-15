package student_roberts_kupcs.lesson_5.homework.level_4;

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.

import java.util.Random;

class ArrayLength27 {
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

        //- найдите наибольшее число в массиве и выведети его на консоль.
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i])
                maxNumber = array[i];
        }
        System.out.println("\nнаибольшее число " + maxNumber);

    }
}
