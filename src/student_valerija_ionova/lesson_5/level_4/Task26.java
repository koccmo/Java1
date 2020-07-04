package student_valerija_ionova.lesson_5.level_4;


/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива

- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/

import java.util.Random;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args){

        //- запросите у пользователя с консоли длину массива
        System.out.println("Please input length of the Array:");

        Scanner myInput = new Scanner(System.in);
        int lengthOfArray = myInput.nextInt();

        //- создайте массив указанной пользователем длины
        int newArray [] = new int [lengthOfArray];

        //- заполните массив случайными числами
        Random number = new Random ();
        for (int i=0; i<lengthOfArray; i++){
            newArray[i] = number.nextInt(100);
        }

        for (int element:newArray
             ) {
            System.out.print(element+" ");
        }
    }

}
