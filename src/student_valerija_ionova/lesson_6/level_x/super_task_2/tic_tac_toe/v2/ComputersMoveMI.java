package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class ComputersMoveMI {

    ComputersPerspectiveMoveLogic computersPerspectiveMoveLogic = new ComputersPerspectiveMoveLogic();
    VictoryCondition victoryCondition = new VictoryCondition();

    public Move computersTurn (int [][] field) {
        Move move;

        //If PC can win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    int[][] ifField1 = new int[3][3];
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField1[k][l] = field[k][l];
                        }
                    }
                    ifField1[i][j] = 1;

                    if (victoryCondition.isWinPosition(ifField1, 1)) {
                        return new Move(j, i);
                    }

                }
            }
        }
        // if player can win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    int[][] ifField0 = new int[3][3];
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField0[k][l] = field[k][l];
                        }
                    }
                    ifField0[i][j] = 0;

                    if (victoryCondition.isWinPosition(ifField0, 0)){
                        return new Move(j, i);
                    }
                }
            }
        }
        //if second
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1){
                    move = new Move(i, j);
                    if (computersPerspectiveMoveLogic.ifPerspectiveMove(field, move)) {
                        return move;
                    }
                }
            }
        }
        //if first
        if (field[1][1] == -1){
            return new Move(1,1);
        }else
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field[i][j] == -1)
                        return new Move(i, j);
                }
            }
        }
        move = new Move(0,0);
        return move;
    }
}