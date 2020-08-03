package student_valerija_ionova.lesson_9.level_x.super_task_1;

public class Field {

    int [][] field;

    void createNewField() {
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};

        this.field = field;

    };

    void printField(int [][] field){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean freePlace(int [][] field, int x){
        return (field[0][x] == 0);
    }

    boolean fullField(int [][] field){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (field[i][j] == 0) return false;
            }
        }
        return true;
    }

    int [][] getField(){
        return field;
    }

}
