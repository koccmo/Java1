package student_anvars_intezars.home_tasks.lesson_5.day_2;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10);
            randomNumbers[i] = randomNumber;
            System.out.println("[" + i + "] = " + randomNumbers[i]);
        }
            System.out.println();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomNumbers[i] + 2;
            System.out.println("[" + i + "] = " + randomNumbers[i]);
        }
    }
}
