package student_georgij_galin.lesson5.level_4;

import java.util.Random;

public class task_30 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + array[i]);
        }
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
