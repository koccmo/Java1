package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

class File  {

    private String name;
    private int size = 5;
    private String extension = ".";
    private int unitID;

    public File(String name, VirtualHardDisk hardDisk, int size, String fileExtension){
        this.name = name;
        this.size += size;
        this.extension += fileExtension;
    }

    public int getUnitID() {
        return unitID;
    }

    void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getSize() {
        return size;
    }
}
