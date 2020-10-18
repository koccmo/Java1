package student_dmitrijs_jasvins.lesson_13.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeConsoleUI {
    private final String ALIVE_CELL = "X";
    private final String DEAD_CELL = "-";

    public void show(boolean[][] field){
        for (boolean[] booleans : field) {
            for (int j = 0; j < field[0].length; j++) {
                if (booleans[j]) {
                    System.out.print(ALIVE_CELL + " ");
                } else {
                    System.out.print(DEAD_CELL + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------");
    }
}
