package student_valerija_ionova.lesson_5.level_4;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args){

        //- запросите у пользователя с консоли длину массива
        System.out.println("Please input length of the array!");
        Scanner myInput = new Scanner (System.in);
        int lengthOfArray = myInput.nextInt();

        //- создайте массив указанной пользователем длины
        int newArray [] = new int [lengthOfArray];

        //- заполните массив числами полученными от пользователя
        System.out.println("It's time to fill array!");
        for (int i = 0; i < lengthOfArray; i++){
            System.out.println("Please input number Nr."+(i+1));
            newArray[i] = myInput.nextInt();
        }


        //- распечатайте на консоль все элементы массива.
        for (int number:newArray
             ) {
            System.out.print(number+" ");
        }

    }

}
