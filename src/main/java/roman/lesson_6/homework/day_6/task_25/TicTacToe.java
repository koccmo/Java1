package roman.lesson_6.homework.day_6.task_25;

import java.util.Scanner;

public class TicTacToe {
    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first coordinate of your move - ");
        int x = sc.nextInt();
        System.out.println("Enter second coordinate of your move - ");
        int y = sc.nextInt();
        return new Move(x, y);
    }
}
