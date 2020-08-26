package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

public class PacManFactory {

    MoveInformation createPacMan (int x, int y, Direction direction){
        Coordinates coordinates = new Coordinates(x, y);
        return new MoveInformation(direction, coordinates);
    }

}
