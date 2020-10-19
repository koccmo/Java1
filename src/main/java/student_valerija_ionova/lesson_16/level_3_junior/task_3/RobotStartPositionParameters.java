package student_valerija_ionova.lesson_16.level_3_junior.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotStartPositionParameters {

    private MoveInformation moveInformation;
    private String moves;

    RobotStartPositionParameters (MoveInformation moveInformation, String moves){
        this.moveInformation = moveInformation;
        this.moves = moves;
    }

    MoveInformation getMoveInformation (){
        return moveInformation;
    }

    String getMoves (){
        return moves;
    }
}
