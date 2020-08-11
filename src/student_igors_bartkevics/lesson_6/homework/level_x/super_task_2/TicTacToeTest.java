/*
Создать простой искуственный интеллект (компьютерного игрока)
для игры в крестики нолики из day_5 и day_6.
Искусственный интеллект можно реализовать
так, что он будет выбирать рандомную пустую клетку
и ходить в неё. А можно научить компьютер распознавать
выигрышные комбинации в один ход и выигрывать, а
так же защищаться от проигрыша в один ход если это
возможно.
 */

package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

import java.util.Arrays;

public class TicTacToeTest {

/*
    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontals();
        test.winPositionForVerticals();
        test.winPositionForDiagonals();
        test.winPositionForPlayer();
        test.fieldIsFilled();
        test.drawPosition();
        test.createField();
        test.getAINextRandomMove();
        test.verticalChanceToWin();
        test.moveForVerticalWin();
        test.horizontalChanceToWin();
        test.moveForHorizontalWin();
        test.diagonal_1_ChanceToWin();
        test.diagonal_2_ChanceToWin();
        test.moveForDiagonal_1_Win();
        test.moveForDiagonal_2_Win();
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void diagonal_2_ChanceToWin() {
        int[][] field = {   {  0,  1,  1},
                            {  0,  1,  0},
                            { -1,  0,  1}};
        checkResult(ticTacToe.isDiagonal_2_ChanceToWin(field, 1), "Diagonal 2 chance to win");
    }

    public void diagonal_1_ChanceToWin() {
        int[][] field = {   {-1,  1,  1},
                            { 0,  1,  0},
                            { 0,  0,  1}};
        checkResult(ticTacToe.isDiagonal_1_ChanceToWin(field,1), "Diagonal 1 chance to win");
    }

    public void moveForDiagonal_2_Win() {
        int[][] field1 = {{1, 0, -1},
                          {0, 1, -1},
                          {1, 0, -1}};
        Move moveToWin1 = ticTacToe.moveForDiagonal_2_Win(field1, 1);
        boolean condition1 = (moveToWin1.getX() == 0) &&
                (moveToWin1.getY() == 2);
        checkResult(condition1, "Move for diagonal 2 win");

        int[][] field2 = {{1,  0,  1},
                          {0, -1, -1},
                          {1,  0, 1}};
        Move moveToWin2 = ticTacToe.moveForDiagonal_2_Win(field2,1);
        boolean condition2 = (moveToWin2.getX() == 1) &&
                (moveToWin2.getY() == 1);
        checkResult(condition2, "Move for diagonal 2 win");

        int[][] field3 = {{-1, 0,  1},
                          { 1, 1, -1},
                          {-1, 0,  0}};
        Move moveToWin3 = ticTacToe.moveForDiagonal_2_Win(field3,1);
        boolean condition3 = (moveToWin3.getX() == 2) &&
                (moveToWin3.getY() == 0);
        checkResult(condition3, "Move for diagonal 2 win");
    }

    public void moveForDiagonal_1_Win() {
        int[][] field1 = {{1,  0, -1},
                          {1,  1, -1},
                          {0,  0, -1}};
        Move moveToWin1 = ticTacToe.moveForDiagonal_1_Win(field1,1);
        boolean condition1 = (moveToWin1.getX() == 2) &&
                (moveToWin1.getY() == 2);
        checkResult(condition1, "Move for diagonal 1 win");

        int[][] field2 = {{1,  0, -1},
                          {1, -1, -1},
                          {0,  0,  1}};
        Move moveToWin2 = ticTacToe.moveForDiagonal_1_Win(field2,1);
        boolean condition2 = (moveToWin2.getX() == 1) &&
                (moveToWin2.getY() == 1);
        checkResult(condition2, "Move for diagonal 1 win");

        int[][] field3 = {{-1,  0, -1},
                          { 1,  1, -1},
                          { 0,  0,  1}};
        Move moveToWin3 = ticTacToe.moveForDiagonal_1_Win(field3,1);
        boolean condition3 = (moveToWin3.getX() == 0) &&
                (moveToWin3.getY() == 0);
        checkResult(condition3, "Move for diagonal 1 win");

    }

    public void moveForHorizontalWin() {
        int[][] field = {{1,  1, -1},
                         {1,  0, -1},
                         {0,  0, -1}};
        Move moveToWin = ticTacToe.moveForHorizontalWin(field,1);
        boolean condition = (moveToWin.getX() == 0) &&
                (moveToWin.getY() == 2);
        checkResult(condition, "Move for horizontal win");
    }

    public void horizontalChanceToWin() {
        int[][] field = {   {-1,  1,  1},
                            { 0,  0, -1},
                            {-1, -1,  0}};
        checkResult(ticTacToe.isHorizontalChanceToWin(field,1), "Horizontal chance To win");
    }

    public void moveForVerticalWin() {
        int[][] field = {   { 1, 1, 0},
                            { 1, 0, 0},
                            {-1, 0,-1}};
        boolean condition = (ticTacToe.moveForVerticalWin(field,1).getX() == 2) &&
                (ticTacToe.moveForVerticalWin(field,1).getY() == 0);
        checkResult(condition, "Move for vertical win");
    }

    public void verticalChanceToWin() {
        int[][] field = {   { 0, -1,  1},
                            { 0,  0,  1},
                            {-1,  0, -1}};
        checkResult(ticTacToe.isVerticalChanceToWin(field,1), "Vertical chance To win");
    }

    public void getAINextRandomMove() {
        int[][] field = {   {1, 1, 1},
                            {1, 1, 1},
                            {1, -1, 1}};
        Move move = ticTacToe.getAINextRandomMove(field);
        boolean condition = field[move.getX()][move.getY()] == -1;
        checkResult(condition, "Get AI next random move");
    }

    public void createField() {
        int[][] emptyField = {   {-1, -1, -1},
                                 {-1, -1, -1},    //empty field
                                 {-1, -1, -1}};

        int[][] notEmptyField = {   {-1, -1, -1},
                                    {-1,  0, -1},    // NOT empty field
                                    {-1, -1, -1}};

        int [][] field = ticTacToe.createField();
        boolean condition = Arrays.deepEquals(emptyField,field) &&
                           !Arrays.deepEquals(notEmptyField,field);
        checkResult(condition, "Create field");
    }

	public int[][] createField() {
		int[][] field = new int[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				field[row][column] = -1;
			}
		}
		return field;
	}


	public void drawPosition() {
        int[][] field1 = {   {-1,  1,  0},
                             { 1,  0,  0},    //not filled
                             { 1,  0,  1}};

        int[][] field2 = {   { 0,  1,  0},
                             { 1,  0,  0},    //draw position
                             { 1,  0,  1}};

        int[][] field3 = {   { 1,  1,  0},
                             { 1,  0,  0},    //filled and "0" won
                             { 0,  0,  1}};

        int[][] field4 = {   { 1,  1,  1},
                             { 1,  0,  0},    //filled and "1" won
                             { 0,  0,  1}};

        int[][] field5 = {   { 1,  1,  0},
                             { 1,  0,  0},    //not filled and "0" won
                             { 0, -1,  1}};

        int[][] field6 = {   { 1,  1,  0},
                             {-1,  1,  0},    //not filled and "1" won
                             { 0,  0,  1}};

        boolean condition =
                !ticTacToe.isDrawPosition(field1) &&
                ticTacToe.isDrawPosition(field2) &&
                !ticTacToe.isDrawPosition(field3) &&
                !ticTacToe.isDrawPosition(field4) &&
                !ticTacToe.isDrawPosition(field5) &&
                !ticTacToe.isDrawPosition(field6);


        checkResult(condition, "Draw position");
    }

    public void fieldIsFilled() {
        int[][] field = {    { 1,  1,  0},
                             { 1,  0,  0},
                             { 0,  0,  1}};

        boolean condition = ticTacToe.isFieldFilled(field);

        checkResult(condition, "Field is filled");
    }

    public void winPositionForPlayer() {
        int[][] field1 = {   { 1,  1,  1},
                             {-1,  0,  0},
                             { 0, -1, -1}};

        int[][] field2 = {   { 0,  0, 1},
                             { 1,  1, 1},
                             {-1, -1, 0}};

        int[][] field3 = {   {-1,  0, -1},
                             { 0, -1,  0},
                             { 1,  1,  1}};

        int[][] field4 = {    {0,  1, -1},
                              {0,  1,  1},
                              {0, -1, -1}};

        int[][] field5 = {    {1,   0, -1},
                              {1,   0,  1},
                              {-1,  0,  1}};

        int[][] field6 = {    {1,  1, 0},
                              {0,  1, 0},
                              {1, -1, 0}};

        int[][] field7 = {   { 0,  1,  1},
                             {-1,  0,  1},
                             { 1, -1,  0}};

        int[][] field8 = {   { 1,  1,  0},
                             {-1,  0,  1},
                             { 0, -1,  1}};

        boolean condition =
                ticTacToe.isWinPosition(field1, 1) &&
                ticTacToe.isWinPosition(field2, 1) &&
                ticTacToe.isWinPosition(field3, 1) &&
                ticTacToe.isWinPosition(field4, 0) &&
                ticTacToe.isWinPosition(field5, 0) &&
                ticTacToe.isWinPosition(field6, 0) &&
                ticTacToe.isWinPosition(field7, 0) &&
                ticTacToe.isWinPosition(field8, 0);
        checkResult(condition, "Win position");
    }

    public void winPositionForDiagonals() {

        int[][] field1 = {   { 0,  1,  1},
                             {-1,  0,  1},
                             { 1, -1,  0}};

        int[][] field2 = {   { 1,  1,  0},
                             {-1,  0,  1},
                             { 0, -1,  1}};

                boolean condition = ticTacToe.isWinPositionForDiagonals(field1, 0) && ticTacToe.isWinPositionForDiagonals(field2, 0);
        checkResult(condition, "Win position for diagonals");
    }

    public void winPositionForVerticals() {
        int[][] field1 = {    {0,  1, -1},
                              {0,  1,  1},
                              {0, -1, -1}};

        int[][] field2 = {    {1,   0, -1},
                              {1,   0,  1},
                              {-1,  0,  1}};

        int[][] field3 = {    {1,  1, 0},
                              {0,  1, 0},
                              {1, -1, 0}};

        boolean condition = ticTacToe.isWinPositionForVerticals(field1, 0) &&
                            ticTacToe.isWinPositionForVerticals(field2, 0) &&
                            ticTacToe.isWinPositionForVerticals(field3, 0);
        checkResult(condition, "Win position for verticals");
    }

    public void winPositionForHorizontals() {
        int[][] field1 = {   { 1,  1,  1},
                             {-1,  0,  0},
                             { 0, -1, -1}};

        int[][] field2 = {   { 0,  0, 1},
                             { 1,  1, 1},
                             {-1, -1, 0}};

        int[][] field3 = {   {-1,  0, -1},
                             { 0, -1,  0},
                             { 1,  1,  1}};

        boolean condition = ticTacToe.isWinPositionForHorizontals(field1, 1) &&
                            ticTacToe.isWinPositionForHorizontals(field2, 1) &&
                            ticTacToe.isWinPositionForHorizontals(field3, 1);

        checkResult((condition), "Win position for horizontals");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
*/
}
