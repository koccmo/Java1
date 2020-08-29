package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class VictoryOrLose {

    boolean lose (MoveInformation pacManMoveInformation, MoveInformation [] monstersArray){

        for (MoveInformation info : monstersArray){
            if (pacManMoveInformation.getCoordinates().equals(info.getCoordinates())){
                return true;
            }
        }

        return false;

    }

    boolean win (GameField field){

        return (field.gameEndNoBonuses());

    }

}
