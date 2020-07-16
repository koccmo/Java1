package student_volodya_danilin.lesson_5.level_2;

import java.text.DecimalFormat;
import java.util.Random;

public class Task_14 {

    public static void main(String[] Args) {

        Random randomNumber = new Random();
        int[] integerArray = new int[3];

        for (int i = 0; i < integerArray.length; i++) {         // заполнение массива random'ом
            integerArray[i] = randomNumber.nextInt(15);
            System.out.println("Array slot" + i + " is " + integerArray[i]);
        }

        int arraySum = 0;
        for (int i = 0; i < integerArray.length; i++) {         // вычисление суммы массива
            arraySum = arraySum + integerArray[i];
            if (i < (integerArray.length - 1)) {
                System.out.print("(" + integerArray[i] + ") + ");
            } else {
                System.out.print("(" + integerArray[i] + ")");
            }

        }
        System.out.print(" = " + arraySum);

        double arrayAverage = ((double)arraySum / integerArray.length);
        System.out.println("\nAverage is: " + arrayAverage);
    }
}
