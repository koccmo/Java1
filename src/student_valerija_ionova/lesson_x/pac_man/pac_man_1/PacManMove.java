package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

import java.util.Scanner;

class PacManMove {

    Coordinates getNextMove(GameField field, MoveInformation moveInformation) {

        Scanner input = new Scanner(System.in);
        if (input.hasNext()){
            switch (input.nextInt()){
                case 8 : moveInformation.setDirection(Direction.UP); break;
                case 4 : moveInformation.setDirection(Direction.LEFT); break;
                case 6 : moveInformation.setDirection(Direction.RIGHT); break;
                case 2 : moveInformation.setDirection(Direction.DOWN); break;

            }
        }else{
        return newCoordinates(field, moveInformation);
        }
        return newCoordinates(field, moveInformation);
    }

    private Coordinates newCoordinates(GameField field, MoveInformation moveInformation){

        Direction direction = moveInformation.getDirection();
        Coordinates xy = moveInformation.getCoordinates();

        if (movementContinues(field, moveInformation)) {

            switch (direction) {
                case UP: {
                    Coordinates newCoordinates = new Coordinates(xy.getX(), xy.getY() - 1);
                    return newCoordinates;
                }
                case DOWN: {
                    Coordinates newCoordinates = new Coordinates(xy.getX(), xy.getY() + 1);
                    return newCoordinates;
                }
                case RIGHT: {
                    Coordinates newCoordinates = new Coordinates(xy.getX() + 1, xy.getY());
                    return newCoordinates;
                }
                case LEFT: {
                    Coordinates newCoordinates = new Coordinates(xy.getX() - 1, xy.getY());
                    return newCoordinates;
                }
            }
        }
        return moveInformation.getCoordinates();
    }

    private boolean movementContinues(GameField field, MoveInformation moveInformation){

        IfPossibleMove ifPossibleMove = new IfPossibleMove();
        return ifPossibleMove.possibleMove(field, moveInformation);

    }

}