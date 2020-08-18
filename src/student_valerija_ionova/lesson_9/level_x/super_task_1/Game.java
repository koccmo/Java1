package student_valerija_ionova.lesson_9.level_x.super_task_1;

class Game {

    Field field = new Field();
    PlayersMove playersMove = new PlayersMove();

    void game(){
        field.createNewField();
        System.out.println("Let's start game!\n");
        field.printField();

        while(true){
            System.out.println("Please enter coordinates for player 3");
            Coordinates move3 = playersMove.newMove(field);
            field.getField()[move3.getY()][move3.getX()] = 3;
            field.printField();
            if (field.win(3)){
                System.out.println("Player 3 WON!");
                break;
            }
            if (field.fullField()){
                System.out.println("Full field. The end!");
                break;
            }

            System.out.println("Please enter coordinates for player 8");
            Coordinates move8 = playersMove.newMove(field);
            field.getField()[move8.getY()][move8.getX()] = 8;
            field.printField();
            if (field.win(8)){
                System.out.println("Player 8 WON!");
                break;
            }
            if (field.fullField()){
                System.out.println("Full field. The end!");
                break;
            }
        }
    }
}
