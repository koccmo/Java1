package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

public class IfPossibleMove {

    boolean possibleMoveForMonster(GameField field, MoveInformation moveInformation){

        Coordinates coordinates = moveInformation.getCoordinates();
        Direction direction = moveInformation.getDirection();

        switch (direction){
            case UP : {Coordinates newCoordinates = new Coordinates(coordinates.getX(),coordinates.getY()-1);
                return !(field.getElementOfField(newCoordinates) == 1);}
            case DOWN: {Coordinates newCoordinates = new Coordinates(coordinates.getX(),coordinates.getY()+1);
                return !(field.getElementOfField(newCoordinates) == 1);}
            case LEFT: {Coordinates newCoordinates = new Coordinates(coordinates.getX()-1,coordinates.getY());
                return !(field.getElementOfField(newCoordinates) == 1);}
            case RIGHT: {Coordinates newCoordinates = new Coordinates(coordinates.getX()+1,coordinates.getY());
                return !(field.getElementOfField(newCoordinates) == 1);}
        }
        return false;
    }



}
