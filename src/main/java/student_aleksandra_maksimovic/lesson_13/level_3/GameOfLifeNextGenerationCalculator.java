package student_aleksandra_maksimovic.lesson_13.level_3;

public class GameOfLifeNextGenerationCalculator {
    // calculate
    public Field calculate(Field field) {


        Field result = new Field(field.getWidth(), field.getHeight());


        for (int y = 0; y < field.getHeight(); y++) {
            for (int x = 0; x < field.getWidth(); x++) {
                boolean imALive = decide(field, x, y) ;
                result.setCell(x, y, imALive  );
            }
        }


        return result;
    }

    boolean decide(Field field, int x, int y)
    {
        int around = getLiveCellsAround(field, x, y);

        if (field.getCell(x, y)) {

            if (around < 2) {
                return false;
            }

            if (around > 3) {
                return false;
            }

            return true;

        } else {

            if (around == 3) {
                return true;
            }
        }

        return field.getCell(x, y);
    }

    int getLiveCellsAround(Field field, int cellX, int cellY)
    {
        int cells = 0;

        for (int y = cellY - 1; y <= cellY + 1; y++) {
            for (int x = cellX - 1; x <= cellX + 1; x++) {
                if (x == cellX && y == cellY)
                    continue;

                if (field.getCell(x, y)) {
                    cells++;
                }
            }
        }

        return cells;
    }
}
/*
Правило 1:
Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
Правило 2:
Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
Правило 3:
Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
Правило 4:
Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
 */