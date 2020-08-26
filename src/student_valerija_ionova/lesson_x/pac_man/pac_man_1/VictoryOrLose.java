package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class VictoryOrLose {

    boolean lose (MoveInformation pacManMoveInformation, MoveInformation monster1,
                          MoveInformation monster2, MoveInformation monster3){

        return (pacManMoveInformation.getCoordinates().equals(monster1.getCoordinates()) ||
                pacManMoveInformation.getCoordinates().equals(monster2.getCoordinates()) ||
                pacManMoveInformation.getCoordinates().equals(monster3.getCoordinates()));

    }

    boolean win (GameField field){

        return (field.gameEndNoBonuses());

    }

}
