package student_anvars_intezars.home_tasks.lesson_13.level_3;

class GameOfLifeNextGenerationCalculator {

    boolean[][] field;
    int rows = field.length;
    int columns = field[0].length;
    boolean[][] newField = new boolean[rows][columns];

    public boolean[][] calculate(boolean[][] currentGeneration) {
        return null;
    }

   /* public boolean isOneCellHavingTwoLiveNeighbours(boolean[][] array) {
        boolean [][] copyOfArray = createArrayCopy(array);
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array)
            }
        }
        return false;
    }*/

    public boolean[][] createArrayCopy(boolean[][] array) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                newField[row][col] = array[row][col];
            }
        }
        return newField;
    }

  }
