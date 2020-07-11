package student_valerija_ionova.lesson_5.level_4;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/

import java.util.Random;

public class Task27 {
    public static void main(String[] args){

        //- создайте массив произвольной длины
        Random random = new Random();
        int arrayLength = random.nextInt(20)+2;

        int newArray [] = new int [arrayLength];

        //- заполните массив случайными числами
        for (int i=0; i<arrayLength; i++){
            newArray[i] = random.nextInt(25);
        }


        //- распечатайте на консоль все элементы массива
        for (int element:newArray
             ) {
            System.out.print(element+" ");
        }

        //- найдите наибольшее число в массиве и выведети его на консоль.

        int max = newArray[0];
        for (int i = 0; i<arrayLength; i++){
            if (newArray[i]>max){
                max = newArray[i];
            }
        }

        System.out.println("\n"+"Max = "+ max);

    }
}
