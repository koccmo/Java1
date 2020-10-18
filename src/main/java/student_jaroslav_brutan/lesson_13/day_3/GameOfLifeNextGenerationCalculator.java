package student_jaroslav_brutan.lesson_13.day_3;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] field = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int j = 0; j < currentGeneration.length-1; j++) {
            for (int i = 0; i < currentGeneration[0].length-1; i++) {
                field[j][i] = updateTheCell(currentGeneration, i, j);
            }
        }
        return field;
    }

    private boolean updateTheCell(boolean[][] currentField, int a, int b){
        int trueCell = reallyTrueCell( currentField, a, b);
        return (trueCell == 2) || (trueCell == 3);
    }

    private int reallyTrueCell(boolean[][] currentField, int a, int b){
        int counterTrue = 0;
        for (int j = Math.max(0, b-1); j <= Math.min(b+1, currentField.length-1); j++){
            for (int i = Math.max(0, a-1); i <= Math.min(a+1, currentField[0].length-1); i++){
                if (currentField[j][i]){
                    if (!((i==a) & (j==b))){
                        counterTrue++;
                    }
                }
            }
        }
        return counterTrue;
    }

}