package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InputCoordinates {

    int [] coordinates = new int [3];

    InputCoordinates (int xL, int xR, int H){
        this.coordinates[0] = xL;
        this.coordinates[1] = xR;
        this.coordinates[2] = H;
    }

    int getXLeft (){
        return coordinates[0];
    }

    int getXRight (){
        return coordinates[1];
    }

    int getHeight (){
        return coordinates[2];
    }

    void update (int xL, int xR, int H){
        this.coordinates[0] = xL;
        this.coordinates[1] = xR;
        this.coordinates[2] = H;
    }

    @Override
    public String toString() {
        return "InputCoordinates{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
