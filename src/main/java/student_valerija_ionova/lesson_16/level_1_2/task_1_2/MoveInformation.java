package student_valerija_ionova.lesson_16.level_1_2.task_1_2;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MoveInformation {

    private int x;

    private int y;
    private String direction;

    MoveInformation (String info){
        this.x = Integer.parseInt(info.split(" ")[0]);
        this.y = Integer.parseInt(info.split(" ")[1]);
        this.direction = info.split(" ")[2];
    }

    int getX (){
        return x;
    }

    int getY (){
        return y;
    }

    String getDirection (){
        return direction;
    }

    void setX (int x){
        this.x = x;
    }

    void setY (int y){
        this.y = y;
    }

    void setDirection (String direction){
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveInformation that = (MoveInformation) o;
        return x == that.x &&
                y == that.y &&
                Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    @Override
    public String toString() {
        return "MoveInformation{" +
                "x=" + x +
                ", y=" + y +
                ", direction='" + direction + '\'' +
                '}';
    }
}
