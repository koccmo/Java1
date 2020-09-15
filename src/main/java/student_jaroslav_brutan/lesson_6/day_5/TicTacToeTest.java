package student_jaroslav_brutan.lesson_6.day_5;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.firstHorizontalTest();
        test.secondHorizontalTest();
        test.thirdHorizontalTest();
        test.firstVerticalTest();
        test.secondVerticalTest();
        test.thirdVerticalTest();
        test.firstDiagonalTest();
        test.secondDiagonalTest();
    }

    public void firstHorizontalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{1, 1, 1}, {0, 0, 0}, {0, 0, 0}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result){
            System.out.println(" First test for horizontal win - OK");
        } else {
            System.out.println(" First test for horizontal win - FAIL");
        }
    }

    public void secondHorizontalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result){
            System.out.println("Second test for horizontal win - OK");
        } else {
            System.out.println("Second test for horizontal win - FAIL");
        }
    }

    public void thirdHorizontalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{0, 0, 0}, {0, 0, 0}, {1, 1, 1}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result){
            System.out.println("Third test for horizontal win - OK");
        } else {
            System.out.println("Third test for horizontal win - FAIL");
        }
    }

    public void firstVerticalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result){
            System.out.println("First test for vertical win - OK ");
        } else {
            System.out.println("First test for vertical win - FAIL");
        }
    }

    public void secondVerticalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result){
            System.out.println("Second test for vertical win - OK ");
        } else {
            System.out.println("Second test for vertical win - FAIL");
        }
    }

    public void thirdVerticalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{0, 0, 1}, {0, 0, 1}, {0, 0, 1}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result){
            System.out.println("Third test for vertical win - OK ");
        } else {
            System.out.println("Third test for vertical win - FAIL");
        }
    }

    public void firstDiagonalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{1, 0 ,0}, {0, 1, 0}, {0, 0, 1}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field,1);
        if (result){
            System.out.println("First test for diagonal win - OK");
        } else {
            System.out.println("First test for diagonal win - FAIL");
        }
    }

    public void secondDiagonalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = {{0, 0 ,1}, {0, 1, 0}, {1, 0, 0}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field,1);
        if (result){
            System.out.println("Second test for diagonal win - OK");
        } else {
            System.out.println("Second test for diagonal win - FAIL");
        }
    }

    //public void firstWinPositionTest

    public void fieldTest(){
        TicTacToe ticTacToe = new TicTacToe();

    }
}
