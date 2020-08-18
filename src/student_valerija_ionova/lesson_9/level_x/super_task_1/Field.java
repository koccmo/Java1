package student_valerija_ionova.lesson_9.level_x.super_task_1;

class Field {

    private int [][] field;

    void createNewField() {
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};

        this.field = field;

    };

    void printField(){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean freePlace(int x){
        return (field[0][x] == 0);
    }

    boolean fullField(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (field[i][j] == 0) return false;
            }
        }
        return true;
    }

    int [][] getField(){
        return field;
    }

    boolean win (int player){
        return (winHorizontal(player) || winVertical(player) || winDiagonal(player));
    }

    private boolean winDiagonal1 (int player){

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

    private boolean winDiagonal2 (int player){
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

    private boolean winDiagonal (int player){
        return (winDiagonal1(player) || winDiagonal2(player));
    }

    private boolean winHorizontal(int player){
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

    private boolean winVertical(int player){
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

}
