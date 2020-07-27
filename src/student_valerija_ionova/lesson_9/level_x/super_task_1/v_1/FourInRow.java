package student_valerija_ionova.lesson_9.level_x.super_task_1.v_1;

/*Игра "Четыре в ряд" (https://en.wikipedia.org/wiki/Connect_Four).

Придумайте объектную модель для игры "Четыре в ряд".
Реализуйте решение в виде программы с использованием принцыпа ООП.*/

import java.util.Scanner;

class FourInRow {

    int [][] createNewField() {
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}};
        return field;
    };

    boolean winDiagonal1 (int [][] field, int player){
        int inDiagonal = 0;
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < (4+i); j++){
                    //System.out.println("1["+(2-i+j)+"] ["+j+"]");
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
                //System.out.println("["+j+"] ["+(1+i+j)+"]");
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
                //System.out.println("1["+(3+i-j)+"] ["+j+"]");
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
                //System.out.println("["+j+"] ["+(i+1+5-j)+"]");
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
    }

    boolean coordinatesNotInField(int x){
        return ((x < 0)||(x > 6));
    }

    void ifNecessaryNotificationAboutError(int [][] field, int x){
        if (coordinatesNotInField(x)){
            System.out.println("Not valid coordinates");
        }else {
            if (!freePlace(field, x)) {
                System.out.println("No free places in this column!");
            }
        }
    }

    int getX (int [][] field){
        System.out.println("Please enter number of Column (1-7):");
        int x;
        Scanner input = new Scanner(System.in);
        do{
            x = input.nextInt()-1;

            ifNecessaryNotificationAboutError(field, x);
        }while(coordinatesNotInField(x) || !freePlace(field, x));
        return x;
    }

    int getY (int [][] field, int x){
        int y = 0;
        for (int i = 5; i>0; i--){
            if (field[i][x] == 0){
                return i;
            }
        }
        return y;
    }


    Coordinates newMove(int [][] field){
        int x = getX(field);
        int y = getY(field, x);
        Coordinates move = new Coordinates(x, y);
        return move;
    }

    boolean freePlace(int [][] field, int x){
        return (field[0][x] == 0);
    }

    boolean fullField(int [][] field){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (field[i][j] == 0) return false;
            }
        }
        return true;
    }


    void printField(int [][] field){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    void game(){
        int [][] field = createNewField();
        System.out.println("Let's start game!\n");

        printField(field);
        int i =0;
        while(true){

            System.out.println("Please enter coordinates for player 3");
            Coordinates move3 = newMove(field);
            field[move3.getY()][move3.getX()] = 3;
            printField(field);
            if (win(field, 3)){
                System.out.println("Player 3 WON!");
                break;
            }
            if (fullField(field)){
                System.out.println("Full field. The end!");
                break;
            }


            System.out.println("Please enter coordinates for player 8");
            Coordinates move8 = newMove(field);
            field[move8.getY()][move8.getX()] = 8;
            printField(field);
            if (win(field, 8)){
                System.out.println("Player 8 WON!");
                break;
            }
            if (fullField(field)){
                System.out.println("Full field. The end!");
                break;
            }

        }

    }

}
