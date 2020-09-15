package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class PacManMoveTest {

    public static void main (String [] args){
        GameField gameField = new GameField();
        gameField.createNewFieldManually();

        PacManMove pacManMove = new PacManMove();
        PacManFactory pacManFactory = new PacManFactory();
        MoveInformation moveInformation = pacManFactory.createPacMan(19, 10, Direction.LEFT);

        int i = 0;

        while (i < 100){
            gameField.printBoard();

            Coordinates coordinatesPM = pacManMove.getNextMove(gameField, moveInformation);

            gameField.updateField(4, moveInformation.getCoordinates());

            gameField.updateField(3, coordinatesPM);

            moveInformation.setCoordinates(coordinatesPM);
            i++;
        }

    }

}
