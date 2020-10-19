package student_valerija_ionova.lesson_16.level_1_2.task_1_2;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MoveLogic {

    int xMax;
    int yMax;
    private MoveInformation startPosition;
    private String moves;

    MoveLogic (String xyMax, MoveInformation moveInformation, String moves){
        this.xMax = Integer.parseInt(xyMax.split(" ")[0]);
        this.yMax = Integer.parseInt(xyMax.split(" ")[1]);
        this.startPosition = moveInformation;
        this.moves = moves;
    }

    MoveInformation marsRoverMovement (){
        MoveInformation resultPosition = startPosition;
        String [] movesArray = moves.split("");
        for (int i = 0; i < movesArray.length; i ++){
            resultPosition = getNextPosition (resultPosition, movesArray[i]);
        }

        return resultPosition;
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
