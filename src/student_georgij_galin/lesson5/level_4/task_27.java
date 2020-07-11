package student_georgij_galin.lesson5.level_4;

import java.util.Random;

public class task_27 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("The largest array is : " + max);
    }

}
