package student_valerija_ionova.lesson_13.level_4_junior;

class GameOfLifeConsoleUIImpl implements GameOfLifeConsoleUI{


    @Override
    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                if (field[i][j]){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
