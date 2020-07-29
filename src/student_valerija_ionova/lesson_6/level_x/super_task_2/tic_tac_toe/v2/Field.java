package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe.v2;

class Field {

    int [][] field;

    int [][] getField(){
        return field;
    }

    void createNewField(){
        int [][] newField= new int [][] {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        this.field =  newField;
    }

    public void printFieldToConsole(int[][] field){
        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean freePlace(int x, int y){
        return (field[x][y] == -1);
    }

}
