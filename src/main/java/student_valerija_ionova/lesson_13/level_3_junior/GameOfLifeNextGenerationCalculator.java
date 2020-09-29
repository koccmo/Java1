package student_valerija_ionova.lesson_13.level_3_junior;

//Task10
//Task11 Rule1 Правило 1: Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean [][] newField = new boolean [currentGeneration.length][currentGeneration[0].length];
        for (int y = 0; y < currentGeneration.length; y++){
            for (int x = 0; x < currentGeneration[0].length; x++){
                newField[y][x] = updateCell(currentGeneration, x, y);
            }
        }
        return newField;
    }

    private boolean updateCell(boolean[][] currentGeneration, int x, int y){
        int neighborsTrue = neighborsTrue(currentGeneration, x, y);
        if (currentGeneration[y][x]){
            return ((neighborsTrue == 2) || (neighborsTrue == 3));
        }
        return (neighborsTrue == 3);
    }

    private int neighborsTrue(boolean[][] currentGeneration, int x, int y){
        int trueCount = 0;
        for (int i = Math.max(0, (y-1)); i <= Math.min((y+1), (currentGeneration.length-1)); i++){
            for (int j = Math.max(0, (x-1)); j <= Math.min((x+1), (currentGeneration[0].length-1)); j++){
                trueCount = updateTrueCount(currentGeneration, i, y, j, x, trueCount);
            }
        }
        return trueCount;
    }

    private int updateTrueCount (boolean[][] currentGeneration, int i, int y, int j, int x, int trueCount){
        if (!((i==y) && (j==x))) {
            if (currentGeneration[i][j]) {
                trueCount++;
            }
        }
        return trueCount;
    }

}