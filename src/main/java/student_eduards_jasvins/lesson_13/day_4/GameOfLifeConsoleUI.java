package student_eduards_jasvins.lesson_13.day_4;

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
