package student_valerija_ionova.lesson_5.level_4;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.*/

import java.util.Random;

class Task28 {
    public static void main(String[] args){

        //- создайте массив произвольной длины
        Random random = new Random();
        int arrayLength = random.nextInt(20)+2;

        int newArray [] = new int [arrayLength];

        //- заполните массив случайными числами
        for (int i=0; i<arrayLength; i++){
            newArray[i] = random.nextInt(100);
        }

        //- распечатайте на консоль все элементы массива
        for (int element:newArray
             ) {
            System.out.print(element+" ");
        }

        //- найдите наименьшее число в массиве и выведети его на консоль.

        int min = newArray[0];
        for (int i = 0; i < arrayLength; i++){
            if (newArray[i] < min){
                min = newArray[i];
            }
        }

        System.out.println("\n" + "Min = "+min);

    }
}
