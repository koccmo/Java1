package student_volodya_danilin.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] Args) {

        int[] integerArray = new int[3];
        Scanner inputData = new Scanner(System.in);

        int count = 0;
        while (count < integerArray.length) {                          //заполняем массив input'ом
            System.out.print("Enter number" + (count + 1) + ": ");
            integerArray[count] = inputData.nextInt();
            count++;
        }

        for (count = 0; count < integerArray.length; count++) {        //выводим значения массива
            System.out.print(integerArray[count] + " ");
        }


    }
}
