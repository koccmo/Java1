package student_roberts_kupcs.lesson_6.homework.level_5;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testHorizontal();
        ticTacToeTest.testVertical();
    }

    public void testHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 0, 0}, {1, 1, 1}, {0, 1, 0}};

        if (ticTacToe.isWinPositionForHorizontals(field, 1)) {
            System.out.println("Horizontal test is OK");
        } else {
            System.out.println("Horizontal test is FAIL");
        }
    }

    public void testVertical() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1}, {0, 1, 0}, {0, 0, 1}};
        if (ticTacToe.isWinPositionForVerticals(field, 0)) {
            System.out.println("Vertical test is OK");
        } else {
            System.out.println("Vertical test is FAIL");
        }
    }
}
