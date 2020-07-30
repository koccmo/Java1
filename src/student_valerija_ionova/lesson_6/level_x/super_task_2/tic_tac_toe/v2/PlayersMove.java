package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

import java.util.Scanner;

class PlayersMove {

    Move getNextMove(int player) {

        int x;
        int y;

        Scanner input = new Scanner(System.in);

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
}
