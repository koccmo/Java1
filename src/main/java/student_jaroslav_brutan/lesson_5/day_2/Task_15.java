package student_jaroslav_brutan.lesson_5.day_2;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[3];
        for (int i = 0;i < randomNumbers.length;i++){
            randomNumbers[i] = random.nextInt(20);
            System.out.println("[" + i + "] = " + randomNumbers[i]);
        }
        for (int i = 0;i < randomNumbers.length;i++){
            randomNumbers[i] = randomNumbers[i] + 2;
            System.out.println("[" + i + "] = " + randomNumbers[i]);
        }
    }

}
