package roman.lesson_6.homework.day_6.task_24;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();
        int[][] field = test.createField();
        test.printField(field);
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return  field;
    }

    public void printField (int[][] field) {
        for (int[] row : field) {
            for (int valueInt : row) {
                System.out.print(valueInt);
            }
            System.out.println("");
        }
    }
}
