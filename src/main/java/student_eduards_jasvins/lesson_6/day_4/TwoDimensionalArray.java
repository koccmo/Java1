package student_eduards_jasvins.lesson_6.day_4;

import java.util.Random;

public class TwoDimensionalArray {

    public void fillDimensionalArrayWithRandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(25);

            }
        }
    }

    public int sumDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
