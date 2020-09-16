package student_valerija_ionova.lesson_13.level_4_junior;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    boolean[][] generate(int fieldWidth, int fieldHeight){
        boolean [][] newField = new boolean [fieldHeight][fieldWidth];
        Random rd = new Random();
        for (int i = 0; i < fieldHeight; i++){
            for (int j = 0; j < fieldWidth; j++){
                int in = rd.nextInt(2);
                if (in == 1){
                    newField[i][j] = true;
                }else{
                    newField[i][j] = false;
                }
            }
        }
        return newField;
    }

}
