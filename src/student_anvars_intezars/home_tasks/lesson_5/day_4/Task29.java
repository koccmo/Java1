package student_anvars_intezars.home_tasks.lesson_5.day_4;

import java.util.Random;

public class Task29 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(10);
            array[i] = randomNumber;
            System.out.println("[" + i + "] = " + array[i]);
        }
        System.out.println();
        System.out.println("Below are numbers of the array, which are even: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 ==0) {
                System.out.println("[" + i + "] = " + array[i]);
            }
        }
    }
}
