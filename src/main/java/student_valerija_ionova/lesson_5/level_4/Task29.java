package student_valerija_ionova.lesson_5.level_4;


/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.*/

import java.util.Random;

class Task29 {
    public static void main(String[] args){

        //- создайте массив произвольной длины
        Random random = new Random();
        int arrayLength = random.nextInt(20)+2;
        int newArray [] = new int [arrayLength];

        //- заполните массив случайными числами
        for (int i = 0; i < arrayLength; i++){
            newArray[i] = random.nextInt(200);
        }

        for (int element:newArray
             ) {
            System.out.print(element+" ");
        }

        System.out.println("\n"+"Even numbers: ");

        //- найдите все чётные числа в массиве и выведети их на консоль

        for (int i=0; i<arrayLength; i++){
            if (newArray[i] % 2 ==0){
                System.out.print(newArray[i]+" ");
            }
        }

    }
}
