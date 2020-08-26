package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class Game {

    public static void main(String [] args) {

        GameField gameField = new GameField();
        gameField.createNewFieldManually();

        PacManMove pacManMove = new PacManMove();
        PacManFactory pacManFactory =new PacManFactory();
        MoveInformation pacManMoveInformation = pacManFactory.createPacMan(19, 10, Direction.LEFT); ///Что делать с направлением?
        gameField.updateField(3, pacManMoveInformation.getCoordinates());

        MonsterMove monsterMove = new MonsterMove();

        MonsterFactory monsterFactory = new MonsterFactory();

        MoveInformation [] monstersMoveInformationArray = new MoveInformation [3];
        MoveInformation monster1MoveInformation = monsterFactory.createMonster(5, 2, Direction.LEFT);
        MoveInformation monster2MoveInformation = monsterFactory.createMonster(16, 2, Direction.DOWN);
        MoveInformation monster3MoveInformation = monsterFactory.createMonster(34, 2, Direction.RIGHT);

        monstersMoveInformationArray[0] = monster1MoveInformation;
        monstersMoveInformationArray[1] = monster2MoveInformation;
        monstersMoveInformationArray[2] = monster3MoveInformation;

        for (MoveInformation info : monstersMoveInformationArray){
            gameField.updateField(2, info.getCoordinates());
        }


        VictoryOrLose victoryOrLose = new VictoryOrLose();

        int life = 3;

        while (life>0) {
            boolean minusLife = false;
            gameField.printBoard();

            Coordinates coordinatesPM = pacManMove.getNextMove(gameField, pacManMoveInformation);
            gameField.updateField(4, pacManMoveInformation.getCoordinates());
            gameField.updateFieldOfBonuses(4, pacManMoveInformation.getCoordinates());
            gameField.updateField(3, coordinatesPM);
            pacManMoveInformation.setCoordinates(coordinatesPM);

            if (victoryOrLose.lose(pacManMoveInformation, monstersMoveInformationArray)) {
                life--;
                System.out.println("Lives: " + life);
                minusLife = true;
            }

            if (victoryOrLose.win(gameField)) {
                break;
            }

            Coordinates newCoordinates = monsterMove.getNextMove(gameField, monster1MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster1MoveInformation.getCoordinates());
            } else {
                gameField.updateField(4, monster1MoveInformation.getCoordinates());
            }
            gameField.updateField(2, newCoordinates);
            monster1MoveInformation.setCoordinates(newCoordinates);


            newCoordinates = monsterMove.getNextMove(gameField, monster2MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster2MoveInformation.getCoordinates());
            } else {
                gameField.updateField(4, monster2MoveInformation.getCoordinates());
            }
            gameField.updateField(2, newCoordinates);
            monster2MoveInformation.setCoordinates(newCoordinates);

            newCoordinates = monsterMove.getNextMove(gameField, monster3MoveInformation);
            if (gameField.getElementOfBonusField(monster1MoveInformation.getCoordinates()) == 0) {
                gameField.updateField(0, monster3MoveInformation.getCoordinates());
            } else {
                gameField.updateField(4, monster3MoveInformation.getCoordinates());
            }

            gameField.updateField(2, newCoordinates);
            monster3MoveInformation.setCoordinates(newCoordinates);

            if (!minusLife){
                if (victoryOrLose.lose(pacManMoveInformation, monstersMoveInformationArray)) {
                    life--;
                    System.out.println("Lives: " + life);
                }
            }
        }
        System.out.println("\n The End! \n Score: "+ (362 - gameField.numberOfBonuses()));
    }
}
