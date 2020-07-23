package student_anvars_intezars.home_tasks.lesson_6.day_5;

public class TicTacToe {

   public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
   }

   public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
       for (int i = 0; i < 3; i++) {
           if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
               return true;
           }
       }
       return false;
   }
}


