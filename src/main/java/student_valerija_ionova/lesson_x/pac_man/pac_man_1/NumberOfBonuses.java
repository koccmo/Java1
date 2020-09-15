package student_valerija_ionova.lesson_x.pac_man.pac_man_1;

class NumberOfBonuses {

    public static void main (String [] args){

        GameField gameField = new GameField();
        gameField.createNewFieldManually();

        System.out.println("Number of Bonuses at start: "+ gameField.numberOfBonuses());

    }

}
