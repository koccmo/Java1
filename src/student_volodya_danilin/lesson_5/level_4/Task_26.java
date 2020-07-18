package student_volodya_danilin.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] Args) {

        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.print("Enter array length: ");        //запросите у пользователя с консоли длину массива
        int arrayLength = userInput.nextInt();

        int[] integerArray = new int[arrayLength];       //создайте массив указанной пользователем длины

        for (int i = 0; i < integerArray.length; i++) {  //заполните массив случайными числами
            integerArray[i] = randomNumber.nextInt();
        }

        for (int i = 0; i < integerArray.length; i++) {  //распечатайте на консоль все элементы массива.
            System.out.print(integerArray[i] + " ");
        }
    }
}
