package roman.lesson_6.homework.day_5.task_19;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest check = new TicTacToeTest();
        check.shouldIsWinPositionForHorizontals();
        check.shouldIsWinPositionForVerticals();
        check.shouldIsWinPositionForDiagonals();
    }

    TicTacToe test = new TicTacToe();

    public void checkResult (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test - OK!");
        }
        else System.out.println(nameOfTest + " Test - False!");
    }

    public void shouldIsWinPositionForHorizontals () {
        int[][] field = { {1, 1, 0}, {1, 0, 1}, {1, 1, 1} };
        String nameOfTest = "Check horizontal position to win with number 1!";
        boolean condition = test.isWinPositionForHorizontals(field, 1);
        checkResult(condition, nameOfTest);
    }

    public void shouldIsWinPositionForVerticals () {
        int[][] field = { {1, 0, 1}, {1, 1, 0}, {1, 0, 1}};
        boolean condition = test.isWinPositionForVerticals(field, 1);
        String nameOfTest = "Check vertical position to win with number 1!";
        checkResult(condition, nameOfTest);
    }

    public void shouldIsWinPositionForDiagonals () {
        int[][] field = { {1, 0, 1}, {0, 1, 0}, {1, 0, 0} };
        String nameOfTest = "Diagonal position to win";
        boolean condition = test.isWinPositionForDiagonals(field, 1);
        checkResult(condition, nameOfTest);
    }
}
