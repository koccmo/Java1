package student_igors_bartkevics.lesson_13.homework.level_4_junior;



class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j ++) {
                if (field[i][j]) {
                    System.out.print("+  ");
                } else System.out.print("o  ");
            }
            System.out.print("\n");
        }
    }

}
