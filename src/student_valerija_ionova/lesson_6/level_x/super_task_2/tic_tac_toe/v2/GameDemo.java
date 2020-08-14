package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class GameDemo {

    public static void main (String [] args){

        Player player1 = Player.COMPUTER;
        Player player2 = Player.HUMAN;

        Game game = new Game(player1, player2);

        game.play();
    }

}
