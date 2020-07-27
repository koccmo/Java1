package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_2;

import java.util.Scanner;

class GameDemo {
    public static void main(String[] args){

        Game bowling = new Game();

        int roll;

        while (bowling.getCount()<21){

            System.out.println("It's turn Nr. "+(bowling.count/2+1));
            if (bowling.count == 20)
                System.out.println("Please roll bonus ball!");
            else
            if (bowling.count % 2 == 0) {
                System.out.println("Please roll first ball!");
            }else System.out.println("Please roll second ball!");

            Scanner rollBall = new Scanner(System.in);
            roll = rollBall.nextInt();
            bowling.roll(roll);
        }

        //String table = bowling.tableOfScore();
        //System.out.println(table);

        int score = bowling.score();
        System.out.println(score);


    }
}
