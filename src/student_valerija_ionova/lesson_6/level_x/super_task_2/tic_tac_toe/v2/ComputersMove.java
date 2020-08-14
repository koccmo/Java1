package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class ComputersMove {

    ComputersPerspectiveMoveLogic computersPerspectiveMoveLogic = new ComputersPerspectiveMoveLogic();


    public Move computersTurn (Field field, int sign) {
        System.out.println("New turn for "+sign+"!");
        Move move;
        int sign2;
        if (sign == 0){
            sign2 = 1;
        }else
            sign2 = 0;

        //If this player can win next turn
        for (int i = 0; i < 3; i++) {       //y
            for (int j = 0; j < 3; j++) {       //x
                if (field.freePlace(j, i)) {
                    Field ifField = new Field();
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField.getField()[k][l] = field.getPosition(l, k);
                        }
                    }
                    ifField.getField()[i][j] = sign;

                    if (ifField.isWinPosition(sign)) {
                        return new Move(j, i);
                    }
                }
            }
        }

        // if another player can win next turn
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.freePlace(j, i)) {
                    Field ifField = new Field();
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField.getField()[k][l] = field.getPosition(l, k);
                        }
                    }
                    ifField.getField()[i][j] = sign2;

                    if (ifField.isWinPosition(sign2)){
                        return new Move(j, i);
                    }
                }
            }
        }

        //if second
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.freePlace(j, i)){
                    move = new Move(j, i);
                    if (computersPerspectiveMoveLogic.ifPerspectiveMove(field, move, sign)) {
                        return move;
                    }
                }
            }
        }

        //if first
        if (field.freePlace(1, 1)){
            return new Move(1,1);
        }else
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field.freePlace(j, i))
                        return new Move(i, j);
                }
            }
        }

        return new Move(0,0);
    }
}