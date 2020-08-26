package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

import java.util.Random;

public class MonsterMove {

    Coordinates getNextMove (GameField field, MoveInformation moveInformation) {

        if (!movementContinues(field, moveInformation)){
            Direction newDirection = createNewDirection(field, moveInformation);
            moveInformation.setDirection(newDirection);
        }

        return newCoordinates(moveInformation);
    }

    private Direction createNewDirection(GameField field, MoveInformation moveInformation){

        boolean validDirection = false;
        Direction direction = moveInformation.getDirection();

        while (!validDirection) {
            Random rd = new Random();
            int input = rd.nextInt(4);
            switch (input) {
                case 0 : direction = Direction.UP; break;
                case 1 : direction = Direction.DOWN; break;
                case 2 : direction = Direction.LEFT; break;
                case 3 : direction = Direction.RIGHT; break;
            }

            moveInformation.setDirection(direction);
            if (movementContinues(field, moveInformation)) validDirection = true;
        }
        return direction;
    }

    private boolean movementContinues(GameField field, MoveInformation moveInformation){

            IfPossibleMove ifPossibleMove = new IfPossibleMove();
            return ifPossibleMove.possibleMove(field, moveInformation);

    }

    private Coordinates newCoordinates(MoveInformation moveInformation){

        Direction direction = moveInformation.getDirection();
        Coordinates xy = moveInformation.getCoordinates();

        switch (direction) {
            case UP: {Coordinates newCoordinates = new Coordinates(xy.getX(),xy.getY()-1);
                        return newCoordinates;
                        }
            case DOWN: {Coordinates newCoordinates = new Coordinates(xy.getX(),xy.getY()+1);
                return newCoordinates;
            }
            case RIGHT: {Coordinates newCoordinates = new Coordinates(xy.getX()+1,xy.getY());
                return newCoordinates;
            }
            case LEFT: {Coordinates newCoordinates = new Coordinates(xy.getX()-1,xy.getY());
                return newCoordinates;
            }
        }
        return new Coordinates(0, 0);
    }

}
