package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe;

/*Создать простой искуственный интеллект (компьютерного игрока)
для игры в крестики нолики из day_5 и day_6.
Искусственный интеллект можно реализовать
так, что он будет выбирать рандомную пустую клетку
и ходить в неё. А можно научить компьютер распознавать
выигрышные комбинации в один ход и выигрывать, а
так же защищаться от проигрыша в один ход если это
возможно.
*/

import java.util.Scanner;
import java.util.Arrays;

class TicTacToe {

    public int[][] createField(){
        int [][] game = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        return game;
    }



    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean answer =false;
        for (int i=0; i<3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                answer = true;
            }

        }
        return answer;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean answer = false;
        for (int i=0; i<3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                answer = true;
            }

        }
        return answer;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
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

    public boolean isWinPosition(int[][] field, int playerToCheck){
        if ((isWinPositionForHorizontals(field, playerToCheck)) || (isWinPositionForDiagonals(field, playerToCheck)) ||
                (isWinPositionForVerticals(field, playerToCheck))){
            return true;
        }else{
            return false;
        }
    }

    public boolean fullField( int [] [] arr){
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

    public boolean isDrawPosition(int[][] field){
        if ((!isWinPosition(field, 0)) && (!isWinPosition(field, 1)) && fullField(field)) {
            return true;
        }else
        return false;
    }

    public Move getNextMove(int player) {

        int x;
        int y;
        Scanner input = new Scanner(System.in);

        //Input of coordinate x
        do {
            System.out.println("Please input coordinates: x y (0-2) for player "+player+":");
            x = input.nextInt();
            y = input.nextInt();
            if (((x<0)||(x>2)) || ((y<0)||(y>2))){
                System.out.println("Not correct coordinates!");
            }
        }while(((x<0)||(x>2)) || ((y<0)||(y>2)));

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field){
        //int [] array = new int [3];
        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.print(field[i][j]+" ");
                //array[j] = field[i][j];
            }
            System.out.println();
            //System.out.println(Arrays.toString(array));
        }
    }

    /*public boolean checkIfWillWin (int [][] field, int player){
        if ((isWinPosition(field, player)) || (isDrawPosition(field))){
            return true;
        }else return false;
    }*/

    public boolean perspectiveLineHorizontal(int [][] field, Move move){
        boolean answer = false;
        //System.out.println("x= "+move.getX()+ " y= "+move.getY());
        switch (move.getX()){
            case 0:{
                if (((field[move.getY()][1] == -1) || (field[move.getY()][1] == 1)) &&
                        ((field[move.getY()][2] == -1) || (field[move.getY()][2] == 1))) {
                    //System.out.println("result0 "+answer);
                    answer = true;
                }
            } break;
            case 1:{
                if (((field[move.getY()][0] == -1) || (field[move.getY()][0] == 1)) &&
                        ((field[move.getY()][2] == -1) || (field[move.getY()][2] == 1))) {
                    answer = true;
                    //System.out.println("result1 "+answer);
                }
            } break;
            case 2:{
                System.out.println("x= "+move.getX()+ " y= "+move.getY());
                if (((field[move.getY()][1] == -1) || (field[move.getY()][1] == 1)) &&
                        ((field[move.getY()][0] == -1) || (field[move.getY()][0] == 1))) {
                    answer = true;
                    //System.out.println("result2 "+answer);
                }
            }break;
            //default: return false;
        }
        return answer;
    }

    public boolean perspectiveLineVertical(int [][] field, Move move){
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
            //default: return false;
        }
        return answer;
    }

    public int partOfDiagonal(Move move){
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

    public boolean perspectiveDiagonal1(int [][] field, Move move) {
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
            //default: return false;
        }
    }
        return answer;
    }

    public boolean perspectiveDiagonal2(int [][] field, Move move) {
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
                //default: return false;
            }
        }
        return answer;
    }


    public boolean ifPerspectiveMove(int [][] field, Move move){
        if (perspectiveDiagonal1(field, move) || perspectiveDiagonal2(field, move) || perspectiveLineHorizontal(field, move) || perspectiveLineVertical(field, move)) return true;
        else return false;
    }

    public Move computersTurn (int [][] field) {
        Move move;

        //If PC can win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    //System.out.println("field i= " + i + " j= " + j);
                    /*for (int k = 0; k < 3; k++) {
                        System.out.println(Arrays.toString(field[k]));
                    }*/
                    int[][] ifField1 = new int[3][3];
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField1[k][l] = field[k][l];
                        }
                    }
                    ifField1[i][j] = 1;

                    if (isWinPosition(ifField1, 1)) {
                        //System.out.println("Voshol sjuda");
                        return new Move(j, i);
                    }

                }
            }
        }

        // if player can win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    //System.out.println("field i= " + i + " j= " + j);
                    /*for (int k = 0; k < 3; k++) {
                        System.out.println(Arrays.toString(field[k]));
                    }*/
                    int[][] ifField0 = new int[3][3];
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            ifField0[k][l] = field[k][l];
                        }
                    }
                    ifField0[i][j] = 0;

                    if (isWinPosition(ifField0, 0)){
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
                if (ifPerspectiveMove(field, move)) {
                    //System.out.println("//if second");
                    return move;
                }
            }
            }
        }

        //if first
        if (field[1][1] == -1){
            move = new Move(1,1);
        }else
        {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1)
                    //System.out.println("////if first");
                    return new Move(i, j);

                }
            }
        }
        move = new Move(0,0);
        //System.out.println("the End");
        return move;
        }



    public void playWithComputer() {
        int[][] field = createField();
        System.out.println("Let's start game:");
        printFieldToConsole(field);
        while(true) {
            Move move0;
            boolean freeField = false;
            do {
                move0 = getNextMove(0);
                if (field[move0.getY()][move0.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move0.getY()][move0.getX()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("Computers's turn!");

            Move move1 = computersTurn(field);
            /*freeField = false;
            do {
                move1 = getNextMove(1);
                if (field[move1.getY()][move1.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);*/


            field[move1.getY()][move1.getX()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


        }  //end of the game
    }

    public void play() {
        int[][] field = createField();
        System.out.println("Let's start game:");
        printFieldToConsole(field);
        while(true) {
            Move move0;
            boolean freeField = false;
            do {
                move0 = getNextMove(0);
                if (field[move0.getY()][move0.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move0.getY()][move0.getX()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1;
            freeField = false;
            do {
                move1 = getNextMove(1);
                if (field[move1.getY()][move1.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move1.getY()][move1.getX()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
