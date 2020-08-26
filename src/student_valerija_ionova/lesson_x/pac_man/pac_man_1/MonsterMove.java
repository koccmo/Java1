package student_valerija_ionova.lesson_x.pac_man.pac_man_1;


import java.util.Random;

public class MonsterMove {

    Coordinates getNextMove (GameField field, MoveInformation moveInformation) {

        if (movementContinues(field, moveInformation)){
            return newCoordinates(moveInformation);
        }else{
            Direction newDirection = createNewDirection();
            moveInformation.setDirection(newDirection);
            return newCoordinates(moveInformation);
        }

    }

    private Direction createNewDirection(){ //Учесть старыее координаты и стены!!!!
        int x;
        int y;

        Random rd = new Random();
        int input = rd.nextInt(4);
        switch (input){
            //case 0 : Direction direction =
        }


        return Direction.DOWN;
    }

    private boolean movementContinues(GameField field, MoveInformation moveInformation){

            IfPossibleMove ifPossibleMove = new IfPossibleMove();
            return ifPossibleMove.possibleMoveForMonster(field, moveInformation);

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
