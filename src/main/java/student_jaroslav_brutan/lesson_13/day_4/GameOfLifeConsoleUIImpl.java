package student_jaroslav_brutan.lesson_13.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeConsoleUIImpl implements GameOfLifeConsoleUI{

    @Override
    public void show(boolean[][] field){
        for (int i = 0; i < field.length; i++){
            for (int j =0; j < field[0].length; j++){
                if (field[i][j]){
                    System.out.println("*");
                } else {
                    System.out.println(".");
                }
            }
        }
    }
}
