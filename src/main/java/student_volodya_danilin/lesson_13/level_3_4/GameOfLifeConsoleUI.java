package student_volodya_danilin.lesson_13.level_3_4;

class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        System.out.println("X = alive; O = dead;");
        for (boolean[] booleans : field) {
            System.out.println();
            for (int col = 0; col < field[0].length; col++) {
                if (booleans[col]) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
        }
        System.out.println("\n--------------------");
    }
}
