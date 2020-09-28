package student_valerija_ionova.lesson_16.level_3_junior.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MoveLogic {

    int xMax;
    int yMax;
    int [][] field = new int [yMax+1] [xMax+1];
    List<RobotStartPositionParameters> startInformation;

    MoveLogic (String xyMax, RobotStartPositionParameters...robotStartPositionParameters){
        this.xMax = Integer.parseInt(xyMax.split(" ")[0]);
        this.yMax = Integer.parseInt(xyMax.split(" ")[1]);
        this.startInformation = new ArrayList<>(Arrays.asList(robotStartPositionParameters));
    }

    List <MoveInformation> marsRoverMovements (){
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
        MoveInformation resultPosition = moveInformation;
            switch (moveInformation.getDirection()){
                case "N":  {resultPosition.setY(Math.min(moveInformation.getY()+1, yMax)); break;}
                case "S":  {resultPosition.setY(Math.max(moveInformation.getY()-1, 0)); break;}
                case "E":  {resultPosition.setX(Math.min(moveInformation.getX()+1, xMax)); break;}
                case "W":  {resultPosition.setX(Math.max(moveInformation.getX()-1, 0)); break;}
        }
        return  resultPosition;
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
