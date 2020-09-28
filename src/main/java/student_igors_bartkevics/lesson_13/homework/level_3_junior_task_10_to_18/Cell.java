package student_igors_bartkevics.lesson_13.homework.level_3_junior_task_10_to_18;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Cell {
    private int coordinateX;
    private int getCoordinateY;


    @CodeReviewComment(teacher = "Unused property!")
    private boolean state;

    public Cell(int coordinateX, int getCoordinateY) {
        this.coordinateX = coordinateX;
        this.getCoordinateY = getCoordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getGetCoordinateY() {
        return getCoordinateY;
    }

    public boolean isState() {
        return state;
    }
}
