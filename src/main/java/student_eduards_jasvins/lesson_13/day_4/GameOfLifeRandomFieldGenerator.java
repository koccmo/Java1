package student_eduards_jasvins.lesson_13.day_4;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] field = new boolean[fieldWidth][fieldHeight];
        var random = new Random();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }

}
