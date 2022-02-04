package roman.lesson_6.homework.day_6.task_26;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        int[][] field = ttt.createField(3, 3);
        ttt.printFieldToConsole(field);


    }

    public int[][] createField (int rows ,int column) {
        int[][] field = new int[rows][column];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public void printFieldToConsole (int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (j == field.length - 1) {
                    System.out.print(field[i][j]);
                } else System.out.print(field[i][j] + "|");
            }
            if (i == field.length - 1) {
                System.out.println("");
            } else {
                System.out.println("");
                System.out.print("========");
                System.out.println("");
            }
        }
    }


}
