package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class VictoryCondition {

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean answer =false;
        for (int i=0; i<3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                answer = true;
            }
        }
        return answer;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean answer = false;
        for (int i=0; i<3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                answer = true;
            }
        }
        return answer;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean answer = false;
        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)){
            answer = true;
        }else{
            if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)){
                answer = true;
            }
        }
        return answer;
    }

    boolean isWinPosition(int[][] field, int playerToCheck){
        if ((isWinPositionForHorizontals(field, playerToCheck)) || (isWinPositionForDiagonals(field, playerToCheck)) ||
                (isWinPositionForVerticals(field, playerToCheck))){
            return true;
        }else{
            return false;
        }
    }

    boolean isDrawPosition(int[][] field){
        if ((!isWinPosition(field, 0)) && (!isWinPosition(field, 1)) && fullField(field)) {
            return true;
        }else
            return false;
    }

    boolean fullField(int [][] arr){
        boolean answer = true;
        for(int i=0; i<3; i++){
            for (int j = 0; j< 3; j++){
                if (arr[i][j] == -1){
                    answer = false;
                }
            }
        }
        return answer;
    }

    boolean checkWinner(int[][] field, int player){
        boolean gameContinues = true;
        if (isWinPosition(field, player)) {
            System.out.println("Player 0 WIN!");
            gameContinues = false;
        }
        if (isDrawPosition(field)) {
            System.out.println("DRAW!");
            gameContinues = false;
        }
        return gameContinues;
    }
}