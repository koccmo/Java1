package roman.lesson_6.homework.day_6.task_24;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.shouldCreateTicTacToeFieldEmpty();
    }

    TicTacToe ticTac = new TicTacToe();

    public void checkResult (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else System.out.println(nameOfTest + " Test - Fail");
    }

    public void shouldCreateTicTacToeFieldEmpty () {
        int[][] field = { {-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1} };
        int[][] checkField = ticTac.createField();
        String nameOfTest = "Check if field fill up with empty singh (-1) -";
        checkResult(checkIfFieldEmpty(field) == checkIfFieldEmpty(checkField), nameOfTest);
    }

    public boolean checkIfFieldEmpty (int[][] field) {
        boolean result = true;
        for (int[] row : field) {
            for (int valueInt : row) {
                if (valueInt != -1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
