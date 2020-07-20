package student_dmitrijs_jasvins.lesson_6.day_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {

    public void fillTwoDimensionalArrayWithRandomNumber(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
    }

    public int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
