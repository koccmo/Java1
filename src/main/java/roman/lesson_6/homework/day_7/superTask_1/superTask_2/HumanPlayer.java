package roman.lesson_6.homework.day_7.superTask_1.superTask_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HumanPlayer {
    public Move getNextMove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number coordinate of your move (Row) -");
        int x = scan.nextInt();
        System.out.println("Enter number coordinate of your move (Column) -");
        int y = scan.nextInt();
        return new Move(x, y);
    }
}
