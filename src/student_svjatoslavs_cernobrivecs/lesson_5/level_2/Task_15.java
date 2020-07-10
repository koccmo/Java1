package student_svjatoslavs_cernobrivecs.lesson_5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(20);
            System.out.println("Random numbers: " + numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("Random numbers with + 2: " + numbers[i]);
        }
    }
}
