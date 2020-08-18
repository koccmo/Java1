package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

public class Game {

    Player player1;
    Player player2;

    Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    HumansMove humansMove = new HumansMove();
    Field field = new Field();
    ComputersMove computersMoveMI = new ComputersMove();

    public void play() {

        field.createNewField();
        System.out.println("Let's start game:");
        field.printFieldToConsole();

        boolean gameContinues = true;
        while(gameContinues) {

            Move move0 = detectPlayer(player1, field, 0);
            field.getField()[move0.getY()][move0.getX()] = 0;

            gameContinues = field.checkWinner(0);

            field.printFieldToConsole();

            if (gameContinues){

                Move move1 = detectPlayer(player2, field, 1);

                field.getField()[move1.getY()][move1.getX()] = 1;
                field.printFieldToConsole();

                gameContinues = field.checkWinner(1);
            }
        }  //end of the game
    }

    private Move detectPlayer (Player player, Field field, int sign){
        if (player.equals(Player.HUMAN)){
            return humansMove.getNextMove(sign, field);
        }else{
            return computersMoveMI.computersTurn(field, sign);
        }
    }

}
