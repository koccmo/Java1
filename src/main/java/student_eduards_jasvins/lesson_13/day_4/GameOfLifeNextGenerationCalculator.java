package student_eduards_jasvins.lesson_13.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] newField = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int i = 0; i <= currentGeneration.length-1; i++) {
            for (int j = 0; j <= currentGeneration.length-1; j++) {
                newField[i][j] = newCell(currentGeneration, i, j);
            }
        }
        return newField;
    }

    private boolean newCell(boolean[][] currentField, int positionX, int positionY) {
        int countCellIfTrue = counterCellIfTrue(currentField, positionX, positionY);
        return (countCellIfTrue == 2) || (countCellIfTrue == 3);
    }

    private int counterCellIfTrue(boolean[][] currentField, int positionX, int positionY) {
        int counterTrue = 0;
        for (int i = Math.max(0, positionX - 1); i <= Math.min(positionX + 1, currentField.length - 1); i++) {
            for (int j = Math.max(0, positionY - 1); j <= Math.min(positionY + 1, currentField[0].length - 1); j++) {
                if (currentField[i][j]) {
                    if (! (i == positionX) & (j == positionY)) {
                        counterTrue++;

                    }
                }
            }
        }
        return counterTrue;
    }
}
