package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v1;

class PlayWithComputer {

    TicTacToe ticTacToe = new TicTacToe();

    public void playWithComputer() {
        int[][] field = ticTacToe.createField();
        System.out.println("Let's start game:");
        ticTacToe.printFieldToConsole(field);
        while(true) {
            Move move0;
            boolean freeField = false;
            do {
                move0 = ticTacToe.getNextMove(0);
                if (field[move0.getY()][move0.getX()] == -1){
                    freeField = true;
                }else{
                    System.out.println("It's not free field! Please try one more time!");
                }
            }while(!freeField);

            field[move0.getY()][move0.getX()] = 0;
            if (ticTacToe.isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (ticTacToe.isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            ticTacToe.printFieldToConsole(field);
            System.out.println("Computers's turn!");

            Move move1 = ticTacToe.computersTurn(field);


            field[move1.getY()][move1.getX()] = 1;
            ticTacToe.printFieldToConsole(field);
            if (ticTacToe.isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (ticTacToe.isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


        }  //end of the game
    }
}
