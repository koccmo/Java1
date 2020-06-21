package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_2;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){

        Game bowling = new Game();
        int roll1 = 0;
        int roll2 = 0;

        for (int i = 0; i < 21; i++){
            System.out.println("It's turn Nr. "+Math.round((Math.floor(i/2)+1)));
            if ((i == 20) && (roll1 + roll2 == 10)) {
                System.out.println("Please roll bonus ball");
                Scanner rollBonus = new Scanner(System.in);
                roll1 = rollBonus.nextInt();
                bowling.roll(roll1);
            }
            else
            if (i % 2 == 0) {
                System.out.println("Please roll first ball! Good luck!");

            Scanner roll = new Scanner(System.in);
            roll1 = roll.nextInt();
            bowling.roll(roll1);
            }
            else {
                System.out.println("Please roll second ball! Good luck!");

                Scanner rollNext = new Scanner(System.in);
                roll2 = rollNext.nextInt();
                bowling.roll(roll2);}

            if (i % 2 == 0){
                if (roll1 == 10){
                    System.out.println("It's Strike! Very good!");
                    i++;
                }

            } else{
                if (roll1 + roll2 == 10){
                    System.out.println("It's strake!Good!");
                }
            }

        }
        /*bowling.roll(3);//1
        bowling.roll(6);

        bowling.roll(7);//2
        bowling.roll(3);

        bowling.roll(5);//3
        bowling.roll(4);

        bowling.roll(3);//4
        bowling.roll(7);

        bowling.roll(0);//5
        bowling.roll(0);

        bowling.roll(10);//6

        bowling.roll(1);//7
        bowling.roll(2);

        bowling.roll(8);//8
        bowling.roll(1);

        bowling.roll(10);//9

        bowling.roll(2);//10
        bowling.roll(8);

        bowling.roll(10);//11*/


        //String table = bowling.tableOfScore();
        //System.out.println(table);

        int score = bowling.score();
        System.out.println(score);


    }
}
