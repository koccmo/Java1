package student_valerija_ionova.lesson_5.level_4;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.*/

import java.util.Random;

public class Task30 {
    public static void main(String[] args){

        //- создайте массив произвольной длины
        Random random = new Random();
        int arrayLength = random.nextInt(25)+2;

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

        //- найдите все нечётные числа в массиве и выведети их на консоль
        System.out.println("\n"+"Odd numbers:");
        for (int element:newArray
             ) {
            if (element % 2 != 0){
                System.out.print(element+" ");
            }
        }
    }
}
