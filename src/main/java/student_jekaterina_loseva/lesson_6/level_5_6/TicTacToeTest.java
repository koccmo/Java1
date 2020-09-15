package student_jekaterina_loseva.lesson_6.level_5_6;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.testIsWinPositionForHorizontals1();
        test.testIsWinPositionForHorizontals2();
        test.testIsWinPositionForHorizontals3();
        test.testIsWinPositionForHorizontals4();
        test.testIsWinPositionForHorizontals5();
        test.testIsWinPositionForHorizontals6();
        test.testIsWinPositionForVerticals1();
        test.testIsWinPositionForVerticals2();
        test.testIsWinPositionForVerticals3();
        test.testIsWinPositionForVerticals4();
        test.testIsWinPositionForVerticals5();
        test.testIsWinPositionForVerticals6();
        test.testIsWinPositionForDiagonals1();
        test.testIsWinPositionForDiagonals2();
        test.testIsWinPositionForDiagonals3();
        test.testIsWinPositionForDiagonals4();
        test.testIsWinPosition1();
        test.testIsWinPosition2();
        test.testIsDrawPosition();
        test.testCreateField();

    }

    public void checkResult(String nameOfTest, boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    /* ------------------------------ Task 19 ------------------------------ */
    public void testIsWinPositionForHorizontals1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 1},
                {0, -1, 1},
                {-1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkResult("Test testIsWinPositionForHorizontals 1", isWin);
    }

    public void testIsWinPositionForHorizontals2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 1, 1},
                {-1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkResult("Test testIsWinPositionForHorizontals 2", isWin);
    }

    public void testIsWinPositionForHorizontals3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, -1, 0},
                {1, 1, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkResult("Test testIsWinPositionForHorizontals 3", isWin);
    }

    public void testIsWinPositionForHorizontals4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, 0, 0},
                {0, -1, 1},
                {-1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult("Test testIsWinPositionForHorizontals 4", isWin);
    }

    public void testIsWinPositionForHorizontals5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {-1, 1, 1},
                {0, 0, 0},
                {0, -1, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult("Test testIsWinPositionForHorizontals 5", isWin);
    }

    public void testIsWinPositionForHorizontals6() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {-1, 1, 1},
                {0, -1, 1},
                {0, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult("Test testIsWinPositionForHorizontals 6", isWin);
    }

    /* ------------------------------ Task 20 ---------------------------- */

    public void testIsWinPositionForVerticals1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, -1, 1},
                {1, -1, 1},
                {1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult("Test testIsWinPositionForVerticals1 1", isWin);
    }

    public void testIsWinPositionForVerticals2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, -1},
                {-1, 1, 1},
                {1, 1, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult("Test testIsWinPositionForVerticals1 2", isWin);
    }

    public void testIsWinPositionForVerticals3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, -1, 1},
                {1, -1, 1},
                {1, 0, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult("Test testIsWinPositionForVerticals1 3", isWin);
    }

    public void testIsWinPositionForVerticals4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, -1, 1},
                {0, -1, 1},
                {0, 0, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult("Test testIsWinPositionForVerticals1 4", isWin);
    }

    public void testIsWinPositionForVerticals5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, -1},
                {-1, 0, 1},
                {0, 0, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult("Test testIsWinPositionForVerticals1 5", isWin);
    }

    public void testIsWinPositionForVerticals6() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, -1, 0},
                {-1, 1, 0},
                {1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult("Test testIsWinPositionForVerticals1 6", isWin);
    }

    /* ------------------------------ Task 21 ---------------------------- */

    public void testIsWinPositionForDiagonals1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 1},
                {0, 1, 1},
                {0, 0, 1}
        };
        boolean isWin = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult("Test testIsWinPositionForDiagonals 1", isWin);
    }

    public void testIsWinPositionForDiagonals2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 1},
                {0, 1, 1},
                {1, 0, -1}
        };
        boolean isWin = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult("Test testIsWinPositionForDiagonals 2", isWin);
    }

    public void testIsWinPositionForDiagonals3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, 1, -1},
                {0, 0, 1},
                {1, 0, 0}
        };
        boolean isWin = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkResult("Test testIsWinPositionForDiagonals 3", isWin);
    }

    public void testIsWinPositionForDiagonals4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {-1, 1, 0},
                {0, 0, 1},
                {0, 0, -1}
        };
        boolean isWin = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkResult("Test testIsWinPositionForDiagonals 4", isWin);
    }

    /* ------------------------------ Task 22 ---------------------------- */

    public void testIsWinPosition1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 1},
                {1, 0, -1},
                {0, 0, -1}
        };
        boolean isWin = ticTacToe.isWinPosition(field, 1);
        checkResult("Test testIsWinPosition 1", isWin);
    }

    public void testIsWinPosition2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 0},
                {1, 0, -1},
                {0, 0, -1}
        };
        boolean isWin = ticTacToe.isWinPosition(field, 0);
        checkResult("Test testIsWinPosition 2", isWin);
    }

    /* ------------------------------ Task 23 ---------------------------- */

    public void testIsDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 1, 0}
        };
        boolean isWin = ticTacToe.isDrawPosition(field);
        checkResult("Test testIsDrawPosition", isWin);
    }

    /* ------------------------------ Task 24 ---------------------------- */
    public void testCreateField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        int[][] value = ticTacToe.createField();
        checkResult("Test testCreateField", Arrays.deepEquals(value, field));
    }

}
