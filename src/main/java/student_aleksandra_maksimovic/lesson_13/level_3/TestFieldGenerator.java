package student_aleksandra_maksimovic.lesson_13.level_3;

public class TestFieldGenerator implements FieldGenerator {
    @Override
    public Field generate(int width, int height) {
        boolean[][] fieldData = new boolean[][]
                {
                        { false, false, false, false, false, false },
                        { false, true,  true,  false, false, false },
                        { false, true,  true,  false, false, false },
                        { false, false, false, true,  true,  false },
                        { false, false, false, true,  true,  false },
                        { false, false, false, false, false, false },
                };

        Field field = new Field(fieldData);

        return field;
    }
}
