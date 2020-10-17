package student_anvars_intezars.home_tasks.lesson_13.level_3;

class GameOfLifeNextGenerationCalculator {

    boolean[][] field;
    int rows = field.length;
    int columns = field[0].length;
    boolean[][] newField = new boolean[rows][columns];

    public boolean[][] calculate(boolean[][] currentGeneration) {
        return null;
    }

   /*public boolean isOneCellHavingTwoLiveNeighbours(boolean[][] array) {

    }

    */

    public boolean[][] createArrayCopy(boolean[][] array) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                newField[row][col] = array[row][col];
            }
        }
        return newField;
    }

    public void setAliveCell(int x, int y) {
        this.field[x][y] = true;
    }

    public void setDeadCell(int x, int y) {
        this.field[x][y] = false;
    }

   /* public int countAliveNeighbours(int x, int y) {
        int count = 0;
        count += this.field[x - 1][y - 1];
        return count;
    }
    */

  }
