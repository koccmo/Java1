package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

import java.util.Random;

public class NewLevelMonsters {

    MoveInformation [] monsters (int level, GameField field){

        MoveInformation [] monstersArray = new MoveInformation [level + 2];
        for (int i = 0; i < monstersArray.length; i++){
            monstersArray[i] = new MoveInformation( Direction.LEFT, new Coordinates(0, 0));
            monstersArray[i].setCoordinates(createRandomCoordinates(field));
            monstersArray[i].setDirection(createRandomDirection());
        }
        return monstersArray;
    }

    private Coordinates createRandomCoordinates(GameField field){
        int x = 0;
        int y = 0;
        do{
            Random rd = new Random();
            x = rd.nextInt(42);
            y = rd.nextInt(15);

        }while( //(((x < 0) || (x > 41)) || ((y < 0) || (y > 14))) ||
            field.getElementOfField(new Coordinates(x, y)) != 0);

        return new Coordinates(x, y);
    }

    private Direction createRandomDirection(){
        Random rd = new Random();
        int dir = rd.nextInt(4);
        switch (dir){
            case 0 : return Direction.UP;
            case 1 : return Direction.DOWN;
            case 2 : return Direction.RIGHT;
            case 3 : return Direction.LEFT;
        }
        return Direction.LEFT;
    }

}
