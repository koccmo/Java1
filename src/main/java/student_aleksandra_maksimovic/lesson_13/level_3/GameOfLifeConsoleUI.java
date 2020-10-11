package student_aleksandra_maksimovic.lesson_13.level_3;

public class GameOfLifeConsoleUI {
    public void show(Field field)
    {


        for (int y = 0; y < field.getHeight(); y++) {
            System.out.println();
            for (int x = 0; x < field.getWidth(); x++) {
                if (field.getCell(x,y)) {
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }

            }
        }

        System.out.println();
        System.out.println();
    }
}
