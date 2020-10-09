package student_volodya_danilin.lesson_13.level_3;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] result = currentGeneration;

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {

                //ПРАВИЛО 1
                if (result[row][col] && countAliveNeighbours(result, row, col) < 2) {
                    result[row][col] = false;
                }

                //ПРАВИЛО 2
                if (result[row][col] && countAliveNeighbours(result, row, col) > 3) {
                    result[row][col] = false;
                }

                //ПРАВИЛО 3
                if (result[row][col]) {
                    if (countAliveNeighbours(result, row, col) == 2
                    || countAliveNeighbours(result, row, col) == 3) {
                        result[row][col] = true;
                    }
                }

                //ПРАВИЛО 4
                if (!result[row][col]) {
                    if (countAliveNeighbours(result, row, col) == 3) {
                        result[row][col] = true;
                    }
                }
            }
        }
        return result;
    }

    int countAliveNeighbours(boolean[][] field, int row, int col) {
        int aliveCounter = 0;
        if (isUpNeighbourAlive(field,row,col)) {
            aliveCounter++;
        }
        if (isDownNeighbourAlive(field,row,col)) {
            aliveCounter++;
        }
        if (isLeftNeighbourAlive(field,row,col)) {
            aliveCounter++;
        }
        if (isRightNeighbourAlive(field,row,col)) {
            aliveCounter++;
        }
        if (isUpLeftNeighbourAlive(field, row, col)) {
            aliveCounter++;
        }
        if (isUpRightNeighbourAlive(field, row, col)) {
            aliveCounter++;
        }
        if (isDownLeftNeighbourAlive(field, row, col)) {
            aliveCounter++;
        }
        if (isDownRightNeighbourAlive(field, row, col)) {
            aliveCounter++;
        }
        return aliveCounter;
    }

   boolean isUpNeighbourAlive(boolean[][] field, int row, int col) {
        boolean result = false;
        try {
            if (field[row-1][col]) {
                result = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            result = false;
        }
        return result;
   }

   boolean isDownNeighbourAlive(boolean[][] field, int row, int col) {
        boolean result = false;
        try {
            if (field[row+1][col]) {
                result = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            result = false;
        }
        return result;
   }

   boolean isLeftNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row][col-1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

   boolean isRightNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row][col+1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

   boolean isUpLeftNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row-1][col-1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

   boolean isUpRightNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row-1][col+1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

   boolean isDownLeftNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row+1][col-1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

   boolean isDownRightNeighbourAlive(boolean[][] field, int row, int col) {
       boolean result = false;
       try {
           if (field[row+1][col+1]) {
               result = true;
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           result = false;
       }
       return result;
   }

}
