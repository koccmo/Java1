package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class ComputersPerspectiveMoveLogic {

	public boolean ifPerspectiveMove(int [][] field, Move move){
		if (perspectiveDiagonal1(field, move) || perspectiveDiagonal2(field, move) || perspectiveLineHorizontal(field, move) || perspectiveLineVertical(field, move)) return true;
		else return false;
	}

    private boolean perspectiveLineHorizontal(int [][] field, Move move){
        boolean answer = false;
        switch (move.getX()){
            case 0:{
                if (((field[move.getY()][1] == -1) || (field[move.getY()][1] == 1)) &&
                        ((field[move.getY()][2] == -1) || (field[move.getY()][2] == 1))) {
                    answer = true;
                }
            } break;
            case 1:{
                if (((field[move.getY()][0] == -1) || (field[move.getY()][0] == 1)) &&
                        ((field[move.getY()][2] == -1) || (field[move.getY()][2] == 1))) {
                    answer = true;
                }
            } break;
            case 2:{
                System.out.println("x= "+move.getX()+ " y= "+move.getY());
                if (((field[move.getY()][1] == -1) || (field[move.getY()][1] == 1)) &&
                        ((field[move.getY()][0] == -1) || (field[move.getY()][0] == 1))) {
                    answer = true;
                }
            }break;
        }
        return answer;
    }

    private boolean perspectiveLineVertical(int [][] field, Move move){
        boolean answer = false;
        switch (move.getY()){
            case 0:{
                if (((field[1][move.getX()] == -1) || (field[1][move.getX()] == 1)) &&
                        ((field[2][move.getX()] == -1) || (field[2][move.getX()] == 1))) answer = true;
            }break;
            case 1:{
                if (((field[0][move.getX()] == -1) || (field[0][move.getX()] == 1)) &&
                        ((field[2][move.getX()] == -1) || (field[2][move.getX()] == 1))) answer = true;
            }break;
            case 2:{
                if (((field[1][move.getX()] == -1) || (field[2][move.getX()] == 1)) &&
                        ((field[0][move.getX()] == -1) || (field[0][move.getX()] == 1))) answer = true;
            }break;
        }
        return answer;
    }

    private int partOfDiagonal(Move move){
        if ((move.getX() == 1) && (move.getY() == 1)){
            return 0;
        }else
        if (((move.getX() == 0) && (move.getY() == 0)) || ((move.getX() == 1) && (move.getY() == 1)) ||
                ((move.getX() == 2) && (move.getY() == 2))){
            return 1;
        }else{ if (((move.getX() == 0) && (move.getY() == 2)) || ((move.getX() == 1) && (move.getY() == 1)) ||
                ((move.getX() == 2) && (move.getY() == 0))){
            return 2;
        }
        else return 3;
        }
    }

    private boolean perspectiveDiagonal1(int [][] field, Move move) {
        boolean answer = false;
        if ((partOfDiagonal(move) == 1) || (partOfDiagonal(move) == 0)){
            switch (move.getY()) {
                case 0: {
                    if (((field[1][1] == -1) || (field[1][1] == 1)) &&
                            ((field[2][2] == -1) || (field[2][2] == 1))) answer = true;
                }break;
                case 1: {
                    if (((field[0][0] == -1) || (field[0][0] == 1)) &&
                            ((field[2][2] == -1) || (field[2][2] == 1))) answer = true;
                }break;
                case 2: {
                    if (((field[1][move.getX()] == -1) || (field[2][move.getX()] == 1)) &&
                            ((field[0][move.getX()] == -1) || (field[0][move.getX()] == 1))) answer = true;
                }break;
            }
        }
        return answer;
    }

    private boolean perspectiveDiagonal2(int [][] field, Move move) {
        boolean answer = false;
        if ((partOfDiagonal(move) == 2) || (partOfDiagonal(move) == 0)){
            switch (move.getY()) {
                case 0: {
                    if (((field[1][1] == -1) || (field[1][1] == 1)) &&
                            ((field[2][0] == -1) || (field[2][0] == 1))) answer = true;
                }break;
                case 1: {
                    if (((field[0][2] == -1) || (field[0][2] == 1)) &&
                            ((field[2][0] == -1) || (field[2][0] == 1))) answer = true;
                }break;
                case 2: {
                    if (((field[1][1] == -1) || (field[1][1] == 1)) &&
                            ((field[0][2] == -1) || (field[0][2] == 1))) answer = true;
                }break;
            }
        }
        return answer;
    }

}