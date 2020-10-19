package student_jaroslav_brutan.lesson_13.day_4;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeRandomFieldGenerator {

    boolean[][] generate(int width, int height) {
        boolean[][] newCreatedField = new boolean[width][height];
        Random random = new Random();
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                int in = random.nextInt(2);
                if (in == 1){
                    newCreatedField[i][j] = true;
                } else {
                    newCreatedField[i][j] = false;
                }
            }
        }
        return newCreatedField;
    }
    }
