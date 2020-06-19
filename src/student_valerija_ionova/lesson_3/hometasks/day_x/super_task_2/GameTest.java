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


        String table = bowling.tableOfScore();
        System.out.println(table);

        int score = bowling.score();
        System.out.println(score);

    }


}
