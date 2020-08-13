package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

import java.util.Random;

public class AIPlayer implements Player {

	@Override
	public Move nextMove(GameBoard board) {
		Move move = getAINextRandomMove(board);
		if (isHorizontalChanceToWin(board,1)) {
			move = moveForHorizontalWin(board,1);
		}
		else if (isVerticalChanceToWin(board, 1)) {
			move = moveForVerticalWin(board, 1);
		}
		else if (isDiagonal_1_ChanceToWin(board,1)) {
			move = moveForDiagonal_1_Win(board,1);
		}
		else if (isDiagonal_2_ChanceToWin(board,1)) {
			move = moveForDiagonal_2_Win(board,1);
		}
		else if (isVerticalChanceToWin(board, 0)) {
			move = moveForVerticalBlock(board);
		}
		else if (isHorizontalChanceToWin(board,0)) {
			move = moveForHorizontalBlock(board);
		}
		else if (isDiagonal_1_ChanceToWin(board,0)){
			move = moveForDiagonal_1_Block(board);
		}
		else if (isDiagonal_2_ChanceToWin(board, 0)){
			move = moveForDiagonal_2_Block(board);
		}
		return move;
	}

	private Move moveForDiagonal_1_Block(GameBoard board) {
		Move move = getAINextRandomMove(board);

		if ((board.getCell(0, 0) == board.getCell(1,1) && (board.getCell(1, 1) == 0) && (board.getCell(2, 2) == -1))) {
			move = new Move(2, 2);
		}
		else if ((board.getCell(0, 0) == board.getCell(2, 2)) && (board.getCell(2, 2) == 0) && (board.getCell(1, 1) == -1)) {
			move = new Move(1, 1);
		}
		else if ((board.getCell(1, 1) == board.getCell(2, 2)) && (board.getCell(2, 2) == 0) && (board.getCell(0, 0) == -1)) {
			move = new Move(0, 0);
		}

		return move;
	}

	private Move moveForDiagonal_2_Block(GameBoard board) {
		Move move = getAINextRandomMove(board);

		if ((board.getCell(0, 2) == board.getCell(1, 1)) && (board.getCell(1, 1) == 0) && (board.getCell(2, 0) == -1)) {
			move = new Move(2, 0);
		}
		else if ((board.getCell(0, 2) == board.getCell(2, 0)) && (board.getCell(2, 0) == 0) && (board.getCell(1, 1) == -1)) {
			move = new Move(1, 1);
		}
		else if ((board.getCell(1, 1) == board.getCell(2, 0)) && (board.getCell(2, 0) == 0) && (board.getCell(0, 2) == -1)) {
			move = new Move(0, 2);
		}

		return move;
	}

	private Move moveForVerticalBlock(GameBoard board) {
		Move move = getAINextRandomMove(board);
		for (int j = 0; j < 3; j++) {
			if ((board.getCell(0, j) == board.getCell(1, j)) && (board.getCell(1, j) == 0) && (board.getCell(2, j) == -1)) {
				move = new Move(2, j);
				break;
			}
			if ((board.getCell(1, j) == board.getCell(2, j)) && (board.getCell(2, j) == 0) && (board.getCell(0, j) == -1)) {
				move = new Move(0, j);
				break;
			}
			if ((board.getCell(0, j) == board.getCell(2, j)) && (board.getCell(2, j) == 0) && (board.getCell(1, j) == -1)) {
				move = new Move(1, j);
				break;
			}
		}
		return move;
	}

	private Move moveForHorizontalBlock(GameBoard board) {
		Move move = getAINextRandomMove(board);
		for (int i = 0; i < 3; i++) {
			if ((board.getCell(i, 0) == board.getCell(i, 1)) && (board.getCell(i, 1) == 0) && (board.getCell(i, 2) == -1)) {
				move = new Move(i, 2);
				break;
			}
			if ((board.getCell(i, 1) == board.getCell(i, 2)) && (board.getCell(i, 2) == 0) && (board.getCell(i, 0) == -1)) {
				move = new Move(i, 0);
				break;
			}
			if ((board.getCell(i, 0) == board.getCell(i, 2)) && (board.getCell(i, 2) == 0) && (board.getCell(i, 1) == -1)) {
				move = new Move(i, 1);
				break;
			}
		}
		return move;
	}

	private Move moveForDiagonal_1_Win(GameBoard board, int player) {
		Move move = getAINextRandomMove(board);

		if ((board.getCell(0, 0) == board.getCell(1, 1)) && (board.getCell(1, 1) == player) && (board.getCell(2, 2) == -1)) {
			move = new Move(2, 2);
		}
		else if ((board.getCell(0, 0) == board.getCell(2, 2)) && (board.getCell(2, 2) == player) && (board.getCell(1, 1) == -1)) {
			move = new Move(1, 1);
		}
		else if ((board.getCell(1, 1) == board.getCell(2, 2)) && (board.getCell(2, 2) == player) && (board.getCell(0, 0) == -1)) {
			move = new Move(0, 0);
		}

		return move;
	}

