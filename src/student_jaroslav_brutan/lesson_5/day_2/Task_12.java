package student_jaroslav_brutan.lesson_5.day_2;

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        Random random = new Random();
        randomNumbers[0] = random.nextInt();
        randomNumbers[1] = random.nextInt();
        randomNumbers[2] = random.nextInt();
        System.out.println(randomNumbers[0]);
        System.out.println(randomNumbers[1]);
        System.out.println(randomNumbers[2]);
    }
}
