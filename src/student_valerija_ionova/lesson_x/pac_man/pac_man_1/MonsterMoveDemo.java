package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class MonsterMoveDemo {

    public static void main (String [] args){
    GameField gameField = new GameField();
    gameField.createNewFieldManually();
    MonsterMove monsterMove = new MonsterMove();
    Coordinates xy = new Coordinates(5, 2);
    Direction direction = Direction.LEFT;
    MoveInformation moveInformation = new MoveInformation(direction, xy);

    int i = 0;

    while (i < 50){
        gameField.printBoard();

        Coordinates coordinates = monsterMove.getNextMove(gameField, moveInformation);

        if (gameField.getElementOfBonusField(moveInformation.getCoordinates()) == 0){
            gameField.updateField(0, moveInformation.getCoordinates());
        }else{
            gameField.updateField(4, moveInformation.getCoordinates());
        }

        gameField.updateField(2, coordinates);

        moveInformation.setCoordinates(coordinates);
        i++;
    }

    }

}