	private Move moveForDiagonal_2_Win(GameBoard board, int player) {
		Move move = getAINextRandomMove(board);

		if ((board.getCell(0, 2) == board.getCell(1, 1)) && (board.getCell(1, 1) == player) && (board.getCell(2, 0) == -1)) {
			move = new Move(2, 0);
		}
		else if ((board.getCell(0, 2) == board.getCell(2, 0)) && (board.getCell(2, 0) == player) && (board.getCell(1, 1) == -1)) {
			move = new Move(1, 1);
		}
		else if ((board.getCell(1, 1) == board.getCell(2, 0)) && (board.getCell(2, 0) == player) && (board.getCell(0, 2) == -1)) {
			move = new Move(0, 2);
		}

		return move;
	}



	private boolean isDiagonal_1_ChanceToWin(GameBoard board, int playerToCheck) {
		boolean result = false;
		if (((board.getCell(0, 0) == board.getCell(1, 1)) && (board.getCell(1, 1) == playerToCheck) && (board.getCell(2, 2) == -1)) ||
				((board.getCell(0, 0) == board.getCell(2, 2)) && (board.getCell(2, 2) == playerToCheck) && (board.getCell(1, 1) == -1)) ||
				((board.getCell(1, 1) == board.getCell(2, 2)) && (board.getCell(2, 2) == playerToCheck) && (board.getCell(0, 0) == -1))) {
			result = true;
		}
		return result;
	}

	private boolean isDiagonal_2_ChanceToWin(GameBoard board, int playerToCheck) {
		boolean result = false;
		if (((board.getCell(0, 2) == board.getCell(1, 1)) && (board.getCell(1, 1) == playerToCheck) && (board.getCell(2, 0) == -1)) ||
				((board.getCell(0, 2) == board.getCell(2, 0)) && (board.getCell(2, 0) == playerToCheck) && (board.getCell(1, 1) == -1)) ||
				((board.getCell(1, 1) == board.getCell(2, 0)) && (board.getCell(2, 0) == playerToCheck) && (board.getCell(0, 2) == -1))) {
			result = true;
		}
		return result;
	}

	private Move moveForVerticalWin(GameBoard board, int player) {
		Move move = getAINextRandomMove(board);
		for (int j = 0; j < 3; j++) {
			if ((board.getCell(0, j) == board.getCell(1, j)) && (board.getCell(1, j) == player) && (board.getCell(2, j) == -1)) {
				move = new Move(2, j);
				break;
			}
			if ((board.getCell(1, j) == board.getCell(2, j)) && (board.getCell(2, j) == player) && (board.getCell(0, j) == -1)) {
				move = new Move(0, j);
				break;
			}
			if ((board.getCell(0, j) == board.getCell(2, j)) && (board.getCell(2, j) == player) && (board.getCell(1, j) == -1)) {
				move = new Move(1, j);
				break;
			}
		}
		return move;
	}

	
	private boolean isVerticalChanceToWin(GameBoard board, int playerToCheck) {
		boolean result = false;
		for (int j = 0; j < 3; j++) {
			if ( ((board.getCell(0, j) == board.getCell(1, j)) && (board.getCell(1, j) == playerToCheck) && (board.getCell(2, j) == -1)) ||
					((board.getCell(1, j) == board.getCell(2, j)) && (board.getCell(2, j) == playerToCheck) && (board.getCell(0, j) == -1)) ||
					((board.getCell(0, j) == board.getCell(2, j)) && (board.getCell(2, j) == playerToCheck) && (board.getCell(1, j) == -1)) ) {
				result = true;
				break;
			}
		}
		return result;
	}

	private Move moveForHorizontalWin(GameBoard board, int player) {
		Move move = getAINextRandomMove(board);
		for (int i = 0; i < 3; i++) {
			if ((board.getCell(i, 0) == board.getCell(i, 1)) && (board.getCell(i, 1) == player) && (board.getCell(i, 2) == -1)) {
				move = new Move(i, 2);
				break;
			}
			if ((board.getCell(i, 1) == board.getCell(i, 2)) && (board.getCell(i, 2) == player) && (board.getCell(i, 0) == -1)) {
				move = new Move(i, 0);
				break;
			}
			if ((board.getCell(i, 0) == board.getCell(i, 2)) && (board.getCell(i, 2) == player) && (board.getCell(i, 1) == -1)) {
				move = new Move(i, 1);
				break;
			}
		}
		return move;
	}

	private boolean isHorizontalChanceToWin(GameBoard board, int playerToCheck) {
		boolean result = false;
		for (int i = 0; i < 3; i++) {
			if ( ((board.getCell(i, 0) == board.getCell(i, 1)) && (board.getCell(i, 1) == playerToCheck) && (board.getCell(i, 2) == -1)) ||
					((board.getCell(i, 1) == board.getCell(i, 2)) && (board.getCell(i, 2) == playerToCheck) && (board.getCell(i, 0) == -1)) ||
					((board.getCell(i, 0) == board.getCell(i, 2)) && (board.getCell(i, 2) == playerToCheck) && (board.getCell(i, 1) == -1)) ) {
				result = true;
				break;
			}
		}
		return result;
	}

	private Move getAINextRandomMove(GameBoard board) {
		Random random = new Random();
		int row;
		int column;
		if (!board.isFieldFilled()) {
			do {
				row = random.nextInt(3);
				column = random.nextInt(3);
			} while (board.getCell(row, column) != -1);
			return new Move(row, column);
		}
		else {
			System.out.println("Field is filled");
			return new Move(0, 0);
		}
	}
	
}