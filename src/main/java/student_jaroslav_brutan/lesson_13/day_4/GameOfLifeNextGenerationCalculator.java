package student_jaroslav_brutan.lesson_13.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeNextGenerationCalculator {

    public boolean [][] calculate(boolean[][] currentGeneration){
        boolean[][] newCreatedField = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int j = 0; j < currentGeneration.length; j++){
            for (int i = 0; i < currentGeneration[0].length; i ++){
                newCreatedField[j][i] = updateTheCell(currentGeneration, i, j);
            }
        }
        return newCreatedField;
    }

    private boolean updateTheCell(boolean[][] currentGeneration, int i, int j){
        int neighbours = neighbours(currentGeneration, i, j);
        if (currentGeneration[j][i]){
            if ((neighbours == 2) || (neighbours == 3)){
                return true;
            } else {
                return false;
            }
        }
        if (neighbours == 3){
            return true;
        } else {
            return false;
        }
    }

    private int neighbours(boolean[][] currentGeneration, int i, int j){
        int count = 0;
        for (int x = Math.max(0, (j-1)); x <= Math.min((j+1), (currentGeneration.length-1)); x++){
            for (int y = Math.max(0, (i-1)); y <= Math.min((i+1),(currentGeneration[0].length-1)); y++){
                count = updateCount(currentGeneration, x, y, i, j, count);
            }
        }
        return count;
    }

    private int updateCount(boolean[][] currentGeneration, int i, int j, int x, int y, int count){
        if (!((x==j) && (i==y))){
            if (currentGeneration[x][y]){
                count++;
            }
        }
        return count;
    }
}
