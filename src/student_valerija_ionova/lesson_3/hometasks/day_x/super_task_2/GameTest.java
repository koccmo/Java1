package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_2;

public class GameTest {
    public static void main(String[] args){

        Game bowling = new Game();

        bowling.roll(4);//1
        bowling.roll(6);

        bowling.roll(5);//2
        bowling.roll(3);

        bowling.roll(6);//3
        bowling.roll(0);

        bowling.roll(0);//4
        bowling.roll(7);

        bowling.roll(5);//5
        bowling.roll(2);

        bowling.roll(10);//6

        bowling.roll(0);//7
        bowling.roll(0);

        bowling.roll(8);//8
        bowling.roll(1);

        bowling.roll(10);//9

        bowling.roll(2);//10
        bowling.roll(8);

        bowling.roll(10);//11

        //String table = bowling.tableOfScore();
        //System.out.println(table);

        int score = bowling.score();

        if (score == 102){
        System.out.println("1 test: Normal game test is OK");
        }
        else System.out.println("1 test: Normal game score not OK");

        //Test all strikes
        Game bowling2 = new Game();
        bowling2.roll(10);//1

        bowling2.roll(10);//2

        bowling2.roll(10);//3

        bowling2.roll(10);//4

        bowling2.roll(10);//5

        bowling2.roll(10);//6

        bowling2.roll(10);//7

        bowling2.roll(10);//8

        bowling2.roll(10);//9

        bowling2.roll(10);//10
        bowling2.roll(10);//10-2

        bowling2.roll(10);//11

        //String table = bowling.tableOfScore();
        //System.out.println(table);

        //String table1 = bowling2.tableOfScore();
        //System.out.println(table1);

        score = bowling2.score();

        if (score == 300){
            System.out.println("2 test: All Strikes game is OK");
        }
        else System.out.println("2 test: All Strikes game not right score");

        //Third test without bonuses
        Game bowling3 = new Game();

        bowling3.roll(4);//1
        bowling3.roll(4);

        bowling3.roll(5);//2
        bowling3.roll(3);

        bowling3.roll(6);//3
        bowling3.roll(2);

        bowling3.roll(1);//4
        bowling3.roll(7);

        bowling3.roll(6);//5
        bowling3.roll(2);

        bowling3.roll(8);//6
        bowling3.roll(0);

        bowling3.roll(0);//7
        bowling3.roll(8);

        bowling3.roll(8);//8
        bowling3.roll(0);

        bowling3.roll(7);//9
        bowling3.roll(1);

        bowling3.roll(2);//10
        bowling3.roll(6);



        score = bowling3.score();

        if (score == 80){
            System.out.println("3 test: No Bonus game test is OK");
        }
        else System.out.println("3 test: No Bonus game not right score");

        //All 0
        Game bowling4 = new Game();

        bowling4.roll(0);//1
        bowling4.roll(0);

        bowling4.roll(0);//2
        bowling4.roll(0);

        bowling4.roll(0);//3
        bowling4.roll(0);

        bowling4.roll(0);//4
        bowling4.roll(0);

        bowling4.roll(0);//5
        bowling4.roll(0);

        bowling4.roll(0);//6
        bowling4.roll(0);//6

        bowling4.roll(0);//7
        bowling4.roll(0);

        bowling4.roll(0);//8
        bowling4.roll(0);

        bowling4.roll(0);//9
        bowling4.roll(0);//9

        bowling4.roll(0);//10
        bowling4.roll(0);

        score = bowling4.score();


        if (score == 0){
            System.out.println("4 test: The worst game ever test is OK");
        }
        else System.out.println("4 test: The worst game ever score isn't OK");


        //All Spare
        Game bowling5 = new Game();

        bowling5.roll(2);//1
        bowling5.roll(8);

        bowling5.roll(8);//2
        bowling5.roll(2);

        bowling5.roll(4);//3
        bowling5.roll(6);

        bowling5.roll(7);//4
        bowling5.roll(3);

        bowling5.roll(1);//5
        bowling5.roll(9);

        bowling5.roll(5);//6
        bowling5.roll(5);//6

        bowling5.roll(5);//7
        bowling5.roll(5);

        bowling5.roll(7);//8
        bowling5.roll(3);

        bowling5.roll(7);//9
        bowling5.roll(3);//9

        bowling5.roll(2);//10
        bowling5.roll(8);

        bowling5.roll(10);//11

        score = bowling5.score();

        if (score == 156){
            System.out.println("5 test: All spare test is OK");
        }
        else System.out.println("5 test: All spare test isn't OK");

        //String table = bowling5.tableOfScore();
        //System.out.println(table);

    }

    }

