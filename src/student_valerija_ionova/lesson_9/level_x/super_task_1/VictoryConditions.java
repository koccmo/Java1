package student_valerija_ionova.lesson_9.level_x.super_task_1;

public class VictoryConditions {

    /*boolean winDiagonal1 (int [][] field, int player){

        int inDiagonal = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < (4+i); j++){
                if (field[2-i+j][j] == player){
                    inDiagonal++;
                }else{
                    if (inDiagonal >= 4){
                        return true;
                    }
                    inDiagonal = 0;
                }
            }
            if (inDiagonal >= 4){
                return true;
            }
            inDiagonal = 0;
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < (6-i); j++){
                if (field[j][1+i+j] == player){
                    inDiagonal++;
                }else{
                    if (inDiagonal >= 4){
                        return true;
                    }
                    inDiagonal = 0;
                }
            }
            if (inDiagonal >= 4){
                return true;
            }
            inDiagonal = 0;
        }

        return false;
    }

    boolean winDiagonal2 (int [][] field, int player){
        int inDiagonal = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < (4+i); j++){
                if (field[3+i-j][j] == player){
                    inDiagonal++;
                }else{
                    if (inDiagonal >= 4){
                        return true;
                    }
                    inDiagonal = 0;
                }
            }
            if (inDiagonal >= 4){
                return true;
            }
            inDiagonal = 0;
        }

        for (int i = 0; i < 3; i++){
            for (int j = 5; j >= (0+i) ; j--){
                if (field[j][i+1+5-j] == player){
                    inDiagonal++;
                }else{
                    if (inDiagonal >= 4){
                        return true;
                    }
                    inDiagonal = 0;
                }
            }
            if (inDiagonal >= 4){
                return true;
            }
            inDiagonal = 0;
        }
        return false;
    }

    boolean winDiagonal (int [][] field, int player){
        return (winDiagonal1(field, player) || winDiagonal2(field, player));
    }

    boolean winHorizontal(int [][] field, int player){
        int inRow = 0;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++) {
                if (field[i][j] == player){
                    inRow++;
                }else{
                    if (inRow >= 4)
                        return true;
                    inRow = 0;
                }
            }
            if (inRow >= 4)
                return true;
            inRow = 0;
        }
        return false;
    }

    boolean winVertical(int [][] field, int player){
        int inColumn = 0;
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 6; j++){
                if (field[j][i] == player){
                    inColumn++;
                }else{
                    if (inColumn >= 4){
                        return true;
                    }
                    inColumn = 0;
                }
            }
            if (inColumn >= 4){
                return true;
            }
            inColumn = 0;
        }
        return false;
    }

    boolean win (int [][] field, int player){
        return (winHorizontal(field, player) || winVertical(field, player) || winDiagonal(field, player));
    }*/

}
