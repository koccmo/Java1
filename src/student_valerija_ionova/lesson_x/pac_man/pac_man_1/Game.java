package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

public class Game {

    public static void main(String [] args) {
        boolean gameContinues = false;

        GameField gameField = new GameField();
        gameField.createNewFieldManually();

        PacManMove pacManMove = new PacManMove();
        PacManFactory pacManFactory =new PacManFactory();
        pacManFactory.createPacMan(19, 11, Direction.LEFT); ///Что делать с направлением?

        MonsterMove monsterMove = new MonsterMove();

        MonsterFactory monsterFactory = new MonsterFactory();
        MoveInformation monster1MoveInformation = monsterFactory.createMonster(5, 2, Direction.LEFT);
        MoveInformation monster2MoveInformation = monsterFactory.createMonster(16, 2, Direction.DOWN);
        MoveInformation monster3MoveInformation = monsterFactory.createMonster(34, 2, Direction.RIGHT);

        int i=0;

        while (i<100){
            gameField.printBoard();

            //pacManMove.getNextMove(gameField);

            Coordinates newCoordinates = monsterMove.getNextMove(gameField, monster1MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster1MoveInformation.getCoordinates());
            }else{
                gameField.updateField(4, monster1MoveInformation.getCoordinates());
            }
            gameField.updateField(2, newCoordinates);
            monster1MoveInformation.setCoordinates(newCoordinates);

            newCoordinates = monsterMove.getNextMove(gameField, monster2MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster2MoveInformation.getCoordinates());
            }else{
                gameField.updateField(4, monster2MoveInformation.getCoordinates());
            }
            gameField.updateField(2, newCoordinates);
            monster2MoveInformation.setCoordinates(newCoordinates);

            newCoordinates = monsterMove.getNextMove(gameField, monster3MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster3MoveInformation.getCoordinates());
            }else{
                gameField.updateField(4, monster3MoveInformation.getCoordinates());
            }

            gameField.updateField(2, newCoordinates);
            monster3MoveInformation.setCoordinates(newCoordinates);

            i++;
        }
    }
}
