package student_volodya_danilin.lesson_5.level_2;

import java.util.Random;

public class Task_12 {

    public static void main(String [] Args) {

        int[] integerArray = new int[3];
        Random randomNumber = new Random();

        for (int i = 0; i < integerArray.length; i++) {      //заполнение массива
            integerArray[i] = randomNumber.nextInt();
        }

        for (int i = 0; i <integerArray.length; i++) {       //вывод массива
            System.out.println(integerArray[i]);
        }
    }
}
