package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class ComputersPerspectiveMoveLogic {

    boolean ifPerspectiveMove(Field field, Move move, int player){
        if (perspectiveDiagonal1(field, move, player) ||
                perspectiveDiagonal2(field, move, player) ||
                perspectiveLineHorizontal(field, move, player) ||
                perspectiveLineVertical(field, move, player)) return true;
        else return false;
    }

    private boolean possibilityToWin(Field field, Move move1, Move move2, int player){
        return (((field.getPosition(move1.getY(), move1.getX()) == player) &&
                (field.getPosition(move2.getY(), move2.getX()) == 0)) ||
                ((field.getPosition(move1.getY(), move1.getX()) == 0) &&
                        (field.getPosition(move2.getY(), move2.getX()) == player)));
    }

    private boolean perspectiveLineHorizontal(Field field, Move move, int player){
        int y = move.getY();
        switch (move.getX()){
            case 0:{
                Move move1 = new Move(1, y);
                Move move2 = new Move(2, y);
                if (possibilityToWin(field, move1, move2, player)) return true;

            } break;
            case 1:{
                Move move1 = new Move(0, y);
                Move move2 = new Move(2, y);
                if (possibilityToWin(field, move1, move2, player)) return true;
            } break;
            case 2:{
                //System.out.println("x= "+move.getX()+ " y= "+move.getY());
                Move move1 = new Move(0, y);
                Move move2 = new Move(1, y);
                if (possibilityToWin(field, move1, move2, player)) return true;
            }break;
        }
        return false;
    }

    private boolean perspectiveLineVertical(Field field, Move move, int player){
        int x = move.getX();
        switch (move.getY()){
            case 0:{
                Move move1 = new Move(x, 1);
                Move move2 = new Move(x, 2);
                if (possibilityToWin(field, move1, move2, player)) return true;

            }break;
            case 1:{
                Move move1 = new Move(x, 0);
                Move move2 = new Move(x, 2);
                if (possibilityToWin(field, move1, move2, player)) return true;
            }break;
            case 2:{
                Move move1 = new Move(x, 1);
                Move move2 = new Move(x, 0);
                if (possibilityToWin(field, move1, move2, player)) return true;
            }break;
        }
        return false;
    }

    private int partOfDiagonal(Move move){
        int x = move.getX();
        int y = move.getY();
        if ((x == 1) && (y == 1)){
            return 0;
        }else
        if (((x == 0) && (y == 0)) || ((x == 1) && (y == 1)) ||
                ((x == 2) && (y == 2))){
            return 1;
        }else{ if (((x == 0) && (y == 2)) || ((x == 1) && (y == 1)) ||
                ((x == 2) && (y == 0))){
            return 2;
        }
        else return 3;
        }
    }

    private boolean perspectiveDiagonal1(Field field, Move move, int player) {
        int x = move.getX();
        if ((partOfDiagonal(move) == 1) || (partOfDiagonal(move) == 0)){
            switch (move.getY()) {
                case 0: {
                    Move move1 = new Move(1, 1);
                    Move move2 = new Move(2, 2);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
                case 1: {
                    Move move1 = new Move(0, 0);
                    Move move2 = new Move(2, 2);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
                case 2: {
                    Move move1 = new Move(1, 1);
                    Move move2 = new Move(0, 0);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
            }
        }
        return false;
    }

    private boolean perspectiveDiagonal2(Field field, Move move, int player) {
        int y =move.getY();
        if ((partOfDiagonal(move) == 2) || (partOfDiagonal(move) == 0)){
            switch (y) {
                case 0: {
                    Move move1 = new Move(1, 1);
                    Move move2 = new Move(0, 2);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
                case 1: {
                    Move move1 = new Move(2, 0);
                    Move move2 = new Move(0, 2);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
                case 2: {
                    Move move1 = new Move(1, 1);
                    Move move2 = new Move(2, 0);
                    if (possibilityToWin(field, move1, move2, player)) return true;
                }break;
            }
        }
        return false;
    }
}