package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

public class MoveInformation {

    private Direction direction;

    private Coordinates coordinates;

    MoveInformation (Direction direction, Coordinates coordinates){
        this.direction = direction;
        this.coordinates = coordinates;
    }

    Direction getDirection(){
        return direction;
    }

    Coordinates getCoordinates(){
        return coordinates;
    }

    void setDirection(Direction direction){
        this.direction = direction;
    }

    void setCoordinates(Coordinates coordinates){
        this.coordinates = coordinates;
    }

}
