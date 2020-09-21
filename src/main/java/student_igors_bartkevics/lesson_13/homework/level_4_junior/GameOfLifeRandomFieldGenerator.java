package student_igors_bartkevics.lesson_13.homework.level_4_junior;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] field = new boolean[fieldWidth][fieldHeight];
        var random = new Random();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j ++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return  field;
    }

}
