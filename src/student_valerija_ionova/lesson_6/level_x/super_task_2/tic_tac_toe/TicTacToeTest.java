package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe;

/*Task19
Создать класс TicTacToeTest и написать тесты для разработанного метода.

Task20
метод для определения является ли данная позиция победной по вертикалям для указанного игрока.

Task21
метод для определения является ли данная позиция победной по диагоналям для указанного игрока.

Task22
метод для определения является ли данная позиция победной для указанного игрока.

Task23
метод для определения является ли данная позиция ничейной.

Task24
public int[][] createField(). Метод должен создавать двумерный массив целых чисел
*/

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args){
        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.testIsWinPositionForHorizontalsFalse();
        ticTacToeTest.testIsWinPositionForHorizontalsTrue();
        ticTacToeTest.testIsWinPositionForHorizontalsFalse2();

        ticTacToeTest.testIsWinPositionForVerticalTrue();
        ticTacToeTest.testIsWinPositionForVerticalsFalse();
        ticTacToeTest.testIsWinPositionForVerticalsFalse2();

        ticTacToeTest.testIsWinPositionForDiagonalsTrue();
        ticTacToeTest.testIsWinPositionForDiagonalsFalse();
        ticTacToeTest.testIsWinPositionForDiagonalsTrue2();
        ticTacToeTest.testIsWinPositionForDiagonalsFalse2();

        ticTacToeTest.testIsWinPositionTrue();
        ticTacToeTest.testIsWinPositionFalse();

        ticTacToeTest.testIsDrawTrue();
        ticTacToeTest.testIsDrawFalseNotFullField();
        ticTacToeTest.testIsDrawFalseSomeoneWon();

        ticTacToeTest.testCreateField();
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkArray(String name, int [][] methodsResult, int[][] expectedResult){
        if (Arrays.equals(methodsResult, expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testIsWinPositionForHorizontalsFalse(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForHorizontalsFalse", ticTacToe.isWinPositionForHorizontals(field, 0), false);
    }

    public void testIsWinPositionForHorizontalsTrue(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForHorizontalsTrue", ticTacToe.isWinPositionForHorizontals(field, 0), true);
    }

    public void testIsWinPositionForHorizontalsFalse2(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {0, 0, 1}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForHorizontalsFalse2", ticTacToe.isWinPositionForHorizontals(field, 0), false);
    }

    public void testIsWinPositionForVerticalsFalse(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForVerticalsFalse", ticTacToe.isWinPositionForVerticals(field, 0), false);
    }

    public void testIsWinPositionForVerticalTrue(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, -1, -1}, {1, 0, 0}, {1, -1, -1}};
        checkBoolean("testisWinPositionForVerticalsTrue", ticTacToe.isWinPositionForVerticals(field, 1), true);
    }

    public void testIsWinPositionForVerticalsFalse2(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 1, 1}, {1, 0, 1}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForVerticalsFalse2", ticTacToe.isWinPositionForVerticals(field, 1), false);
    }

    public void testIsWinPositionForDiagonalsTrue(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, -1, -1}, {1, 1, 0}, {1, -1, 1}};
        checkBoolean("testisWinPositionForDiagonalsTrue", ticTacToe.isWinPositionForDiagonals(field, 1), true);
    }

    public void testIsWinPositionForDiagonalsFalse(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0, 1, 1}, {1, 0, 1}, {-1, -1, 0}};
        checkBoolean("testisWinPositionForDiagonalsFalse", ticTacToe.isWinPositionForDiagonals(field, 1), false);
    }

    public void testIsWinPositionForDiagonalsTrue2(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, -1, 0}, {1, 0, 0}, {0, -1, -1}};
        checkBoolean("testisWinPositionForDiagonalsTrue2", ticTacToe.isWinPositionForDiagonals(field, 0), true);
    }

    public void testIsWinPositionForDiagonalsFalse2(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 1, 1}, {1, 0, 1}, {-1, -1, -1}};
        checkBoolean("testisWinPositionForDiagonalsFalse2", ticTacToe.isWinPositionForDiagonals(field, 1), false);
    }

    public void testIsWinPositionTrue(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 1, 1}, {1, 0, 1}, {-1, -1, 1}};
        checkBoolean("testIsWinPositionTrue", ticTacToe.isWinPosition(field, 1), true);
    }

    public void testIsWinPositionFalse(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 1, 1}, {1, 0, 1}, {-1, -1, 1}};
        checkBoolean("testIsWinPositionFalse", ticTacToe.isWinPosition(field, 0), false);
    }

    public void testIsDrawTrue(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 0, 1}, {0, 1, 0}, {0, 1, 0}};
        checkBoolean("Test isDrawTrue", ticTacToe.isDrawPosition(field), true);
    }

    public void testIsDrawFalseNotFullField(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, -1, 1}, {0, 1, 0}, {0, 1, 0}};
        checkBoolean("Test isDrawFalseNotFullField", ticTacToe.isDrawPosition(field), false);
    }

    public void testIsDrawFalseSomeoneWon(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        checkBoolean("Test isDrawFalseSomeoneWon", ticTacToe.isDrawPosition(field), false);
    }

    public void testCreateField(){
        TicTacToe ticTacToe = new TicTacToe();
        boolean answer = true;
        int[][]field = ticTacToe.createField();
        for(int i=0; i<3; i++){
            for (int j = 0; j< 3; j++){
                if (field[i][j] != -1){
                    answer = false;
                }
            }
        }
        checkBoolean("testCreateField", answer, true);
        //ticTacToe.printFieldToConsole(field);
    }



}
