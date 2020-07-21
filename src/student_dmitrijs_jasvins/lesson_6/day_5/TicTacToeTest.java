package student_dmitrijs_jasvins.lesson_6.day_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.winningPositionForHorizontal();
        ticTacToeTest.winningPositionForVerticals();
        ticTacToeTest.winningPositionForDiagonals();
        ticTacToeTest.winningPosition();
        ticTacToeTest.drawPosition();
    }

    private void winningPositionForHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        boolean winPosition = ticTacToe.isWinPositionForHorizontals(field, 1);
        if (winPosition) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void winningPositionForVerticals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, 1, 0},
                {0, 1, 1},
                {0, 1, 0}
        };
        boolean winPosition = ticTacToe.isWinPositionForVerticals(field, 0);
        if (winPosition) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void winningPositionForDiagonals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 0},
                {0, 1, 1},
                {0, 1, 1}
        };
        boolean winPosition = ticTacToe.isWinPositionForDiagonals(field, 1);
        if (winPosition) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void winningPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1}
        };
        boolean winPosition = ticTacToe.isWinningPosition(field, 0);
        if (winPosition) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    private void drawPosition(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 1, 1}
        };
        boolean drawPosition = ticTacToe.isDrawPosition(field);
        if(drawPosition){
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
