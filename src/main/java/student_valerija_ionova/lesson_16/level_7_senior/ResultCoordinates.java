package student_valerija_ionova.lesson_16.level_7_senior;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ResultCoordinates {

    private int x;
    private int h;

    ResultCoordinates (int x, int h){
        this.x = x;
        this.h = h;
    }

    int getH(){
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultCoordinates that = (ResultCoordinates) o;
        return x == that.x &&
                h == that.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, h);
    }

    @Override
    public String toString() {
        return "ResultCoordinates{" +
                "x=" + x +
                ", h=" + h +
                '}';
    }
}
