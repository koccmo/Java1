package student_valerija_ionova.lesson_16.level_3_junior.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Challenge {

    private int xMax;
    private int yMax;
    private int [][] field;
    private List <RobotStartPositionParameters> startInformation;

    Challenge(String xyMax, RobotStartPositionParameters...robotStartPositionParameters){
        this.xMax = Integer.parseInt(xyMax.split(" ")[0]);
        this.yMax = Integer.parseInt(xyMax.split(" ")[1]);
        this.startInformation = new ArrayList<>(Arrays.asList(robotStartPositionParameters));
        this.field = new int [yMax+1] [xMax+1];
    }

    List <MoveInformation> marsRoverMovements (){
        fillFieldWithRobots ();
        List <MoveInformation> result = new ArrayList <>();
        for (RobotStartPositionParameters info : startInformation) {
            MoveInformation resultPosition = info.getMoveInformation();
            String[] movesArray = info.getMoves().split("");
            for (int i = 0; i < movesArray.length; i++) {
                resultPosition = getNextPosition(resultPosition, movesArray[i]);
            }
            result.add(resultPosition);
        }
        return result;
    }

    private void fillFieldWithRobots (){
        for (RobotStartPositionParameters info : startInformation) {
            field[info.getMoveInformation().getY()][info.getMoveInformation().getX()] = 1;
        }
    }

    private MoveInformation getNextPosition (MoveInformation moveInformation, String direction){
        MoveInformation resultPosition;
        if (direction.equals("M")){
            resultPosition = newStepTheSameDirection (moveInformation);
        }else{
            resultPosition = changeDirectionAtTheSamePlace (moveInformation, direction);
        }
        return resultPosition;
    }

    private MoveInformation newStepTheSameDirection (MoveInformation moveInformation){
        field[moveInformation.getY()][moveInformation.getX()] = 0;
        MoveInformation resultPosition = moveInformation;
            switch (moveInformation.getDirection()){
                case "N":  {resultPosition.setY(updatePositionNorth(moveInformation)); break;}
                case "S":  {resultPosition.setY(updatePositionSouth(moveInformation)); break;}
                case "E":  {resultPosition.setX(updatePositionEast(moveInformation)); break;}
                case "W":  {resultPosition.setX(updatePositionWest(moveInformation)); break;}
        }
        field[resultPosition.getY()][resultPosition.getX()] = 1;
        return  resultPosition;
    }

    private int updatePositionNorth (MoveInformation moveInformation){
        int y = moveInformation.getY();
        if ((moveInformation.getY() < (field.length-1)) &&
                (field[moveInformation.getY()+1][moveInformation.getX()] == 0)){
            y = moveInformation.getY()+1;
        }
        return y;
    }

    private int updatePositionSouth (MoveInformation moveInformation){
        int y = moveInformation.getY();
        if ((moveInformation.getY() > 0) && (field[moveInformation.getY()-1][moveInformation.getX()] == 0)){
            y = (moveInformation.getY()-1);
        }
        return y;
    }

    private int updatePositionEast (MoveInformation moveInformation){
        int x = moveInformation.getX();
        if ((moveInformation.getX() < (field[0].length-1)) &&
                (field[moveInformation.getY()][moveInformation.getX() + 1] == 0)){
            x = (moveInformation.getX()+1);
        }
        return x;
    }

    private int updatePositionWest (MoveInformation moveInformation){
        int x = moveInformation.getX();
        if ((moveInformation.getX() > 0) &&
                (field[moveInformation.getY()][moveInformation.getX() - 1] == 0)){
            x = (moveInformation.getX()-1);
        }
        return x;
    }

    private MoveInformation changeDirectionAtTheSamePlace (MoveInformation moveInformation, String direction){
        MoveInformation resultPosition = moveInformation;
        resultPosition.setX(moveInformation.getX());
        resultPosition.setY(moveInformation.getY());
        String [] directions = { "W", "N", "E", "S", "W"};
        if (direction.equals("R")){
            resultPosition.setDirection(directions[Arrays.asList(directions).indexOf(moveInformation.getDirection()) + 1]);
        }else{
            resultPosition.setDirection(directions[Arrays.asList(directions).lastIndexOf(moveInformation.getDirection()) - 1]);
        }
        return resultPosition;
    }
}
