package student_igors_bartkevics.lesson_8.homework.level_3.task_13;

class Samsung extends TV {
    String tizenVersion;
    public Samsung(String manufacturer, String model, int sizeOfDiagonal) {
        super(manufacturer, model, sizeOfDiagonal);
    }

    public String getTizenVersion() {
        return tizenVersion;
    }

    public void setTizenVersion(String tizenVersion) {
        this.tizenVersion = tizenVersion;
    }
}
