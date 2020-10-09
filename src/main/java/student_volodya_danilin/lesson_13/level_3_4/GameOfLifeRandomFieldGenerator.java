package student_volodya_danilin.lesson_13.level_3_4;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    boolean[][] generateRandomField(int row, int col) {
        boolean[][] result = new boolean[row][col];
        Random random = new Random();
        for (int loopRow = 0; loopRow < result.length; loopRow++) {
            for (int loopCol = 0; loopCol < result[0].length; loopCol++) {
                result[loopRow][loopCol] = random.nextBoolean();
            }
        }
        return result;
    }
}
