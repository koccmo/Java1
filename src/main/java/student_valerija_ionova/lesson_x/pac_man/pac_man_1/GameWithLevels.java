package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

public class GameWithLevels {

    public static void main(String [] args) {

        int level = 1;
        int totalScore = 0;

        GameField gameField = new GameField();
        gameField.createNewFieldManually();

        PacManMove pacManMove = new PacManMove();
        PacManFactory pacManFactory =new PacManFactory();
        MoveInformation pacManMoveInformation = pacManFactory.createPacMan(19, 10, Direction.LEFT);
        gameField.updateField(3, pacManMoveInformation.getCoordinates());

        MonsterMove monsterMove = new MonsterMove();

        NewLevelMonsters newLevelMonsters = new NewLevelMonsters();
        MoveInformation [] monstersMoveInformation = newLevelMonsters.monsters(level, gameField);
        for (MoveInformation info : monstersMoveInformation){
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

            if (victoryOrLose.lose(pacManMoveInformation, monstersMoveInformation)) {
                life--;
                System.out.println("Lives: " + life);
                minusLife = true;
            }

            for (int monsterCount = 0; monsterCount < monstersMoveInformation.length; monsterCount++){
                Coordinates newCoordinates = monsterMove.getNextMove(gameField, monstersMoveInformation[monsterCount]);
                if (gameField.getElementOfBonusField(monstersMoveInformation[monsterCount].getCoordinates()) == 0) {
                    gameField.updateField(0, monstersMoveInformation[monsterCount].getCoordinates());
                } else {
                    gameField.updateField(4, monstersMoveInformation[monsterCount].getCoordinates());
                }
                gameField.updateField(2, newCoordinates);
                monstersMoveInformation[monsterCount].setCoordinates(newCoordinates);
            }

            if (!minusLife){
                if (victoryOrLose.lose(pacManMoveInformation, monstersMoveInformation)) {
                    life--;
                    System.out.println("Lives: " + life);
                }
            }

            if (victoryOrLose.win(gameField)) {
                level ++;
                System.out.println("Level complete!\nLet's start level "+level);
                totalScore += 362 - gameField.numberOfBonuses();
                gameField.createNewFieldManually();
                pacManMoveInformation = pacManFactory.createPacMan(19, 10, Direction.LEFT);
                monstersMoveInformation = newLevelMonsters.monsters(level, gameField);

            }

        }



        System.out.println("\n The End! \n Total Score: "+ (totalScore + 362 - gameField.numberOfBonuses())+"\n" +
                "Levels completed: "+ (level-1));
    }

}
