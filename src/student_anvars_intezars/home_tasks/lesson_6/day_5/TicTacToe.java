package student_anvars_intezars.home_tasks.lesson_6.day_5;

public class TicTacToe {

   public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
            } else {
                return false;
            }
        }
       return true;
   }
}


