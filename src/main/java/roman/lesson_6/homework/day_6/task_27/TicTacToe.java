package roman.lesson_6.homework.day_6.task_27;




import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }



    public void play () {
        int[][] field = createField();
        while(true) {
            printField(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printField(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Win Player 0!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("It Draw!!!");
                break;
            }
//            printField(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            //printField(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Win Player 1!!!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("It is DRAW!!!");
                break;
            }
        }
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean check = false;
        for (int[] i : field) {
            if ((i[0] == i[1]) && (i[1] == i[2]) && (i[2] == playerToCheck)) {
                check = true;
                break;
            }
        }
        return check;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean check = false;
        for (int i = 0; i < field[0].length; i++) {
            if ((field[0][i] == field[1][i]) && (field[1][i] == field[2][i]) && (field[2][i] == playerToCheck) ) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean check = (field[1][1] == playerToCheck) && (((field[0][0] == field[1][1]) && (field[1][1] == field[2][2]))
                || ((field[0][2] == field[1][1]) && (field[1][1] == field[2][0])));
        return check;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field){
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.fieldFilled(field) && !ticTacToe.isWinPosition(field, 1)
                && !ticTacToe.isWinPosition(field, 0);
    }

    public boolean fieldFilled (int[][] field) {
        boolean result = true;
        for (int[] row : field) {
            for (int valueInt : row) {
                if (valueInt == -1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public void printField (int[][] field) {
        for (int[] row : field) {
            for (int valueInt : row) {
                System.out.print(valueInt + " ");
            }
            System.out.println("");
        }
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

    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first coordinate of your move - ");
        int x = sc.nextInt();
        System.out.println("Enter second coordinate of your move - ");
        int y = sc.nextInt();
        return new Move(x, y);
    }
}
