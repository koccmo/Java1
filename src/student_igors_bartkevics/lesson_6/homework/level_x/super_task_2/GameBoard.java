package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

public class GameBoard {

	private int[][] field;

	public GameBoard() {
		this.field = createField();
	}

	public int getCell(int x, int y) {
		return field[x][y];
	}


	public boolean isWinPosition(int playerToCheck) {
		return isWinPositionForHorizontals(playerToCheck) ||
				isWinPositionForVerticals(playerToCheck) ||
				isWinPositionForDiagonals(playerToCheck);
	}

	public boolean isDrawPosition() {
		return isFieldFilled()
				&& !isWinPosition(1)
				&& !isWinPosition(0);
	}

	public void doMove(Move move, int sign) {
		field[move.getX()][move.getY()] = sign;
	}

	public boolean isFieldFilled() {
		boolean result = true;
		for (int[] rows : field) {
			for (int intValue : rows) {
				if (intValue == -1) {
					result = false;
					break;
				}
			}
		}
		return result;
	}


	private boolean isWinPositionForDiagonals(int playerToCheck) {
		boolean result = false;
		if ((field[1][1] == playerToCheck) &&
				(((field[1][1] == field[0][0]) && (field[1][1] == field[2][2])) ||
						((field[1][1] == field[2][0]) && (field[1][1] == field[0][2])))) {
			result = true;
		}
		return result;
	}

	private boolean isWinPositionForVerticals(int playerToCheck) {
		boolean result = false;
		for (int j = 0; j < field[0].length; j++) {
			if ((field[0][j] == field[1][j]) && (field[1][j] == field[2][j]) && (field[2][j] == playerToCheck)) {
				result = true;
				break;
			}
		}
		return result;
	}

	private boolean isWinPositionForHorizontals(int playerToCheck) {
		boolean result = false;
		for (int[] ints : field) {
			if ((ints[0] == ints[1]) && (ints[1] == ints[2]) && (ints[2] == playerToCheck)) {
				result = true;
				break;
			}
		}
		return result;
	}


	private int[][] createField() {
		int[][] field = new int[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				field[row][column] = -1;
			}
		}
		return field;
	}

	public void printBoardToConsole() {
		for (int[] rows : field) {
			for (int intValue : rows) {
				System.out.print(intValue + "  ");
			}
			System.out.print("\n");
		}
	}

}