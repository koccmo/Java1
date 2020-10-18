package student_anvars_intezars.home_tasks.lesson_13.level_3;

class GameOfLifeNextGenerationCalculator {

    boolean[][] field;
    int rows = field.length;
    int columns = field[0].length;
    //boolean[][] newField = new boolean[rows][columns];

    public boolean[][] calculate(boolean[][] currentGeneration) {
        return null;
    }

   public boolean isOneCellHavingTwoLiveNeighbours(boolean [][] field) {
        int rows = field.length;
        int columns = field[0].length;
        int numberOfAliveCells = countAliveNeighbours(field,rows,columns);
                if (numberOfAliveCells < 2) {
                    return false;
           } else {
                    return true;
       }
    }



   /* public boolean[][] createArrayCopy(boolean[][] array) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                newField[row][col] = array[row][col];
            }
        }
        return newField;
    }*/


   public int countAliveNeighbours(boolean[][] field, int rows, int columns) {
        int count = 0;
        int x = -1;
        while (x <= 1) {
            int y = -1;
            while(y <= 1) {
                if (field[rows][columns]) {
                    count++;
                }
            }
        }

       return count;
   }

  }
