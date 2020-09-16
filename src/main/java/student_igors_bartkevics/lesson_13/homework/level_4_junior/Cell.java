package student_igors_bartkevics.lesson_13.homework.level_4_junior;

class Cell {
    private int coordinateX;
    private int getCoordinateY;
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
