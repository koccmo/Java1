package student_eduards_jasvins.lesson_13.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]) {
                    System.out.println("*  ");
                } else {
                    System.out.println("o  ");
                }
                System.out.println("\n");
            }
        }
    }
}
