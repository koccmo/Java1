package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class GameWithComputer {

    public void playWithComputer() {

        PlayersMove playersMove = new PlayersMove();
        VictoryCondition victoryCondition = new VictoryCondition();
        ComputersMoveMI computersMoveMI = new ComputersMoveMI();
        Field field = new Field();
        ComputersPerspectiveMoveLogic computersMI = new ComputersPerspectiveMoveLogic();

        field.createNewField();
        System.out.println("Let's start game:");
        field.printFieldToConsole(field.getField());

        boolean gameContinues = true;
        while(gameContinues) {

            Move move0;
            boolean freeField = false;
            do {
                move0 = playersMove.getNextMove(0);
                if (field.getField()[move0.getY()][move0.getX()] == -1) {
                    freeField = true;
                } else {
                    System.out.println("It's not free field! Please try one more time!");
                }
            } while (!freeField);

            field.getField()[move0.getY()][move0.getX()] = 0;

            gameContinues = victoryCondition.checkWinner(field.getField(), 0);

            field.printFieldToConsole(field.getField());

            if (gameContinues){
                System.out.println("Computers's turn!");

                Move move1 = computersMoveMI.computersTurn(field.getField());

                field.getField()[move1.getY()][move1.getX()] = 1;
                field.printFieldToConsole(field.getField());

                gameContinues = victoryCondition.checkWinner(field.getField(), 1);
            }
        }  //end of the game
    }
}
