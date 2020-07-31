package student_valerija_ionova.lesson_9.level_x.super_task_1;

/*Игра "Четыре в ряд" (https://en.wikipedia.org/wiki/Connect_Four).

Придумайте объектную модель для игры "Четыре в ряд".
Реализуйте решение в виде программы с использованием принцыпа ООП.*/

import java.util.Scanner;

class PlayersMove {

    Field gameBoard = new Field();

    int getX (int [][] field){
        System.out.println("Please enter number of Column (1-7):");
        int x;
        Scanner input = new Scanner(System.in);
        do{
            x = input.nextInt()-1;
            ifNecessaryNotificationAboutError(field, x);
        }while(coordinatesNotInField(x) || !gameBoard.freePlace(field, x));
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
        return new Coordinates(x, y);
    }

    boolean coordinatesNotInField(int x){
        return ((x < 0)||(x > 6));
    }

    void ifNecessaryNotificationAboutError(int [][] field, int x){
        if (coordinatesNotInField(x)){
            System.out.println("Not valid coordinates");
        }else {
            if (!gameBoard.freePlace(field, x)) {
                System.out.println("No free places in this column!");
            }
        }
    }
}
