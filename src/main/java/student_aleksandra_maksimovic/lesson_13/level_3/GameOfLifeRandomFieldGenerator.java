package student_aleksandra_maksimovic.lesson_13.level_3;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeRandomFieldGenerator implements FieldGenerator {
    public Field generate(int width, int height) {
        Random random = new Random();
        Field field = new Field(width, height);
        for (int y = 0; y < field.getHeight(); y++) {
            for (int x = 0; x < field.getWidth(); x++) {
                field.setCell(x, y, random.nextBoolean());
            }
        }
        return field;
    }
}
