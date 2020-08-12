package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

public class TicTacToe {

	private GameBoard gameBoard = new GameBoard();
	private Player player1 = new HumanPlayer();
	private Player player2 = new AIPlayer();

	public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        gameBoard.printBoardToConsole();
        while(true) {
            Move move0 = player1.nextMove(gameBoard);
            gameBoard.doMove(move0, 0);
			gameBoard.printBoardToConsole();
            if (gameBoard.isWinPosition(0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (gameBoard.isDrawPosition()) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = player2.nextMove(gameBoard);
            gameBoard.doMove(move1, 1);
			gameBoard.printBoardToConsole();
            if (gameBoard.isWinPosition(1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (gameBoard.isDrawPosition()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}