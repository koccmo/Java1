package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class Field {

    private int [][] field = new int [3][3];

    int [][] getField(){
        return field;
    }

    void createNewField(){
        int [][] newField= new int [][] {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        this.field =  newField;
    }

    int getPosition (int x, int y){
        return field[y][x];
    }

    public void printFieldToConsole(){
        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                if (field[i][j] == -1) {
                    System.out.print(field[i][j] + " ");
                }else{
                    System.out.print(" " + field[i][j] + " ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    boolean freePlace(int x, int y){
        return (field[y][x] == -1);
    }

    boolean isWinPositionForHorizontals(int playerToCheck){
        boolean answer =false;
        for (int i=0; i<3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                answer = true;
            }
        }
        return answer;
    }

    boolean isWinPositionForVerticals(int playerToCheck){
        boolean answer = false;
        for (int i=0; i<3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                answer = true;
            }
        }
        return answer;
    }

    boolean isWinPositionForDiagonals(int playerToCheck){
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

    boolean isWinPosition(int playerToCheck){
        if ((isWinPositionForHorizontals(playerToCheck)) || (isWinPositionForDiagonals(playerToCheck)) ||
                (isWinPositionForVerticals(playerToCheck))){
            return true;
        }else{
            return false;
        }
    }

    boolean isDrawPosition(){
        if ((!isWinPosition(0)) && (!isWinPosition(1)) && fullField()) {
            return true;
        }else
            return false;
    }

    boolean fullField(){
        boolean answer = true;
        for(int i=0; i<3; i++){
            for (int j = 0; j< 3; j++){
                if (field[i][j] == -1){
                    answer = false;
                }
            }
        }
        return answer;
    }

    boolean checkWinner(int player){
        boolean gameContinues = true;
        if (isWinPosition(player)) {
            System.out.println("Player "+player+" WIN!");
            gameContinues = false;
        }
        if (isDrawPosition()) {
            System.out.println("DRAW!");
            gameContinues = false;
        }
        return gameContinues;
    }

}
