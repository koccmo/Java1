package student_volodya_danilin.lesson_5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] Args) {

        Random randomNumber = new Random();
        int[] integerArray = new int[3];

        System.out.println("Filling array with random integers...");         // заполнение массива random'ом
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = randomNumber.nextInt(15);
            System.out.println("Array slot" + i + " is " + integerArray[i]);
        }

        System.out.println("\nInceasing each cell by 2");
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = integerArray[i] + 2;
            System.out.println("Array slot" + i + " is " + integerArray[i]);
        }

    }
}
