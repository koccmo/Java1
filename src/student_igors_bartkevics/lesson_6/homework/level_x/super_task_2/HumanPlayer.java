package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

import java.util.Scanner;

public class HumanPlayer implements Player {

	@Override
	public Move nextMove(GameBoard board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X coordinate of cell you would like to go in:");
		int x = scanner.nextInt();
		System.out.println("Enter Y coordinate of cell you would like to go in:");
		int y = scanner.nextInt();
		return new Move(x, y);
	}

}