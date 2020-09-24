package student_alexey_tretyakov.lesson_13.homework.level_3.task_10_18;

public class GameOfLifeNextGenerationCalculator {


    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] newField = new boolean[currentGeneration.length][currentGeneration[0].length];
         for (int j=0; j <= currentGeneration.length-1; j++) {
            for ( int i=0; i <= currentGeneration[0].length-1; i++) {
                newField[j][i] = updateCell( currentGeneration, i, j);
            }
        }
        return newField;
    }

    private boolean updateCell (boolean[][] currentField, int posX, int posY){
        int countCellIfTrue = counterCellIfTrue( currentField, posX, posY);
        return (countCellIfTrue == 2) || (countCellIfTrue == 3);
    }

    private int counterCellIfTrue(boolean[][] currentField, int posX, int posY) {
        int counterTrue = 0;
         for (int j = Math.max(0,posY-1); j <= Math.min(posY+1, currentField.length-1); j++) {
             for (int i = Math.max(0,posX-1); i <= Math.min(posX+1, currentField[0].length-1); i++){
                 if (currentField[j][i]) {
                     if ( !( (i==posX)&(j==posY))) {
                         counterTrue++;
                     }
                 }
             }
         }
         return counterTrue;
    }

}