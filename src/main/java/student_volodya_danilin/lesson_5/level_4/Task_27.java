package student_volodya_danilin.lesson_5.level_4;

import java.util.Random;

public class Task_27 {

    public static void main(String[] Args) {

        Random randomNumber = new Random();

        int[] randomArray = new int[randomNumber.nextInt(16)];
        System.out.println("Array length is: " + randomArray.length);

        System.out.print("Array data is: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(100);
            System.out.print(randomArray[i] + " ");
        }

        int maxArrayNumber = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > maxArrayNumber) {
                maxArrayNumber = randomArray[i];
            }
        }
        System.out.print("\nMax number in this array is: " + maxArrayNumber);

    }
}
